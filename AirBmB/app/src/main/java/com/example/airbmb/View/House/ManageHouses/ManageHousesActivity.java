package com.example.airbmb.View.House.ManageHouses;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Model.House;
import project_airbmb.airbmb.R;
import com.example.airbmb.DaoMemory.HouseDAOMemory;
import com.example.airbmb.View.House.AddEditHouse.AddEditHouseActivity;
import com.example.airbmb.View.House.HouseDetails.HouseDetailsActivity;
import com.example.airbmb.View.AdvancedListAdapter;

public class ManageHousesActivity extends AppCompatActivity implements ManageHousesView, SearchView.OnQueryTextListener
{
    ManageHousesPresenter presenter;

    private ListView houseListView;
    private SearchView searchListView;
    private AdvancedListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_items);

        adapter = new AdvancedListAdapter(this);

        houseListView = (ListView) findViewById(R.id.house_list_view);
        houseListView.setAdapter(adapter);
        houseListView.setTextFilterEnabled(true);

        searchListView = (SearchView) findViewById(R.id.houses_list_search_view);
        searchListView.setIconifiedByDefault(false);
        searchListView.setOnQueryTextListener(this);

        presenter = new ManageHousesPresenter(this, new HouseDAOMemory());

        findViewById(R.id.item_add_new).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                presenter.onStartAddNew();
            }
        });

        houseListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                presenter.onClickItem(((House)parent.getHouseAtPosition(position)).getUID());
            }
        });
    }

    public boolean onQueryTextChange(String text)
    {
        if (TextUtils.isEmpty(text))
            houseListView.clearTextFilter();
        else
            houseListView.setFilterText(text);

        return true;
    }

    public boolean onQueryTextSubmit(String query){
        return false;
    }

    private void clear_search_bar()
    {
        searchListView.setQuery("", false);
        searchListView.clearFocus();
        presenter.onLoadSource();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0 && resultCode == Activity.RESULT_OK)
        {
            clear_search_bar();
            presenter.onShowToast(data.getStringExtra("message_to_toast"));
        }
        else if(requestCode == 1)
        {
            clear_search_bar();

            if(resultCode == Activity.RESULT_OK)
                presenter.onShowToast(data.getStringExtra("message_to_toast"));
        }
    }

    public void loadSource(List<House> input){
        adapter.loadSource(input);
    }

    public void clickItem(int uid)
    {
        Intent intent = new Intent(this, HouseDetailsActivity.class);
        intent.putExtra("house_id", uid);
        startActivityForResult(intent, 1);
    }

    public void clickHouseList(int uid)
    {
        Intent intent = new Intent(this, ManageHousesActivity.class);
        intent.putExtra("house_id", uid);
        startActivityForResult(intent, 1);
    }

    public void clickHouse(int uid) {
        Intent intent = new Intent(this, AddEditHouseActivity.class);
        intent.putExtra("house_id", uid);
        startActivityForResult(intent, 1);
    }

    public void startAddNew()
    {
        Intent intent = new Intent(this, AddEditHouseActivity.class);
        startActivityForResult(intent, 0);
    }

    @Override
    public void loadSource(ArrayList<House> input) {

    }

    public void showToast(String value){
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }

    public void setPageName(String value){
        getSupportActionBar().setTitle(value);
    }

    public boolean shouldLoadItemsOnClick(){
        return this.getIntent().hasExtra("should_load_items");
    }
}