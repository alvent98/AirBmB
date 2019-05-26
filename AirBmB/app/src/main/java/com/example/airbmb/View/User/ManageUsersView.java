package com.example.airbmb.View.User;

/**
 * Manage User View
 */
public interface ManageUsersView
{
    /**
     * When the user clicks the User with id uid,
     * the user is transfered to an activity
     * @param uid User's unique id
     */
    void clickItem(int uid);

    void clickItemLeases(int uid);

    /**
     * Starts an activity
     */
    void startAddNew();

    boolean shouldLoadLeasesOnClick();

    /**
     * Shows a toast message
     * @param value message
     */
    void showToast(String value);    
}
