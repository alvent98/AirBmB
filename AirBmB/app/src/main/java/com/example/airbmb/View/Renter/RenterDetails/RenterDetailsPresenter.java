package com.example.airbmb.View.Renter.RenterDetails;

import java.util.ArrayList;

import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Renter;
import com.example.airbmb.View.User.UserDetailsView;

/**
 * Renter Details Presenter
 */
public class RenterDetailsPresenter
{
    private UserDetailsView view;
    private RenterDAO renters;
    private LeaseDAO leases;
    private Renter attachedRenter;

    /**
     * Presenter initialised
     * @param view view instance
     * @param renters renter instance
     * @param leases lease instance
     */
    public RenterDetailsPresenter(UserDetailsView view, RenterDAO renters, LeaseDAO leases)
    {
        this.view = view;
        this.renters = renters;
        this.leases = leases;

        attachedRenter = renters.find(view.getAttachedUserId());

        view.setPageName("Renter No " + attachedRenter.getId());
        view.setFirstName(attachedRenter.getFirstName());
        view.setLastName(attachedRenter.getLastName());
        view.setEmail(attachedRenter.getEmail());
        view.setIBAN(attachedRenter.getIBAN());
        view.setUsername(attachedRenter.getUsername());
        view.setPassword(attachedRenter.getPassword());
    }

    /**
     * Shows the renter's edit button
     */
    void onStartEditButtonClick()
    {
        view.startEdit(attachedRenter.getId());
    }

    /**
     * Shows the renter's delete button
     */
    void onStartDeleteButtonClick()
    {
        view.startDelete("Renter Delete","All houses occupied will be unleased.");
    }

    /**
     * Deletes the renter from the list
     */
    void onDoDeleteAndFinish()
    {

        String msg = "Successful delete of renter "+attachedRenter.getLastName()+" "+ attachedRenter.getFirstName()+"'!";

        ArrayList<Lease> results = leases.findLeaseByRenter(view.getAttachedUserId());
        for(Lease l : results)
        {
        	leases.delete(l);
        }

        renters.delete(attachedRenter);
        attachedRenter = null;

        view.doDeleteAndFinish(msg);
    }

    /**
     * Shows a toast message
     * @param value message
     */
    void onShowToast(String value)
    {
        view.showToast(value);
    }
}