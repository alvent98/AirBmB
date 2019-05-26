package com.example.airbmb.View.Lease.ManageLeases;

import java.util.ArrayList;

import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Renter;

/**
 * Manage Leases Presenter
 */
public class ManageLeasesPresenter
{
    private ManageLeasesView view;
    private LeaseDAO leases;
    private Renter renter;

    /**
     * Returns a list with details for the leases
     * @param leases leases
     * @return a list with details for the leases
     */
    private ArrayList<Lease> createDataSource(ArrayList<Lease> leases)
    {
        ArrayList<Lease> leaseList = new ArrayList<>();

        for(Lease l : leases)
            leaseList.add(new Lease(l.getStartDate(),l.getEndDate(),l.getCost(),l.getRenter(),l.getHouse()));

        return leaseList;
    }

    /**
     * Returns a list of leases that a renter has
     * @param leases lease instance
     * @param renter renter instance
     * @return renter's lease's list
     */
    private ArrayList<Lease> filterLeases(LeaseDAO leases, Renter renter)
    {
        ArrayList<Lease> returnedList = new ArrayList<>();

        for(Lease lease : leases.findAll())
            if(lease.getRenter().getId() == renter.getId()) returnedList.add(lease);

        return returnedList;
    }

    /**
     * Presenter initialised
     * @param view view instance
     * @param leases lease instance
     * @param renters renter instance
     */
    public ManageLeasesPresenter(ManageLeasesView view, LeaseDAO leases, RenterDAO renters)
    {
        this.view = view;
        this.leases = leases;
        renter = renters.find(view.getAttachedRenterID());

        view.setPageName("Leasing Of House");

        onLoadSource();
    }

    /**
     * Starts activity AddLeasesActivity
     */
    void onAddNewItem()
    {
        view.startAddNew(view.getAttachedRenterID());
    }

    /**
     * Loads list of lease's
     */
    void onLoadSource()
    {
        view.loadSource(createDataSource(filterLeases(leases, renter)));
    }

    /**
     * Shows a toast meassage
     * @param value message
     */
    void onShowToast(String value)
    {
        view.showToast(value);
    }
}
