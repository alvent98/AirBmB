package com.example.airbmb.View.Owner.ManageOwners;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.Owner;

public class ManageOwnersPresenter
{
    private ManageOwnersView view;
    private OwnerDAO owners;

    private ArrayList<Owner> createDataSource(List<Owner> owners)
    {
        ArrayList<Owner> data = new ArrayList<>();

        for(Owner owner : owners)
        	data.add(new Owner(owner.getFirstName(),owner.getLastName(),owner.getEmail(),owner.getIBAN(),
        			owner.getUsername(),owner.getPassword()));

        return data;
    }

    public ManageOwnersPresenter(ManageOwnersView view, OwnerDAO owners)
    {
        this.view = view;
        this.owners = owners;

        onLoadSource();
    }

    public void onClickItem(int uid)
    {
    	if(view.shouldLoadLeasesOnClick()) 
    		view.clickItemLeases(uid);
    	else 
    		view.clickItem(uid);
    }

    void onStartAddNew()
    {
        view.startAddNew();
    }

    void onShowToast(String value)
    {
        view.showToast(value);
    }

    void onLoadSource()
    {
        view.loadSource(createDataSource(owners.findAll()));
    }
}
