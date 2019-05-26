package com.example.airbmb.View.Renter.ManageRenters;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Renter;

/**
 * Manage Renters Presenter
 */
public class ManageRentersPresenter
{
    private ManageRentersView view;
    private RenterDAO renters;

    /**
     * returns a list with renter's details
     * @param renters list of renters
     * @return a list with renter's details
     */
    private ArrayList<Renter> createDataSource(List<Renter> renters)
    {
        ArrayList<Renter> data = new ArrayList<>();

        for(Renter renter : renters)
        	data.add(new Renter(renter.getFirstName(),renter.getLastName(),renter.getEmail(),renter.getIBAN(),
        			renter.getUsername(),renter.getPassword()));

        return data;
    }

    /**
     * Presenter initialised
     * @param view view instance
     * @param renters renter instance
     */
    public ManageRentersPresenter(ManageRentersView view, RenterDAO renters)
    {
        this.view = view;
        this.renters = renters;

        onLoadSource();
    }

    /**
     * When the user clicks on Renter's id,
     * the user is transfered to activity RentersDetailsAcitivity
     * @param uid renter's unique id
     */
    public void onClickItem(int uid)
    {
    	if(view.shouldLoadLeasesOnClick()) 
    		view.clickItemLeases(uid);
    	else 
    		view.clickItem(uid);
    }

    /**
     * Starts activity RentersDetailsAcitivity
     */
    void onStartAddNew()
    {
        view.startAddNew();
    }

    /**
     * Shows a toast message
     * @param value message
     */
    void onShowToast(String value)
    {
        view.showToast(value);
    }

    /**
     * Loads list of renters
     */
    void onLoadSource()
    {
        view.loadSource(createDataSource(renters.findAll()));
    }
}
