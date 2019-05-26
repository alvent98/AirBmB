package com.example.airbmb.View.Owner.OwnerDetails;

import java.util.ArrayList;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Owner;
import com.example.airbmb.View.User.UserDetailsView;

/**
 * Owner Details Presenter
 */
public class OwnerDetailsPresenter
{
    private UserDetailsView view;
    private OwnerDAO owners;
    private LeaseDAO leases;
	private HouseDAO houses;
    private Owner attachedOwner;

    /**
     * Presenter initialised
     * @param view view instance
     * @param owners owner instance
     */
    public OwnerDetailsPresenter(UserDetailsView view, OwnerDAO owners)
    {
        this.view = view;
        this.owners = owners;

        attachedOwner = owners.find(view.getAttachedUserId());

        view.setPageName("Owner No " + attachedOwner.getId());
        view.setFirstName(attachedOwner.getFirstName());
        view.setLastName(attachedOwner.getLastName());
        view.setEmail(attachedOwner.getEmail());
        view.setIBAN(attachedOwner.getIBAN());
        view.setUsername(attachedOwner.getUsername());
        view.setPassword(attachedOwner.getPassword());
    }

    /**
     * Shows the owner's edit button
     */
    void onStartEditButtonClick()
    {
        view.startEdit(attachedOwner.getId());
    }

    /**
     * Shows the owner's delete button
     */
    void onStartDeleteButtonClick()
    {
        view.startDelete("Owner Delete","All houses of the owner on system will be deleted. \n"
        		+ "All relative leases will be removed.");
    }

    /**
     * Deletes the owner from the list
     */
    void onDoDeleteAndFinish()
    {

        String msg = "Successful delete of owner "+attachedOwner.getLastName()+" "+ attachedOwner.getFirstName()+"'!";

        ArrayList<Lease> leaseResults = leases.findAll();
        for(Lease l : leaseResults)
        {
        	if(l.getHouse().getOwner().getId()==view.getAttachedUserId()) leases.delete(l);
        }
        
        ArrayList<House> houseResults = houses.findByOwner(view.getAttachedUserId());
        for(House h : houseResults)
        {
        	houses.delete(h);
        }

        owners.delete(attachedOwner);
        attachedOwner = null;

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