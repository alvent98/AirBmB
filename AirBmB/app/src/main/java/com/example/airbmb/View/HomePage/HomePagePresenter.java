package com.example.airbmb.View.HomePage;

public class HomePagePresenter
{
    private HomePageView view;

    public HomePagePresenter(HomePageView view)
    {
        this.view = view;
    }

    void onManageRenters()
    {
        view.manageRenters();
    }

    void onManageHouses()
    {
        view.manageHouses();
    }

    void onManageOwners()
    {
        view.manageOwners();
    }

    void onManageLeases()
    {
        view.manageLeases();
    }
}