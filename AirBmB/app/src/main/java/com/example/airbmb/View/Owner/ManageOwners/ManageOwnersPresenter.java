package com.example.airbmb.View.Owner.ManageOwners;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.Owner;

/**
 * Manage Owner Presenter
 */
public class ManageOwnersPresenter
{
    private ManageOwnersView view;
    private OwnerDAO owners;

    /**
     * returns a list owner's details
     * @param owners list of owners
     * @return a list with owner's details
     */
    private ArrayList<Owner> createDataSource(List<Owner> owners)
    {
        ArrayList<Owner> data = new ArrayList<>();

        for(Owner owner : owners)
        	data.add(new Owner(owner.getFirstName(),owner.getLastName(),owner.getEmail(),owner.getIBAN(),
        			owner.getUsername(),owner.getPassword()));

        return data;
    }

    /**
     * Presenter initialised
     * @param view view instance
     * @param owners owner instance
     */
    public ManageOwnersPresenter(ManageOwnersView view, OwnerDAO owners)
    {
        this.view = view;
        this.owners = owners;

        onLoadSource();
    }

    /**
     * When the user clicks on Lease's id,
     * the user is transfered to activity LeasesDetailsActivity
     * @param uid lease's unique id
     */
    public void onClickItem(int uid)
    {
    	if(view.shouldLoadLeasesOnClick()) 
    		view.clickItemLeases(uid);
    	else 
    		view.clickItem(uid);
    }

    /**
     * Starts activity AddEditLeasesActivity
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
     * Loads list of owners
     */
    void onLoadSource()
    {
        view.loadSource(createDataSource(owners.findAll()));
    }
}
