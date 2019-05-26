package com.example.airbmb.Model;

import java.time.LocalDate;
import java.util.Objects;

public class Lease {
	private static int num=0; 
	private Renter renter;
	private House house;
	private int leaseId;
	private LocalDate startDate;
	private LocalDate endDate;
    private int cost;

	/**
	 * Constructor that initializes the main characteristics of a Lease
	 * @param startDate start date of the lease
	 * @param endDate end date of the lease
	 * @param cost lease's cost
	 * @param renter house's renter
	 * @param house house
	 */
    public Lease(LocalDate startDate, LocalDate endDate, int cost, Renter renter, House house) {
    	this.startDate = startDate;
    	this.endDate = endDate;
        this.cost = cost;
        this.renter = renter;
        this.house = house;
        leaseId = num++;
    }

    public int getLeaseId() {
        return leaseId;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    
    /**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

    /**
	 * @return the renter
	 */
	public Renter getRenter() {
		return renter;
	}

	/**
	 * @param renter the renter to set
	 */
	public void setRenter(Renter renter) {
		this.renter = renter;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
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
        Lease lease = (Lease) o;
        return leaseId == lease.leaseId;
    }

	/**
	 * This method generates a hash code for the id
	 * @return the hash code
	 */
    @Override
    public int hashCode() {

        return Objects.hash(leaseId);
    }

	public long getId() {
		return leaseId;
	}
}