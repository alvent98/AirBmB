package airbmbr4.r4.View.House;

import android.view.View;

public interface HouseView extends View {
	public void setPresenter(HousePresenter presenter);
	
	public void setHouseId(long id);
	public int getHouseId();
	
	public void setCity(String city);
	public String getCity();
	
	public void setStreet(String street);
	public String getStreet();
	
	public void setNumber(int number);
	public int getNumber();
	
	public void setArea(int area);
	public int getArea();
	
	public void setFloor(String floor);
	public String getFloor();
	
	public void setRooms(String rooms);
	public String getRooms();
	
	public double getPrice();
	public void setPrice(double price);
}
