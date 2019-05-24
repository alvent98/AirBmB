package com.example.airbmb.View.House.HouseDetails;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

public class HouseDetailsPresenter
{
    private HouseDetailsView view;
    private House attachedHouse;

    public HouseDetailsPresenter(HouseDetailsView view, HouseDAO houses)
    {
        this.view = view;

        attachedHouse = houses.find(view.getAttachedHouseID());

        view.setPageName("House No " + attachedHouse.getId());
        
        view.setCity(attachedHouse.getCity());
        view.setStreet(attachedHouse.getStreet());
        view.setNumber(attachedHouse.getNumber());
        view.setArea(attachedHouse.getArea());
        view.setFloor(attachedHouse.getFloor());
        view.setPrice(attachedHouse.getPrice());
        view.setOwner(attachedHouse.getOwner());
    }

    public void onStartEditButtonClick()
    {
        view.startEdit(attachedHouse.getId());
    }

    public void onShowToast(String value)
    {
        view.showToast(value);
    }
}
