package com.example.airbmb.View.House.HouseDetails;

import com.example.airbmb.Model.Owner;

public interface HouseDetailsView
{
    Integer getAttachedHouseID();
    void setId(String value);

    void setCity(String value);
    
    void setStreet(String street);

    void setNumber(int num);
    
    void setArea(int area);
    
    void setFloor(int floor);
    
    void setRooms(int rooms);

    void setPrice(int price);
    
    void setOwner(Owner owner);

    void setPageName(String value);

    void startEdit(int houseId);

    void showToast(String value);
}
