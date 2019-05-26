package com.example.airbmb.View.Owner.ManageOwners;

import java.util.ArrayList;

import com.example.airbmb.Model.Owner;
import com.example.airbmb.View.User.ManageUsersView;

/**
 * Manage Owners View
 */
public interface ManageOwnersView extends ManageUsersView{
	/**
	 * Loads the list of owners
	 * @param input list of owners
	 */
	void loadSource(ArrayList<Owner> input);
}
