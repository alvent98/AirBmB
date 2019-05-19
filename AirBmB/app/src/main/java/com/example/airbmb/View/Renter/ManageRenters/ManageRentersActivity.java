package com.example.airbmb.View.Renter.ManageRenters;
//package com.example.airbmb.View.Renter.ManageRenters;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.SearchView;
//import android.widget.Toast;
//
//import java.util.List;
//
//import com.mgiandia.library.R;
//import com.mgiandia.library.memorydao.PublisherDAOMemory;
//import com.mgiandia.library.util.Quadruple;
//import com.mgiandia.library.view.Publisher.AddPublisher.AddEditPublisherActivity;
//import com.mgiandia.library.view.Publisher.PublisherDetails.PublisherDetailsActivity;
//import com.mgiandia.library.view.Util.AdvancedListAdapter;
//*/
//
///**
// * @author �?ίκος Σα�?αντιν�?ς
// *
// * Υλοποιήθηκε στα πλαίσια του μαθήματος Τεχνολογία Λογισμικο�? το έτος 2016-2017 υπ�? την επίβλε�?η του Δ�?. Βασίλη Ζαφεί�?η.
// *
// */
//
//public class ManagePublishersActivity extends AppCompatActivity implements ManagePublishersView, SearchView.OnQueryTextListener
//{
//    ManagePublishersPresenter presenter;
//
//    private ListView itemListView;
//    private SearchView searchListView;
//    private AdvancedListAdapter adapter;
//
//    /**
//     * Δημιου�?γεί το layout και α�?χικοποιεί
//     * το activity.
//     * @param savedInstanceState το Instance state
//     */
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.manage_items);
//
//        adapter = new AdvancedListAdapter(this);
//
//        itemListView = (ListView) findViewById(R.id.item_list_view);
//        itemListView.setAdapter(adapter);
//        itemListView.setTextFilterEnabled(true);
//
//        searchListView = (SearchView) findViewById(R.id.items_list_search_view);
//        searchListView.setIconifiedByDefault(false);
//        searchListView.setOnQueryTextListener(this);
//
//        presenter = new ManagePublishersPresenter(this, new PublisherDAOMemory());
//
//        findViewById(R.id.item_add_new).setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                presenter.onStartAddNew();
//            }
//        });
//
//        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
//            {
//                presenter.onClickItem(((Quadruple)parent.getItemAtPosition(position)).getUID());
//            }
//        });
//    }
//
//    /**
//     * Τ�?οποποιεί το κείμενο του εκδ�?τη.
//     * @param text Το κείμενο που θα τ�?οποποιηθεί
//     * @return true
//     */
//    public boolean onQueryTextChange(String text)
//    {
//        if (TextUtils.isEmpty(text))
//            itemListView.clearTextFilter();
//        else
//            itemListView.setFilterText(text);
//
//        return true;
//    }
//
//    /**
//     * Υποβάλλει το κείμενο του εκδ�?τη.
//     * @param query �?έτει το κείμενο ως query
//     * @return false
//     */
//    public boolean onQueryTextSubmit(String query)
//    {
//        return false;
//    }
//
//    /**
//     * Αδειάζει το κείμενο που β�?ίσκεται
//     * μέσα στην μπά�?α αναζήτησης.
//     */
//    private void clear_search_bar()
//    {
//        searchListView.setQuery("", false);
//        searchListView.clearFocus();
//        presenter.onLoadSource();
//    }
//
//    /**
//     * Αδειάζει την μπά�?α αναζήτησης
//     * @param requestCode �? ζητο�?μενος κωδικ�?ς
//     * @param resultCode �? κωδικ�?ς του αποτελέσματος
//     * @param data Το intent
//     */
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data)
//    {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == 0 && resultCode == Activity.RESULT_OK)
//        {
//            clear_search_bar();
//            presenter.onShowToast(data.getStringExtra("message_to_toast"));
//        }
//        else if(requestCode == 1)
//        {
//            clear_search_bar();
//
//            if(resultCode == Activity.RESULT_OK)
//                presenter.onShowToast(data.getStringExtra("message_to_toast"));
//        }
//    }
//
//    /**
//     * Φο�?τ�?νει την λίστα με τους εκδ�?τες.
//     * @param input Η λίστα που θα φο�?τ�?σει
//     */
//    public void loadSource(List<Quadruple> input)
//    {
//        adapter.loadSource(input);
//    }
//
//    /**
//     * �?εταφέ�?ει τον χ�?ήστη στο activity PublisherDetailsActivity
//     * �?ταν γίνει click πάνω στον εκδ�?τη με id uid.
//     * @param uid Το μοναδικ�? id του εκδ�?τη
//     */
//    public void clickItem(int uid)
//    {
//        Intent intent = new Intent(this, PublisherDetailsActivity.class);
//        intent.putExtra("publisher_id", uid);
//        startActivityForResult(intent, 1);
//    }
//
//    /**
//     * �?εκινάει το activity AddEditPublisherActivity
//     */
//    public void startAddNew()
//    {
//        Intent intent = new Intent(this, AddEditPublisherActivity.class);
//        startActivityForResult(intent, 0);
//    }
//
//    /**
//     * Εμφανίζει ένα Toast.
//     * @param value Το πε�?ιεχ�?μενο που θα εμφανιστεί
//     */
//    public void showToast(String value)
//    {
//        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
//    }
//}*/
