package com.example.airbmb.View.House.AddEditHouse;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.airbmb.DaoMemory.HouseDAOMemory;
import com.example.airbmb.Model.Owner;
import project_airbmb.airbmb.R;

public class AddEditHouseActivity extends AppCompatActivity implements AddEditHouseView
{
    public void showErrorMessage(String title, String message)
    {
        new AlertDialog.Builder(AddEditHouseActivity.this)
                .setCancelable(true)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(R.string.app_name, null).create().show();
    }

    public void successfullyFinishActivity(String message)
    {
        Intent retData = new Intent();
        retData.putExtra("message_to_toast", message);
        setResult(RESULT_OK, retData);
        finish();
    }

    public String getCity() {
        return ((EditText) findViewById(R.id.edit_text_city)).getText().toString().trim();
    }

    public String getStreet(){
        return ((EditText)findViewById(R.id.edit_text_street)).getText().toString().trim();
    }

    public int getNumber(){
        return  Integer.parseInt(((EditText)findViewById(R.id.edit_text_number)).getText().toString().trim());
    }

    public int getArea() {
	      return Integer.parseInt(((EditText)findViewById(R.id.edit_text_area)).getText().toString().trim());
    }

    public int getRooms() {
        return Integer.parseInt(((EditText)findViewById(R.id.edit_text_rooms)).getText().toString().trim());
    }

    public int getPrice(){
        return Integer.parseInt(((EditText)findViewById(R.id.edit_text_price)).getText().toString().trim());
    }

    public int getFloor() {
        return Integer.parseInt(((EditText)findViewById(R.id.edit_text_floors)).getText().toString().trim());
    }

    public Integer getAttachedHouseID(){
        return this.getIntent().hasExtra("house_id") ? this.getIntent().getExtras().getInt("house_id") : null;
    }

    public Owner getOwner(){
        return null;
    }

    public void setId(int id) {
        ((EditText)findViewById(R.id.edit_text_floors)).setText(id);

    }

    public void setCity(String value){
        ((EditText)findViewById(R.id.edit_text_city)).setText(value);
    }

    public void setStreet(String value) {
        ((EditText)findViewById(R.id.edit_text_street)).setText(value);
    }

    public void setNumber(int value) {
        ((EditText)findViewById(R.id.edit_text_number)).setText(value);
    }

    public void setArea(int value){
        ((EditText)findViewById(R.id.edit_text_area)).setText(value);
    }

    public void setRooms(int value){
        ((EditText)findViewById(R.id.edit_text_rooms)).setText(value);
    }

    public void setPrice(int value){
        ((EditText)findViewById(R.id.edit_text_price)).setText(value);
    }

    public void setFloor(int value){
        ((EditText)findViewById(R.id.edit_text_floors)).setText(value);
    }

    public void setOwner(Owner owner){
        ((EditText)findViewById(R.id.edit_text_floors)).setText((CharSequence) owner);
    }

    public void setPageName(String value){
        getSupportActionBar().setTitle(value);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_house2);
        final AddEditHousePresenter presenter = new AddEditHousePresenter(this, new HouseDAOMemory());

        findViewById(R.id.complete_registration_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onSaveHouse();
            }
        });

        setPageName("AirBmB Add House");
    }
}