package com.example.airbmb.View.House.HouseDetails;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.View;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.List;
//
//import com.example.airbmb.R;
//import com.example.airbmb.DaoMemory.HouseDAOMemory;
//import com.example.airbmb.View.House.AddEditHouse.AddEditHouseActivity;
//
//public class HouseDetailsActivity extends AppCompatActivity implements HouseDetailsView
//{
//    HouseDetailsPresenter presenter;

//    public void startEdit(int houseID)
//    {
//        Intent intent = new Intent(this, AddEditHouseActivity.class);
//        intent.putExtra("house_id", houseID);
//        startActivityForResult(intent, 2);
//    }

//public Integer getAttachedHouseID()
//return this.getIntent().hasExtra("house_id") ? this.getIntent().getExtras().getString("house_id") : null;

//public void setHouseId(String value)
//  ((TextView)findViewById(R.id.text_house_id)).setText(value);

//public void setCity(String value)
//  ((TextView)findViewById(R.id.text_city)).setText(value);

//public void setStreet(String value)
//  ((TextView)findViewById(R.id.text_street)).setText(value);

//public void setArea(int value)
//  ((TextView)findViewById(R.id.text_area)).setText(value);

//public void setRooms(String value)
//  ((TextView)findViewById(R.id.text_rooms)).setText(value);

//public void setPrice(int value)
//  ((TextView)findViewById(R.id.text_price)).setText(value);

//public void setFloors(String value)
//  ((TextView)findViewById(R.id.text_floors)).setText(value);
//
//public void setPageName(String value)
//  getSupportActionBar().setTitle(value); //Possibly set Title is from another world (DC or Marvel, don't know)

//    public void showToast(String value)
//        Toast.makeText(this, value, Toast.LENGTH_LONG).show();

//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_house_details);
//        presenter = new HouseDetailsPresenter(this, new HouseDAOMemory());
//
//        findViewById(R.id.edit_house_button).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v)
//            {
//                presenter.onStartEditButtonClick();
//            }
//        });
//    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data)
//    {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == 2 && resultCode == Activity.RESULT_OK)
//        {
//            recreate();
//            presenter.onShowToast(data.getStringExtra("message_to_toast"));
//        }
//        else if(requestCode == 100)
//            recreate();
//    }

//    private TextView create_plain_text_view(String text, double weight, int color_resource)
//    {
//        TextView tx = new TextView(this);
//        tx.setText(text);
//        tx.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT, (float)weight));
//        tx.setGravity(Gravity.LEFT);
//        tx.setMaxLines(1);
//        tx.setTextColor(getResources().getColor(color_resource));
//        tx.setTextSize(16);
//        tx.setPadding(12, 12, 12, 12);
//
//        return tx;
//    }
//
      //We possibly don't need this, maybe we need it, altered.
//    private TableRow add_author_to_table(String title, String details)
//    {
//        TableRow tr = new TableRow(this);
//        tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
//        tr.setWeightSum(7);
//
//        tr.addView(create_plain_text_view(title, 3, R.color.colorWhite));
//        tr.addView(create_plain_text_view(details, 4, R.color.colorSemiWhite));
//
//        return tr;
//    }
//}
