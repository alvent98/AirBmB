package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

public class HouseDAOMemory implements HouseDAO {
    protected static ArrayList<House> houseList = new ArrayList<House>();
   
    public void delete(House entity) {
        houseList.remove(entity);
    }
    
    public ArrayList<House> findAll() {
        ArrayList<House> result = new ArrayList<House>();
        result.addAll(houseList);
        return result;
    }
    
    public void save(House entity) {
        houseList.add(entity);
    }
   
    public House find(int houseId)
    {
    	for(House h : houseList) if(h.getId() == houseId) return h;

        return null;
    }

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
	
	@Override
    public ArrayList<House> findByArea(int area) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if(Math.abs(h.getArea() - area) < 15) result.add(h);

        return result;
    }
		
	@Override
    public ArrayList<House> findByRooms(int rooms) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if(h.getRooms()==rooms) result.add(h);
        
        return result;
    }

	@Override
    public ArrayList<House> findByPrice(int price) {
        ArrayList<House> result = new ArrayList<>();

        for (House h : houseList) if(Math.abs(h.getPrice() - price) < 30) result.add(h);
         
        return result;
    }
	
	@Override
    public ArrayList<House> findByFloor(int floor) {
        ArrayList<House> result = new ArrayList<>();

        for (House h : houseList) if(h.getFloor()==floor) result.add(h);
        
        return result;
    }
	
	@Override
    public ArrayList<House> findByOwner(int ownerId) {
        ArrayList<House> result = new ArrayList<>();
        
        for (House h : houseList) if (h.getOwner().getId()==ownerId) result.add(h);
        
        return result;
    }
 
	//I think it is useless in our case.
    @Override
    public int nextId()
    {
        return (houseList.size() > 0 ? houseList.get(houseList.size()-1).getId()+1 : 1);
    }
}