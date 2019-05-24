package com.example.airbmb.View.Renter.ManageRenters;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Renter;

public class ManageRentersPresenter
{
    private ManageRentersView view;
    private RenterDAO renters;

    private ArrayList<Renter> createDataSource(List<Renter> renters)
    {
        ArrayList<Renter> data = new ArrayList<>();

        for(Renter renter : renters)
        	data.add(new Renter(renter.getFirstName(),renter.getLastName(),renter.getEmail(),renter.getIBAN(),
        			renter.getUsername(),renter.getPassword()));

        return data;
    }

    public ManageRentersPresenter(ManageRentersView view, RenterDAO renters)
    {
        this.view = view;
        this.renters = renters;

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
        view.loadSource(createDataSource(renters.findAll()));
    }
}
