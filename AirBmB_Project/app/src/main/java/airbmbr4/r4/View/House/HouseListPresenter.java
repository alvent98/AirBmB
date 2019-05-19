package airbmbr4.r4.View.House;

import java.util.ArrayList;

import airbmbr4.r4.Model.House;

public class HouseListPresenter {
	private HouseListView view;
	private ArrayList<House> houses;
//	private HouseDAO houseDao;
	
	public HouseListPresenter(HouseListView view) {
		this.view = view;
//		houseDao = new HouseDAOMemory();
	}
	
	public void start() {
		view.setPresenter(this);
		getHouseList();
		view.open();
	}
	
	private void getHouseList() {
//		houses = houseDao.findAll();
		view.setHouses(houses);
	}
	
	public ArrayList<House> getHouses() {
		return houses;
	}
	
	public void editSelected() {
		HouseView houseView = ViewRegistryOfHouses.getHouseView();
		HousePresenter housePresenter = new HousePresenter(houseView);
		housePresenter.setHouse(new House("", "", 1, 1, "1", "1", 1));
		housePresenter.start();
	}
	
	public void refresh() {
		getHouseList();
	}	
}
