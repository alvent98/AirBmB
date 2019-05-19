package com.example.airbmb.View.Renter.ManageRenters;

import java.util.ArrayList;
import java.util.List;

import com.example.airbmb.View.ManageUsersView;
//import com.example.airbmb.dao.RenterDAO;
import com.example.airbmb.Model.Renter;

public class ManageRentersPresenter
{
    private ManageUsersView view;
    //private RenterDAO renters;

    private List<Renter> createDataSource(List<Renter> renters)
    {
        List<Renter> data = new ArrayList<>();

        for(Renter renter : renters)
        	data.add(new Renter(renter.getFirstName(),renter.getLastName(),renter.getEmail(),renter.getIBAN(),
        			renter.getUsername(),renter.getPassword()));

        return data;
    }

    /*public ManageRentersPresenter(ManageUsersView view, RenterDAO renters)
    {
        this.view = view;
        this.renters = renters;

        onLoadSource();
    }*/

    void onClickItem(int uid)
    {
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

    /*void onLoadSource()
    {
        view.loadSource(createDataSource(renters.findAll()));
    }*/
}
