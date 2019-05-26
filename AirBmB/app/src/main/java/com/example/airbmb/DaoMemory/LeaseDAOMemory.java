package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Model.Lease;

/**
 * Lease Memory DAO
 */
public class LeaseDAOMemory implements LeaseDAO {
    protected static ArrayList<Lease> leaseList = new ArrayList<Lease>();

    /**
     * Deletes a lease
     * @param entity lease
     */
    public void delete(Lease entity) {
        leaseList.remove(entity);
    }

    /**
     * Returns all leases
     * @return list of leases
     */
    public ArrayList<Lease> findAll() {
        ArrayList<Lease> result = new ArrayList<Lease>();
        result.addAll(leaseList);
        return result;
    }

    /**
     * Saves a lease
     * @param entity lease
     */
    public void save(Lease entity) {
        leaseList.add(entity);
    }

    /**
     * Finds a house according to id
     * @param leaseId lease's unique id
     * @return lease that was found or null
     */
    public Lease find(int leaseId)
    {
    	for(Lease l : leaseList) if(l.getId() == leaseId) return l;

        return null;
    }

    /**
     * finds leases according to cost
     * @param cost price
     * @return list of leases that were found
     */
   @Override
    public  ArrayList<Lease> findLeaseByCost(double cost) {
	   ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getCost() == cost) returnedLeases.add(l);
        }
        return returnedLeases;
    }

    /**
     * finds leases according to renter's id
     * @param id renter's unique id
     * @return list of leases that were found
     */
	@Override
	public ArrayList<Lease> findLeaseByRenter(int id) {
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getRenter().getId()==id) returnedLeases.add(l);
        }
        return returnedLeases;
	}
}