package com.example.airbmb.View.User;

public interface ManageUsersView
{
    void clickItem(int uid);
    
    void clickItemLeases(int uid);

    void startAddNew();
    
    boolean shouldLoadLeasesOnClick();    

    void showToast(String value);    
}
