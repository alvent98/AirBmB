package com.example.airbmb.View.Lease.AddLeases;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.airbmb.Model.House;

/**
 * Add Leases View
 */
public interface AddLeasesView
{
    /**
     * @return Lease's id
     */
	int getLeaseId();

    /**
     * @return selected house's id
     */
    int getSelectedHouseId();

    /**
     * @return the date the lease starts
     */
    LocalDate getSelectedStartDate();

    /**
     * @return the date the lease ends
     */
    LocalDate getSelectedEndDate();

    int getCost();

    /**
     * @return house's id
     */
    int getAttachedRenterID();

    /**
     * Sets renter's id for the selected house
     * @param value renter's id
     */
    void setRenterId(int value);

    /**
     * Sets page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * A message is shown when an activity is finished successfully
     * @param message message
     */
    void successfullyAddLeaseAndFinishActivity(String message);

    /**
     * Shows an error message
     * @param title title of message
     * @param message message
     */
    void showErrorMessage(String title, String message);

    /**
     * Shows an alert message
     * @param title title of message
     * @param message message
     */
    void showAlert(String title, String message);

    /**
     * Sets the list with the houses
     * @param housesList list of houses
     */
	void setHouseList(ArrayList<House> housesList);
}
