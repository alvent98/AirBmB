import java.util.ArrayList;

public interface OwnerListView extends View{
	public void setPresenter(OwnerListPresenter presenter);
	public void setOwners(ArrayList<Owner> owners);
	
	public Owner getSelectedOwner();
}
