package airbmbr4.r4.View.Owner;

import android.view.View;

import java.util.ArrayList;

import airbmbr4.r4.Model.Owner;

public interface OwnerListView extends View {
	public void setPresenter(OwnerListPresenter presenter);
	public void setOwners(ArrayList<Owner> owners);
	
	public Owner getSelectedOwner();
}
