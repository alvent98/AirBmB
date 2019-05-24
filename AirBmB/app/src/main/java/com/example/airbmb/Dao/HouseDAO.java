package com.example.airbmb.Dao;

import java.util.List;
import com.example.airbmb.Model.House;


public interface HouseDAO
{    
    void delete(House entity);
  
    List<House> findAll();
   
    void save(House entity);
    
    House find(int HouseId);

    int nextId();	
	
	List<House> findByCity(String city);
	List<House> findByStreet(String street);
	List<House> findByArea(int area);
	List<House> findByRooms(String rooms);
	List<House> findByPrice(double price);
	List<House> findByFloor(String floor);
	List<House> findByOwner(int onwerId);	  
}