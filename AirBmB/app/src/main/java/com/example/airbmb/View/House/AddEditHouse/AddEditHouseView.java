package com.example.airbmb.View.House.AddEditHouse;

import com.example.airbmb.Model.Owner;

/**
 * Add/Edit House View
 */
public interface AddEditHouseView
{
    String getCity();
    String getStreet();
    int getNumber();
    int getArea();
    int getFloor();
    int getRooms();
    int getPrice();
    Owner getOwner();

    Integer getAttachedHouseID();

    /**
     * Sets house's street
     * @param city
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
     * @param area the size of the house
     */
    void setArea(int area);

    /**
     * Sets house's floor
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
     * Sets page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * The message which is shown when one activity is successfully finished
     * @param message The message which is shown
     */
    void successfullyFinishActivity(String message);

    /**
     * The message which is shown in case of an error
     * @param title The title of the message
     * @param message message
     */
    void showErrorMessage(String title, String message);
}
