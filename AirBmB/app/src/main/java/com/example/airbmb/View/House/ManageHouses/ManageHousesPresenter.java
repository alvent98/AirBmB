package com.example.airbmb.View.House.ManageHouses;

import java.util.ArrayList;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

public class ManageHousesPresenter
{
    private ManageHousesView view;

    private HouseDAO houses;

    private ArrayList<House> createDataSource(ArrayList<House> houses)
    {
        ArrayList<House> data = new ArrayList<>();

        for(House house : houses)
        	data.add(house);

        return data;
    }

    public ManageHousesPresenter(ManageHousesView view, HouseDAO houses)
    {
        this.view = view;
        this.houses = houses;
        view.setPageName("Houses: ");

        onLoadSource();
    }

    void onClickItem(int uid)
    {
        view.clickHouse(uid);
    }

    void onStartAddNew()
    {
        view.startAddNew();
    }

    void onShowToast(String value)
    {
        view.showToast(value);
    }

    void onLoadSource()
    {
        ArrayList<House> toReturn = houses.findAll();

        view.loadSource(createDataSource(toReturn));
    }
}
