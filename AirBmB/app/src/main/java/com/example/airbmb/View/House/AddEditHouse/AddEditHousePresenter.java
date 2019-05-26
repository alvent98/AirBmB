package com.example.airbmb.View.House.AddEditHouse;

import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Owner;

/**
 * Add/Edit House Presenter
 */
public class AddEditHousePresenter {

    private AddEditHouseView view;

    private HouseDAO houses;

    private House attachedHouse;

    /**
     * This method checks if a word contains only letters
     * @param in word to be checked
     * @return true if the word is only alphabetic
     */
    private boolean verifyOnlyAlphabetic(String in)
    {
        for(int i = 0; i < in.length(); i++)
            if(!Character.isAlphabetic(in.charAt(i)))
                return false;
        return true;
    }

    /**
     * This mehtod checks if a word consists of 3 to 24 letters
     * @param in word to be checked
     * @return true if the word has acceptable length
     */
    private boolean validateLength(String in) {
    	if(in.length()<2 || in.length()>25) return false;
    	return true;
    }

    /**
     * This method checks if num has a valid value
     * @param num number to be checked
     * @param left minimum value
     * @param right maximum value
     * @return true if num has a valid value
     */
    private boolean validateBorders(int num, int left, int right) {
    	if(num<left || num>right) return false;
    	return true;
    }

    /**
     * Presenter is initialized in order to add or edit a house
     * @param view view instance
     * @param houses house instance
     */
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
            view.setRooms(attachedHouse.getRooms());
            view.setFloor(attachedHouse.getFloor());
            view.setPrice(attachedHouse.getPrice());
            view.setOwner(attachedHouse.getOwner());
        }
    }

    /**
     * When the user saves a house, it is checked if
     * the city, the street are between 3 and 24 characters,
     * the number is between 1 and 1500,
     * the floor is between -5 and 150,
     * the number of rooms is between 1 and 50,
     * the area is between 10 and 1000,
     * the price is positive and
     * owner is not null
     */
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
        view.showErrorMessage("Invalid number of rooms","The rooms must be between 1 and 50.");
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