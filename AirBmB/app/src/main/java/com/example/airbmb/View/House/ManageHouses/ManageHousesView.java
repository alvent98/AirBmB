package com.example.airbmb.View.House.ManageHouses;

import java.util.ArrayList;

import com.example.airbmb.Model.House;

public interface ManageHousesView
{
	void clickHouse(int uid);

    void startAddNew();

    void loadSource(ArrayList<House> input);

    void setPageName(String value);

    void showToast(String value);

}
