package com.example.airbmb.View.Renter.ManageRenters;

import java.util.ArrayList;

import com.example.airbmb.Model.Renter;
import com.example.airbmb.View.User.ManageUsersView;

public interface ManageRentersView extends ManageUsersView{
	void loadSource(ArrayList<Renter> input);
}
