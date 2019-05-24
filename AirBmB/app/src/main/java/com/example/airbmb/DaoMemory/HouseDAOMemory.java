package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import java.util.List;
import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Model.House;

public class HouseDAOMemory implements HouseDAO {
    protected static ArrayList<House> houseList = new ArrayList<House>();
   
    public void delete(House entity) {
        houseList.remove(entity);
    }
    
    public List<House> findAll() {
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
    public List<House> findByCity(String city) {

        List<House> result = new ArrayList<>();

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
    public List<House> findByStreet(String street) {

        List<House> result = new ArrayList<>();

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
    public List<House> findByArea(int area) {
        List<House> result = new ArrayList<>();
        
        for (House h : houseList) if(Math.abs(h.getArea() - area) < 15) result.add(h);

        return result;
    }
		
	@Override
    public List<House> findByRooms(String rooms) {
        List<House> result = new ArrayList<>();
        
        for (House h : houseList) if(h.getRooms().equalsIgnoreCase(rooms)) result.add(h);
        
        return result;
    }

	@Override
    public List<House> findByPrice(double price) {
        List<House> result = new ArrayList<>();

        for (House h : houseList) if(Math.abs(h.getPrice() - price) < 30) result.add(h);
         
        return result;
    }
	
	@Override
    public List<House> findByFloor(String floor) {
        List<House> result = new ArrayList<>();

        for (House h : houseList) if(h.getFloor().equalsIgnoreCase(floor)) result.add(h);
        
        return result;
    }
	
	@Override
    public List<House> findByOwner(int ownerId) {
        List<House> result = new ArrayList<>();
        
        for (House h : houseList) if (h.getId()==ownerId) result.add(h);
        
        return result;
    }
 
	//I think it is useless in our case.
    @Override
    public int nextId()
    {
        return (houseList.size() > 0 ? houseList.get(houseList.size()-1).getId()+1 : 1);
    }
}