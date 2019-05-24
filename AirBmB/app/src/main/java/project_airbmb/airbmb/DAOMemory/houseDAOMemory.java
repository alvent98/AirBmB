package com.example.airbmb.DAOMemory;

import java.util.ArrayList;
import java.util.List;




public class HouseDAOMemory implements HouseDAO {
    protected static ArrayList<House> entities = new ArrayList<House>();

   
    public void delete(House entity) {
        entities.remove(entity);
    }

    
    public List<House> findAll() {
        ArrayList<House> result = new ArrayList<House>();
        result.addAll(entities);
        return result;
    }

    
    public void save(House entity) {
        entities.add(entity);
    }

   
    public House find(int HouseΙd)
    {
        for(House home : entities)
            if(home.getId() == HouseΙd)
                return home;

        return null;
    }

  
 ///////////////////////////////////////////////////////////////////
   @Override
    public List<House> findByCity(String city) {

        List<House> result = new ArrayList<>();

        if (city != null) {
            for (House H : entities) {
                if (H.getCity().contains(city)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
	
	 @Override
    public List<House> findByStreet(String street) {

        List<House> result = new ArrayList<>();

        if (street != null) {
            for (House H : entities) {
                if (H.getStreet().contains(street)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
	
	 @Override
    public List<House> findByArea(int area) {

        List<House> result = new ArrayList<>();

        if (area!= null) {
            for (House H : entities) {
                if (H.getArea().contains(area)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
	
	
	 @Override
    public List<House> findByRooms(String rooms) {

        List<House> result = new ArrayList<>();

        if (rooms!= null) {
            for (House H : entities) {
                if (H.getRooms().contains(rooms)) {
                    result.add(H);
                }
            }
        }
        return result;
    }


 @Override
    public List<House> findByPrice(double price) {

        List<House> result = new ArrayList<>();

        if (price!= null) {
            for (House H : entities) {
                if (H.getPrice().contains(price)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
	
	
	
	
 @Override
    public List<House> findByFloor(String floor) {

        List<House> result = new ArrayList<>();

        if (floor!= null) {
            for (House H : entities) {
                if (H.getFloor().contains(floor)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
	
	@Override
    public List<House> findByOwner(Owner owner) {

        List<House> result = new ArrayList<>();

        if (owner!= null) {
            for (House H : entities) {
                if (H.getOwner().contains(owner)) {
                    result.add(H);
                }
            }
        }
        return result;
    }
    
 
 ///////////////////////////////////////////////////////////////////
  
  
  
  
  
  
  
    @Override
    public int nextId()
    {
        return (entities.size() > 0 ? entities.get(entities.size()-1).getId()+1 : 1);
    }
}