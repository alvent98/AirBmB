package com.example.airbmb.View.House.HouseDetails;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

/**
 * House Details Presenter
 */
public class HouseDetailsPresenter
{
    private HouseDetailsView view;
    private House attachedHouse;

    /**
     * Presenter initialised
     * @param view view instance
     * @param houses house instance
     */
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
        view.setRooms(attachedHouse.getRooms());
        view.setPrice(attachedHouse.getPrice());
        view.setOwner(attachedHouse.getOwner());
    }

    /**
     * This method shows house's edit button
     */
    public void onStartEditButtonClick()
    {
        view.startEdit(attachedHouse.getId());
    }

    /**
     * This method shows a message
     * @param value message
     */
    public void onShowToast(String value)
    {
        view.showToast(value);
    }
}
