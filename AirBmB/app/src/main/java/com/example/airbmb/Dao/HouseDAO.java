package com.example.airbmb.Dao;

import java.util.ArrayList;
import com.example.airbmb.Model.House;

/**
 * House DAO
 */
public interface HouseDAO
{
	/**
	 * Deletes a House
	 * @param entity house
	 */
	void delete(House entity);

	/**
	 * Returns all houses
	 * @return list of houses
	 */
    ArrayList<House> findAll();

	/**
	 * Saves a house
	 * @param entity house
	 */
	void save(House entity);

	/**
	 * Finds a house according to id
	 * @param HouseId house's id
	 * @return the house that was found or null
	 */
    House find(int HouseId);

	/**
	 * finds houses according to city
	 * @param city city
	 * @return list of houses that were found
	 */
	ArrayList<House> findByCity(String city);

	/**
	 * finds houses according to street
	 * @param street street
	 * @return list of houses that were found
	 */
	ArrayList<House> findByStreet(String street);

	/**
	 * finds houses according to area
	 * @param area size of house
	 * @return list of houses that were found
	 */
	ArrayList<House> findByArea(int area);

	/**
	 * finds houses according to number of rooms
	 * @param rooms number of rooms
	 * @return list of houses that were found
	 */
	ArrayList<House> findByRooms(int rooms);

	/**
	 * finds houses according to price
	 * @param price price
	 * @return list of houses that were found
	 */
	ArrayList<House> findByPrice(int price);

	/**
	 * finds houses according to floor
	 * @param floor floor
	 * @return list of houses that were found
	 */
	ArrayList<House> findByFloor(int floor);

	/**
	 * finds houses according to owner
	 * @param ownerId owner's unique id
	 * @return list of houses that were found
	 */
	ArrayList<House> findByOwner(int ownerId);
}