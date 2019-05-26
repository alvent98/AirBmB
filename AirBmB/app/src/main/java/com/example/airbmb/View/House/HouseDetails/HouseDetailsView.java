package com.example.airbmb.View.House.HouseDetails;

import com.example.airbmb.Model.Owner;

/**
 * House Details View
 */
public interface HouseDetailsView
{
    Integer getAttachedHouseID();

    /**
     * Sets House's ID
     * @param value id
     */
    void setId(int value);

    /**
     * Sets house's city
     * @param city the city where the House is located
     */
    void setCity(String city);

    /**
     * Sets house's street
     * @param street the street where the House is located
     */
    void setStreet(String street);

    /**
     * Sets house's number (address)
     * @param num number of House's address
     */
    void setNumber(int num);

    /**
     * Sets house's area
     * @param area size of the house
     */
    void setArea(int area);

    /**
     * Sets number of house's floor
     * @param floor the floor where the house is
     */
    void setFloor(int floor);

    /**
     * Sets number of rooms
     * @param rooms number of rooms
     */
    void setRooms(int rooms);

    /**
     * Sets house's price
     * @param price price for every day of staying at the house
     */
    void setPrice(int price);

    /**
     * Sets house's owner
     * @param owner House's owner
     */
    void setOwner(Owner owner);

    /**
     * Sets the page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * Starts to edit the House with its unique ID
     * @param houseId House's ID
     */
    void startEdit(int houseId);

    /**
     * Shows a toast
     * @param value the message that is shown
     */
    void showToast(String value);
}
