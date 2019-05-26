package com.example.airbmb.View.House.ManageHouses;

import java.util.ArrayList;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

/**
 * Manage House Presenter
 */
public class ManageHousesPresenter
{
    private ManageHousesView view;

    private HouseDAO houses;

    /**
     * Creates the list with the Houses
     * @param houses list with houses
     * @return the list
     */
    private ArrayList<House> createDataSource(ArrayList<House> houses)
    {
        ArrayList<House> data = new ArrayList<>();

        for(House house : houses)
        	data.add(house);

        return data;
    }

    /**
     * Presenter initialised
     * @param view ManageAuthorsView
     * @param houses Houses
     */
    public ManageHousesPresenter(ManageHousesView view, HouseDAO houses)
    {
        this.view = view;
        this.houses = houses;
        view.setPageName("Houses: ");

        onLoadSource();
    }

    /**
     * When the user clicks the House with id uid,
     * the user is transfered to the activity HouseDetailsActivity
     * @param uid House's unique id
     */
    void onClickItem(int uid)
    {
        view.clickHouse(uid);
    }

    /**
     * Activity AddEditHouseActivity starts
     */
    void onStartAddNew()
    {
        view.startAddNew();
    }

    /**
     * Shows a toast
     * @param value the message that is shown
     */
    void onShowToast(String value)
    {
        view.showToast(value);
    }

    /**
     * A list with the Houses is loaded
     */
    void onLoadSource()
    {
        ArrayList<House> toReturn = houses.findAll();

        view.loadSource(createDataSource(toReturn));
    }
}
