package com.example.airbmb.View.Lease.AddLeases;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.airbmb.Model.House;

public interface AddLeasesView
{
	int getLeaseId();
	
    int getSelectedHouseId();
    
    LocalDate getSelectedStartDate();
    
    LocalDate getSelectedEndDate();
    
    int getCost();

    int getAttachedRenterID();

    void setRenterId(int value);

    void setPageName(String value);

    void successfullyAddLeaseAndFinishActivity(String message);

    void showErrorMessage(String title, String message);

    void showAlert(String title, String message);

	void setHouseList(ArrayList<House> housesList);
}
