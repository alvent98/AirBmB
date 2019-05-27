package com.example.airbmb.View.Owner.OwnerDetails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import project_airbmb.airbmb.R;
import com.example.airbmb.DaoMemory.OwnerDAOMemory;
import com.example.airbmb.View.House.ManageHouses.ManageHousesActivity;
import com.example.airbmb.View.Owner.AddEditOwner.AddEditOwnerActivity;
import com.example.airbmb.View.User.UserDetailsView;

/**
 *
 */
public class OwnerDetailsActivity extends AppCompatActivity implements UserDetailsView
{
    OwnerDetailsPresenter presenter;

    public void startShowHouses(int ownerID)
    {
        Intent intent = new Intent(this, ManageHousesActivity.class);
        startActivityForResult(intent, 100);
    }

    //Possibly we don't need it.
    public void startEdit(int authorID)
    {
        Intent intent = new Intent(this, AddEditOwnerActivity.class);
		  //Second argument must be replaced or removed, don't know.
        intent.putExtra("owner_id", authorID);
        startActivityForResult(intent, 2);
    }

    @Override
    public void startDelete(String title, String msg) {

    }

    @Override
    public void doDeleteAndFinish(String msg) {

    }

    public int getAttachedUserId(){
        return this.getIntent().hasExtra("owner_id") ? this.getIntent().getExtras().getInt("owner_id") : null;
    }

    public void setId(int value) {
        ((TextView)findViewById(R.id.text_user_id)).setText(value);
    }

public void setFirstName(String value) {
((TextView)findViewById(R.id.text_first_name)).setText(value);
}

public void setLastName(String value) {
((TextView)findViewById(R.id.text_last_name)).setText(value);
}

public void setEmail(String value) {
((TextView)findViewById(R.id.text_email)).setText(value);
}

public void setIBAN(String value) {
((TextView)findViewById(R.id.text_iban)).setText(value);
}

public void setUsername(String value) {
((TextView)findViewById(R.id.text_username)).setText(value);
}

public void setPassword(String value) {
((TextView)findViewById(R.id.text_password)).setText(value);
}

    public void setPageName(String value) {
        getSupportActionBar().setTitle(value);
    }

    public void showToast(String value) {
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_details);
        presenter = new OwnerDetailsPresenter(this, new OwnerDAOMemory());

        findViewById(R.id.edit_user_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                presenter.onStartEditButtonClick();
            }
        });

        findViewById(R.id.display_owners_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                presenter.onStartShowHousesButtonClick();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2 && resultCode == Activity.RESULT_OK)
        {
            recreate();
            presenter.onShowToast(data.getStringExtra("message_to_toast"));
        }
        else if(requestCode == 100)
            recreate();
    }
}
