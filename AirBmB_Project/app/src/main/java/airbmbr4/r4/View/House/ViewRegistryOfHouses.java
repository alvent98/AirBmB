package airbmbr4.r4.View.House;

import javax.swing.JFrame;

public class ViewRegistryOfHouses {
	private static HouseListView houseListViewStub;
	private static HouseView houseViewStub;
	
	public static void setHouseListView(HouseListView houseListView) {
		houseListViewStub = houseListView;
	}
	
	public static void setHouseView(HouseView houseView) {
		houseViewStub = houseView;
	}
	
	public static HouseListView getHouseListView() {
		//crazycast used here, lol (never going to be used, so why not).
		return houseListViewStub == null ? (HouseListView) new JFrame() : houseListViewStub;
	}
	
	public static HouseView getHouseView() {
		//crazycast used also here (for the same reason).
		return houseViewStub == null ? (HouseView) new JFrame() : houseViewStub;
	}
	
	public static void reset() {
		houseListViewStub = null;
		houseViewStub = null;
	}
}
