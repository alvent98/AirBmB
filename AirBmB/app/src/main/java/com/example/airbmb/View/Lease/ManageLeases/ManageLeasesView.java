package com.example.airbmb.View.Lease.ManageLeases;

import java.util.ArrayList;

import com.example.airbmb.Model.Lease;

public interface ManageLeasesView
{
    void loadSource(ArrayList<Lease> input);

    void startAddNew(int uid);

    void showAlert(String title, String message);

    void showToast(String value);

    int getAttachedRenterID();

    void setPageName(String value);
}
