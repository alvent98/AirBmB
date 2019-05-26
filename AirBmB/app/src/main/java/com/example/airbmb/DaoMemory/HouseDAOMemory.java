package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

/**
 * House Memory DAO
 */
public class HouseDAOMemory implements HouseDAO {
    protected static ArrayList<House> houseList = new ArrayList<House>();
    protected static double averagePrice;

    /**
     * Deletes a house
     * @param entity house
     */
    public void delete(House entity) {
        houseList.remove(entity);
    }

    /**
     * Returns all houses
     * @return list of houses
     */
    public ArrayList<House> findAll() {
        ArrayList<House> result = new ArrayList<House>();
        result.addAll(houseList);
        return result;
    }

    /**
     * Saves a house
     * @param entity house
     */
    public void save(House entity) {
        houseList.add(entity);
    }

    /**
     * Finds a house according to id
     * @param houseId house's id
     * @return the house that was found or null
     */
    public House find(int houseId)
    {
    	for(House h : houseList) if(h.getId() == houseId) return h;

        return null;
    }

    /**
     * finds houses according to city
     * @param city city
     * @return list of houses that were found
     */
    @Override
    public ArrayList<House> findByCity(String city) {

        ArrayList<House> result = new ArrayList<>();

        if (city != null) {
            for (House h : houseList) {
                if (h.getCity().contains(city)) {
                    result.add(h);
                }
            }
        }
        return result;
    }

    /**
     * finds houses according to street
     * @param street street
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByStreet(String street) {

        ArrayList<House> result = new ArrayList<>();

        if (street != null) {
            for (House h : houseList) {
                if (h.getStreet().contains(street)) {
                    result.add(h);
                }
            }
        }
        return result;
    }

    /**
     * finds houses according to area
     * @param area size of house
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByArea(int area) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if(Math.abs(h.getArea() - area) < 15) result.add(h);

        return result;
    }

    /**
     * finds houses according to number of rooms
     * @param rooms number of rooms
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByRooms(int rooms) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if(h.getRooms()==rooms) result.add(h);
        
        return result;
    }

    /**
     * finds houses according to price
     * @param price price
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByPrice(int price) {
        ArrayList<House> result = new ArrayList<>();

        for (House h : houseList) if(Math.abs(h.getPrice() - price) < 30) result.add(h);
         
        return result;
    }

    /**
     * finds houses according to floor
     * @param floor floor
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByFloor(int floor) {
        ArrayList<House> result = new ArrayList<>();

        for (House h : houseList) if(h.getFloor()==floor) result.add(h);
        
        return result;
    }

    /**
     * finds houses according to owner
     * @param ownerId owner's unique id
     * @return list of houses that were found
     */
	@Override
    public ArrayList<House> findByOwner(int ownerId) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if (h.getOwner().getId()==ownerId) result.add(h);
        
        return result;
    }

    /**
     * Calculates the average price for a house
     * @return average price
     */
    public double getAveragePrice() {
        if (houseList.size() == 0){
            //System.out.println("There are no registered houses yet.");
            return 0;
        }

        double sum = 0;

        for(House h : houseList){
            sum += h.getPrice();
        }

        averagePrice= sum/houseList.size();
        return averagePrice;
    }
}