package com.example.airbmb.View.Lease.ManageLeases;

import java.util.ArrayList;

import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Renter;

public class ManageLeasesPresenter
{
    private ManageLeasesView view;
    private LeaseDAO leases;
    private Renter renter;

    private ArrayList<Lease> createDataSource(ArrayList<Lease> leases)
    {
        ArrayList<Lease> leaseList = new ArrayList<>();

        for(Lease l : leases)
            leaseList.add(new Lease(l.getStartDate(),l.getEndDate(),l.getCost(),l.getRenter(),l.getHouse()));

        return leaseList;
    }

    private ArrayList<Lease> filterLeases(LeaseDAO leases, Renter renter)
    {
        ArrayList<Lease> returnedList = new ArrayList<>();

        for(Lease lease : leases.findAll())
            if(lease.getRenter().getId() == renter.getId()) returnedList.add(lease);

        return returnedList;
    }

    public ManageLeasesPresenter(ManageLeasesView view, LeaseDAO leases, RenterDAO renters)
    {
        this.view = view;
        this.leases = leases;
        renter = renters.find(view.getAttachedRenterID());

        view.setPageName("Leasing Of House");

        onLoadSource();
    }

    void onAddNewItem()
    {
        view.startAddNew(view.getAttachedRenterID());
    }

    void onLoadSource()
    {
        view.loadSource(createDataSource(filterLeases(leases, renter)));
    }

    void onShowToast(String value)
    {
        view.showToast(value);
    }
}
