package com.example.airbmb.View.HomePage;

import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.airbmb.DaoMemory.MemoryInitializer;
import com.example.airbmb.View.House.ManageHouses.ManageHousesActivity;
import com.example.airbmb.View.Lease.ManageLeases.ManageLeasesActivity;
import com.example.airbmb.View.Owner.ManageOwners.ManageOwnersActivity;
import com.example.airbmb.View.Renter.ManageRenters.ManageRentersActivity;

import project_airbmb.airbmb.R;

public class HomePageActivity extends AppCompatActivity implements HomePageView {

    private static boolean initialized = false;

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final HomePagePresenter presenter = new HomePagePresenter(this);

        findViewById(R.id.manage_renters_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onManageRenters();
            }
        });

        findViewById(R.id.manage_houses_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onManageHouses();
            }
        });

        findViewById(R.id.manage_owners_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onManageOwners();
            }
        });

        findViewById(R.id.manage_owners_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                presenter.onManageLeases();
            }
        });
        
        if(!initialized)
        {
            new MemoryInitializer().prepareData();
            initialized = true;
        }
    }

    public void manageRenters()
    {
        Intent intent = new Intent(HomePageActivity.this, ManageRentersActivity.class);
        startActivity(intent);
    }

    public void manageHouses()
    {
        Intent intent = new Intent(HomePageActivity.this, ManageHousesActivity.class);
        startActivity(intent);
    }

    public void manageOwners()
    {
        Intent intent = new Intent(HomePageActivity.this, ManageOwnersActivity.class);
        startActivity(intent);
    }

    public void manageLeases()
    {
        Intent intent = new Intent(HomePageActivity.this, ManageLeasesActivity.class);
        intent.putExtra("should_load_Leases", 1);
        startActivity(intent);
    }
}
