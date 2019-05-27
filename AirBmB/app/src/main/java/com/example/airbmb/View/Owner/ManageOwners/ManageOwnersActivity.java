package com.example.airbmb.View.Owner.ManageOwners;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Model.Owner;
import project_airbmb.airbmb.R;
import com.example.airbmb.DaoMemory.OwnerDAOMemory;
import com.example.airbmb.View.Owner.AddEditOwner.AddEditOwnerActivity;
import com.example.airbmb.View.Owner.OwnerDetails.OwnerDetailsActivity;
import com.example.airbmb.View.Owner.AdvancedListAdapter;

public class ManageOwnersActivity extends AppCompatActivity implements ManageOwnersView, SearchView.OnQueryTextListener
{
    ManageOwnersPresenter presenter;

    private ListView ownerListView;
    private SearchView searchListView;
    private AdvancedListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_owners);

        adapter = new AdvancedListAdapter(this);

        ownerListView = (ListView) findViewById(R.id.owner_list_view);
        ownerListView.setAdapter(adapter);
        ownerListView.setTextFilterEnabled(true);

        searchListView = (SearchView) findViewById(R.id.owners_list_search_view);
        searchListView.setIconifiedByDefault(false);
        searchListView.setOnQueryTextListener(this);

        presenter = new ManageOwnersPresenter(this, new OwnerDAOMemory());

        findViewById(R.id.owner_add_new).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                presenter.onStartAddNew();
            }
        });

        ownerListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                presenter.onClickItem(((Owner)parent.getItemAtPosition(position)).getId());
            }
        });
    }

    public boolean onQueryTextChange(String text)
    {
        if (TextUtils.isEmpty(text))
            ownerListView.clearTextFilter();
        else
            ownerListView.setFilterText(text);

        return true;
    }

    public boolean onQueryTextSubmit(String query) { return false; }

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

    public void loadSource(List<Owner> input) { adapter.loadSource(input); }

    public void clickItem(int uid)
    {
        Intent intent = new Intent(this, OwnerDetailsActivity.class);
        intent.putExtra("owner_id", uid);
        startActivityForResult(intent, 1);
    }

    @Override
    public void clickItemLeases(int uid) {

    }

    public void startAddNew()
    {
        Intent intent = new Intent(this, AddEditOwnerActivity.class);
        startActivityForResult(intent, 0);
    }

    @Override
    public boolean shouldLoadLeasesOnClick() {
        return false;
    }

    public void showToast(String value)
    {
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadSource(ArrayList<Owner> input) {

    }
}