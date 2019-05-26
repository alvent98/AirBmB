package com.example.airbmb.View.Owner.AddEditOwner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import project_airbmb.airbmb.R;

import android.app.AlertDialog;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;
import com.example.airbmb.DaoMemory.OwnerDAOMemory;
import com.example.airbmb.View.User.AddEditUserView;

public class AddEditOwnerActivity extends AppCompatActivity implements AddEditUserView {

    public void showErrorMessage(String title, String message) {
        new AlertDialog.Builder(AddEditOwnerActivity.this)
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

    @Override
    public int getAttachedUserId() {
        return this.getIntent().hasExtra("owner_id") ? this.getIntent().getExtras().getInt("owner_id") : null;
    }

    public String getFirstName(){
        return ((EditText)findViewById(R.id.edit_text_first_name)).getText().toString().trim();
    }

    public String getLastName(){
        return ((EditText)findViewById(R.id.edit_text_last_name)).getText().toString().trim();
    }

    public String getEmail() {
        return ((EditText)findViewById(R.id.edit_text_email)).getText().toString().trim();
    }

    @Override
   public String getIBAN() {
	    return ((EditText)findViewById(R.id.edit_text_iban)).getText().toString().trim();
    }

    public String getUsername() {
        return ((EditText)findViewById(R.id.edit_text_username)).getText().toString().trim();
    }

	public String getPassword() {
	    return ((EditText)findViewById(R.id.edit_text_password)).getText().toString().trim();
    }

    public Integer getAttachedOwnerID() {
        return this.getIntent().hasExtra("publisher_id") ? this.getIntent().getExtras().getInt("owner_id") : null;
    }

    public void setFirstName(String value) {
        ((EditText)findViewById(R.id.edit_text_first_name)).setText(value);
	}

    public void setLastName(String value) {
        ((EditText)findViewById(R.id.edit_text_last_name)).setText(value);
	}

    public void setEmail(String value) {
        ((EditText)findViewById(R.id.edit_text_email)).setText(value);
	}

    @Override
    public void setIBAN(String value) {
        ((EditText)findViewById(R.id.edit_text_iban)).setText(value);
 	}

	public void setUsername(String value) {
        ((EditText)findViewById(R.id.edit_text_username)).setText(value);
    }

    public void setPassword(String value) {
        ((EditText)findViewById(R.id.edit_text_password)).setText(value);
    }

    public void setPageName(String value) {
        getSupportActionBar().setTitle(value);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_owner);
        final AddEditOwnerPresenter presenter = new AddEditOwnerPresenter(this,new OwnerDAOMemory());

        findViewById(R.id.complete_registration_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onSaveOwner();
            }
        });
    }

}
