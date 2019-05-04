import java.util.ArrayList;

public interface RenterListView extends View{
	public void setPresenter(RenterListPresenter presenter);
	public void setRenters(ArrayList<Renter> renters);
	
	public Owner getSelectedRenter();
}
