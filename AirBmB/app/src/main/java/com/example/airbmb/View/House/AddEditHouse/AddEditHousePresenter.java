package com.example.airbmb.View.House.AddEditHouse;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Owner;

public class AddEditHousePresenter {

    private AddEditHouseView view;

    private HouseDAO houses;

    private House attachedHouse;

    private boolean verifyOnlyAlphabetic(String in)
    {
        for(int i = 0; i < in.length(); i++)
            if(!Character.isAlphabetic(in.charAt(i)))
                return false;
        return true;
    }
    
    private boolean validateLength(String in) {
    	if(in.length()<2 || in.length()>25) return false;
    	return true;
    }
    
    private boolean validateBorders(int num, int left, int right) {
    	if(num<left || num>right) return false;
    	return true;
    }

    public AddEditHousePresenter(AddEditHouseView view, HouseDAO houses)
    {
        this.view = view;
        this.houses = houses;
        
        Integer attachedHouseID = view.getAttachedHouseID();
        attachedHouse = attachedHouseID == null ? null : houses.find(attachedHouseID);

        if(attachedHouse != null)//edit mode
        {
            view.setPageName("House No " + attachedHouse.getId());
            
            view.setCity(attachedHouse.getCity());
            view.setStreet(attachedHouse.getStreet());
            view.setNumber(attachedHouse.getNumber());
            view.setArea(attachedHouse.getArea());
            view.setFloor(attachedHouse.getFloor());
            view.setPrice(attachedHouse.getPrice());
            view.setOwner(attachedHouse.getOwner());
        }
    }

    public void onSaveHouse()
    {
        String	city = view.getCity(),
                street = view.getStreet();
        int	    floor = view.getFloor(),
        		rooms = view.getRooms(),
                number = view.getNumber(),
                area = view.getArea(),
                price = view.getPrice();
        Owner 	owner = view.getOwner();       

        if(!verifyOnlyAlphabetic(city) || !validateLength(city))
            view.showErrorMessage("Invalid city name","The city name must be between 3 and 24 letters,"
            		+ "and to contain only letters.");
        else if(!verifyOnlyAlphabetic(street) || !validateLength(street))
        view.showErrorMessage("Invalid street name","The street name must be between 3 and 24 letters,"
        		+ "and to contain only letters.");
        else if(!validateBorders(floor, -5,150))
        view.showErrorMessage("Invalid floor number","The floor must be between -5 and 150.");
        else if(!validateBorders(number, 1, 1500))
            view.showErrorMessage("Invalid road number","The road number must be between 1 and 1500.");
        else if(!validateBorders(rooms, 1, 50))
        view.showErrorMessage("Invalid room number","The rooms must be between 1 and 50.");
        else if(!validateBorders(area, 10,1000))
        view.showErrorMessage("Invalid area","The area must be between 10 and 1000.");
        else if(price <= 0)
            view.showErrorMessage("Invalid price","The price must be positive.");
        else if(owner==null)
            view.showErrorMessage("Invalid Owner","The owner must not be null.");  
        else
        {
            if(attachedHouse == null)//add
            {
            	House house = new House(city,street,number,area,floor,rooms,price,owner);
                houses.save(house);

                view.successfullyFinishActivity("Success Add of House "+house.getId()+"!");
            }
            else//update
            {
                attachedHouse.setArea(area);
                attachedHouse.setCity(city);
                attachedHouse.setFloor(floor);
                attachedHouse.setNumber(number);
                attachedHouse.setOwner(owner);
                attachedHouse.setRooms(rooms);
                attachedHouse.setStreet(street);
                attachedHouse.setPrice(price);
                
                view.successfullyFinishActivity("Success Update of House "+attachedHouse.getId()+"!");
            }
        }
    }
}