package com.example.airbmb.View.Renter.RenterDetails;

import java.util.ArrayList;

import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Renter;
import com.example.airbmb.View.User.UserDetailsView;

public class RenterDetailsPresenter
{
    private UserDetailsView view;
    private RenterDAO renters;
    private LeaseDAO leases;
    private Renter attachedRenter;

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

    void onStartEditButtonClick()
    {
        view.startEdit(attachedRenter.getId());
    }
    
    void onStartDeleteButtonClick()
    {
        view.startDelete("Renter Delete","All houses occupied will be unleased.");
    }

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

    void onShowToast(String value)
    {
        view.showToast(value);
    }
}