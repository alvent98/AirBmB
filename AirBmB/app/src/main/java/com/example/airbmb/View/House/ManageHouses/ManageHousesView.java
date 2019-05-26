package com.example.airbmb.View.House.ManageHouses;

import java.util.ArrayList;
import com.example.airbmb.Model.House;

/**
 * Manage House View
 */
public interface ManageHousesView
{
    /**
     * When the user clicks the House with id uid,
     * the user is transfered to the activity HouseDetailsActivity
     * @param uid House's unique id
     */
	void clickHouse(int uid);

    /**
     * Activity AddEditHouseActivity starts
     */
    void startAddNew();

    /**
     * A list with the Houses is loaded
     * @param input the list that is loaded
     */
    void loadSource(ArrayList<House> input);

    /**
     * Sets the page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * Shows a toast
     * @param value the message that is shown
     */
    void showToast(String value);

}
