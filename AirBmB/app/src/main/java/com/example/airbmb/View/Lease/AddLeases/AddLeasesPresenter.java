package com.example.airbmb.View.Lease.AddLeases;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Renter;

public class AddLeasesPresenter {

    private AddLeasesView view;
    private HouseDAO houses;
    private LeaseDAO leases;
    Renter attachedRenter;
    
    private boolean coinside(LocalDate start1, LocalDate start2,LocalDate end1, LocalDate end2) {
    	if(start2.isAfter(end1)) {
    		if(start2.isAfter(start1)) return true;
    	}
    	if(start1.isAfter(end2)) {
    		if(start1.isAfter(start2)) return true;
    	}
    	return false;
    }

    public AddLeasesPresenter(AddLeasesView view, HouseDAO houses, RenterDAO renters, LeaseDAO leases)
    {
        this.view = view;
        this.houses = houses;
        this.leases = leases;

        attachedRenter = renters.find(view.getAttachedRenterID());

        view.setRenterId(attachedRenter.getId());
        view.setPageName("Create Request");

        ArrayList<House> housesList = new ArrayList<>();

        for(House house : houses.findAll())
            housesList.add(house);

        view.setHouseList(housesList);
    }

    public void onSaveLease()
    {
    	int cost = view.getCost();
    	int houseId = view.getSelectedHouseId();
    	LocalDate start = view.getSelectedStartDate();
    	LocalDate end = view.getSelectedEndDate();
    	House h = houses.find(houseId);
    	
    	boolean occupied = false;
    	ArrayList<Lease> leaseList = leases.findAll();

    	for(Lease l : leaseList) {
    		if(l.getHouse().getId()==houseId) {
    			if(coinside(l.getStartDate(),start , l.getEndDate(), end)) {
    				occupied = true;
    				break;
    			}
    		}
    	}

        if(occupied) {
        	view.showAlert("Lease Impossible", "The selected house is occupied at the specific period.");
        } else if(cost <= 0) {
            view.showErrorMessage("Invalid cost","The cost must be positive.");
    	} else if(start.isAfter(end)) {
    	view.showErrorMessage("Invalid time sequence","Start Date must be before end Date.");
        } else if(start.isBefore(LocalDate.now())) {
        	view.showErrorMessage("Invalid time","Only future dates are valid.");
        } else
        {
        	Lease l = new Lease(start,end,cost,attachedRenter,h);
            leases.save(l);
            view.successfullyAddLeaseAndFinishActivity("The renter with Id "+attachedRenter.getId()
            +" leased the house with id "+houseId);
        }
    }
}
