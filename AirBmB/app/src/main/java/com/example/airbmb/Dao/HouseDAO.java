package com.example.airbmb.Dao;

import java.util.ArrayList;
import com.example.airbmb.Model.House;


public interface HouseDAO
{    
    void delete(House entity);
  
    ArrayList<House> findAll();
   
    void save(House entity);
    
    House find(int HouseId);
	
	ArrayList<House> findByCity(String city);
	ArrayList<House> findByStreet(String street);
	ArrayList<House> findByArea(int area);
	ArrayList<House> findByRooms(int rooms);
	ArrayList<House> findByPrice(int price);
	ArrayList<House> findByFloor(int floor);
	ArrayList<House> findByOwner(int onwerId);
}