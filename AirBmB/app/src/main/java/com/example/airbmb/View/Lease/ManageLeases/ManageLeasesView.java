package com.example.airbmb.View.Lease.ManageLeases;

import java.util.ArrayList;

import com.example.airbmb.Model.Lease;

/**
 * Manage Leases View
 */
public interface ManageLeasesView
{
    /**
     * Loads the list of leases
     * @param input list of leases
     */
    void loadSource(ArrayList<Lease> input);

    /**
     * Starts activity AddLeasesActivity
     * @param uid
     */
    void startAddNew(int uid);

    /**
     * Shows an alert message
     * @param title title of the message
     * @param message message
     */
    void showAlert(String title, String message);

    /**
     * Shows a toast
     * @param value message
     */
    void showToast(String value);

    /**
     * Returns lease's unique id
     * @return lease's id
     */
    int getAttachedRenterID();

    /**
     * Sets page's name
     * @param value page's name
     */
    void setPageName(String value);
}
