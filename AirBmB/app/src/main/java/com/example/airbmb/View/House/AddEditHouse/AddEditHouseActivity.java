package com.example.airbmb.View.House.AddEditHouse;
//
//import android.app.AlertDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.EditText;
//import android.widget.Spinner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.example.airbmb.R;
//import com.example.airbmb.DaoMemory.HouseDAOMemory;
////import com.example.airbmb.View.Util.MultiSelectSpinner;
//
//public class AddEditHouseActivity extends AppCompatActivity implements AddEditHouseView
//{
//    public void showErrorMessage(String title, String message)
//    {
//        new AlertDialog.Builder(AddEditHouseActivity.this)
//                .setCancelable(true)
//                .setTitle(title)
//                .setMessage(message)
//                .setPositiveButton(R.string.ok, null).create().show();
//    }
//
//    public void successfullyFinishActivity(String message)
//    {
//        Intent retData = new Intent();
//        retData.putExtra("message_to_toast", message);
//        setResult(RESULT_OK, retData);
//        finish();
//    }
//
//    public String getCity()
//        return ((EditText)findViewById(R.id.edit_text_city)).getText().toString().trim();
//
//    public String getStreet()
//        return ((EditText)findViewById(R.id.edit_text_street)).getText().toString().trim();

//	  public void getArea()
//         return Integer.parseInt(((EditText)findViewById(R.id.edit_text_area)).getText().toString().trim());

//    public int getRooms()
//        return Integer.parseInt(((EditText)findViewById(R.id.edit_text_rooms)).getText().toString().trim());

//	  public int getPrice()
//  	  return Integer.parseInt(((EditText)findViewById(R.id.edit_text_price)).getText().toString().trim());

// 	  public int getFloors()
//  	  return Integer.parseInt(((EditText)findViewById(R.id.edit_text_floors)).getText().toString().trim());

//    public Integer getAttachedHouseID()
//        return this.getIntent().hasExtra("house_id") ? this.getIntent().getExtras().getString("house_id") : null;

//	  public void setHouseId(String value)
//        ((EditText)findViewById(R.id.edit_text_house_id)).setText(value);

//    public void setCity(String value)
//        ((EditText)findViewById(R.id.edit_text_city)).setText(value);

//    public void setStreet(String value)
//        ((EditText)findViewById(R.id.edit_text_street)).setText(value);

//    public void setArea(int value)
//        ((EditText)findViewById(R.id.edit_text_area)).setText(value);

//    public void setRooms(String value)
//        ((EditText)findViewById(R.id.edit_text_rooms)).setText(value);

//    public void setPrice(int value)
//        ((EditText)findViewById(R.id.edit_text_price)).setText(value);

//    public void setFloors(String value)
//        ((EditText)findViewById(R.id.edit_text_floors)).setText(value);
//
//    public void setPageName(String value)
//        getSupportActionBar().setTitle(value); //Possibly set Title is from another world (DC or Marvel, don't know)

//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_edit_house);
//        final AddEditHousePresenter presenter = new AddEditHousePresenter(this, new HouseDAOMemory());
//
//        findViewById(R.id.complete_registration_button).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                presenter.onSaveHouse();
//            }
//        });
//    }
//}