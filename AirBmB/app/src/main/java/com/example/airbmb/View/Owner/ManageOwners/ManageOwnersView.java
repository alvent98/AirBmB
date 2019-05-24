package com.example.airbmb.View.Owner.ManageOwners;

import java.util.ArrayList;

import com.example.airbmb.Model.Owner;
import com.example.airbmb.View.User.ManageUsersView;

public interface ManageOwnersView extends ManageUsersView{
	void loadSource(ArrayList<Owner> input);
}
