package com.example.airbmb.View.Renter.ManageRenters;

import java.util.ArrayList;

import com.example.airbmb.Model.Renter;
import com.example.airbmb.View.User.ManageUsersView;

/**
 * Manage Renters View
 */
public interface ManageRentersView extends ManageUsersView{
	/**
	 * Loads the list of Renters
	 * @param input list of renters
	 */
	void loadSource(ArrayList<Renter> input);
}
