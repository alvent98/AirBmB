package com.example.airbmb.View.House.AddEditHouse;

import com.example.airbmb.Model.Owner;

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
    
    void setCity(String value);
    
    void setStreet(String street);

    void setNumber(int num);
    
    void setArea(int area);
    
    void setFloor(int floor);
    
    void setRooms(int rooms);

    void setPrice(int price);
    
    void setOwner(Owner owner);

    void setPageName(String value);

    void successfullyFinishActivity(String message);

    void showErrorMessage(String title, String message);
}
