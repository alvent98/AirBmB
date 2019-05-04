
public class HousePresenter {
	private HouseView view;
	private House house;
	//private HouseDAO houseDao;
	
	public HousePresenter(HouseView view) {
		this.view = view;
		//houseDao = new HouseDAOMemory();
	}
	
	public void setHouse(House house) {
		this.house = house;
		updateView();
	}
	
	public House getHouse() {
		return house;
	}
	
	public void start() {
		view.setPresenter(this);
		updateView();
		view.open();
	}
	
	public void updateView() {
		view.setHouseId(house.getId());
		view.setCity(house.getCity());
		view.setStreet(house.getStreet());
		view.setNumber(house.getNumber());
		view.setArea(house.getArea());
		view.setFloor(house.getFloor());
		view.setRooms(house.getRooms());
		view.setPrice(house.getPrice());
	}
	
	public void save() {
//		house.setId(view.getHouseId()); possibly auto generated
		house.setCity(view.getCity());
		house.setStreet(view.getStreet());
		house.setNumber(view.getNumber());
		house.setArea(view.getArea());
		house.setFloor(view.getFloor());
		house.setRooms(view.getRooms());
		house.setPrice(view.getPrice());
//	    houseDao.save(house);
		view.close();
	}
	
	public void cancel() {
		view.close();
	}
}
