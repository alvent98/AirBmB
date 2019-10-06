package com.example.airbmb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.airbmb.View.Renter.ManageRenters.ManageRentersActivity;

import project_airbmb.airbmb.R;

public class MainActivity extends AppCompatActivity {
    private Button ManageRenters;
    private Button ManageHouses;
    private Button ManageLeases;
    private Button ManageOwners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ManageRenters = (Button) findViewById(R.id.manage_renters_button);
        ManageRenters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageRenters();
            }
        });
    }

    public void openManageRenters(){
        Intent intent = new Intent(this,ManageRentersActivity.class);
        startActivity(intent);
    }
}
