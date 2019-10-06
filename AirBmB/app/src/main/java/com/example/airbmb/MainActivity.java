package com.example.airbmb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.airbmb.View.House.ManageHouses.ManageHousesActivity;
import com.example.airbmb.View.Lease.ManageLeases.ManageLeasesActivity;
import com.example.airbmb.View.Owner.ManageOwners.ManageOwnersActivity;
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

        //Manage Renters Button
        ManageRenters = (Button) findViewById(R.id.manage_renters_button);
        ManageRenters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageRenters();
            }
        });

        //Manage Houses Button
        ManageHouses = (Button) findViewById(R.id.manage_houses_button);
        ManageHouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageHouses();
            }
        });

        //Manage Leases Button
        ManageLeases = (Button) findViewById(R.id.manage_leases_button);
        ManageLeases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageLeases();
            }
        });

        //Manage Owners Button
        ManageOwners = (Button) findViewById(R.id.manage_owners_button);
        ManageOwners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManageOwners();
            }
        });
    }

    public void openManageRenters(){
        Intent intent = new Intent(this,ManageRentersActivity.class);
        startActivity(intent);
    }

    public void openManageHouses(){
        Intent intent =new Intent(this,ManageHousesActivity.class);
        startActivity(intent);
    }

    public void openManageLeases(){
        Intent intent =new Intent(this,ManageLeasesActivity.class);
        startActivity(intent);
    }

    public void openManageOwners(){
        Intent intent =new Intent(this,ManageOwnersActivity.class);
        startActivity(intent);
    }
}
