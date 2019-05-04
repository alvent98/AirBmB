import java.util.ArrayList;

public interface HouseListView extends View{
	public void setPresenter(HouseListPresenter presenter);
	public void setHouses(ArrayList<House> houses);
	
	public House getSelectedHouse();
}
