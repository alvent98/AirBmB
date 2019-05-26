package com.example.airbmb.Dao;

import java.util.ArrayList;

import com.example.airbmb.Model.Lease;

/**
 * Lease DAO
 */
public interface LeaseDAO
{
    /**
     * Deletes a lease
     * @param entity lease
     */
    void delete(Lease entity);

    /**
     * Returns all leases
     * @return list of leases
     */
    ArrayList<Lease> findAll();

    /**
     * Saves a lease
     * @param entity lease
     */
    void save(Lease entity);

    /**
     * Finds a house according to id
     * @param LeaseId lease's unique id
     * @return lease that was found or null
     */
    Lease find(int LeaseId);

    /**
     * finds leases according to cost
     * @param cost price
     * @return list of leases that were found
     */
	ArrayList<Lease> findLeaseByCost(double cost);

    /**
     * finds leases according to renter's id
     * @param id renter's unique id
     * @return list of leases that were found
     */
	
	ArrayList<Lease> findLeaseByRenter(int id);	
}