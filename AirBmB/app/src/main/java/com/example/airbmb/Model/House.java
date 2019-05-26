package com.example.airbmb.Model;

import java.util.Objects;

/**
 * The House
 */

public class House {

    private static int num=0;
    private int id;
    private String city;
    private String street;
    private int number;
    private int area;
    private int floor;
    private int rooms;
    private int price;
    private Owner owner;
    
    /**
     * Constructor that initializes the main characteristics of a House
     * @param city the city where the House is located
     * @param street the street where the House is located
     * @param number number of House's address
     * @param area size of the house
     * @param floor the floor where the house is
     * @param rooms number of rooms
     * @param price price for every day of staying at the house
     * @param owner House's owner
     */
    public House(String city, String street, int number, int area, int floor, int rooms, 
    		int price,Owner owner){
        this.city=city;
        this.street=street;
        this.number=number;
        this.area=area;
        this.floor=floor;
        this.rooms=rooms;
        this.price=price;
        this.owner=owner;
        id=num++;
    }

    /**
     * Returns house's ID
     * House's ID is unique for every House
     * @return id
     */
    public int getId(){
        return id;
    }

    /**
     * Returns house's city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets house's city
     * @param city the city where the House is located
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns house's street
     * @return street
     */
    public String getStreet(){
        return street;
    }

    /**
     * Sets house's street
     * @param street the street where the House is located
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns house's number (address)
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets house's number (address)
     * @param number number of House's address
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns house's area
     * @return area
     */
    public int getArea() {
        return area;
    }

    /**
     * Sets house's area
     * @param area size of the house
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Returns number of house's floor
     * @return floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Sets number of house's floor
     * @param floor the floor where the house is
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * Returns number of rooms
     * @return rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Sets number of rooms
     * @param rooms number of rooms
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    /**
     * Returns house's price
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets house's price
     * @param price price for every day of staying at the house
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * This method tests if two objects are equal.
     * @param o the object to be tested
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id;
    }

    /**
     * This method generates a hash code for the id
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Returns object Owner
     * @return owner House's owner
     */
	public Owner getOwner() {
		return owner;
	}

    /**
     * Sets House's owner
     * @param owner House's owner
     */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}