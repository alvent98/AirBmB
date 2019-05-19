package airbmbr4.r4.View.House;

import android.view.View;

import java.util.ArrayList;

import airbmbr4.r4.Model.House;
import airbmbr4.r4.View.House.HouseListPresenter;

public interface HouseListView extends View {
	public void setPresenter(HouseListPresenter presenter);
	public void setHouses(ArrayList<House> houses);
	
	public House getSelectedHouse();
}
