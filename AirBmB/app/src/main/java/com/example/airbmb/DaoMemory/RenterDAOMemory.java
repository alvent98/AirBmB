package com.example.airbmb.DaoMemory;

import java.util.ArrayList;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Renter;

/**
 * Renter Memory DAO
 */
public class RenterDAOMemory implements RenterDAO {
    protected static ArrayList<Renter> rentersList = new ArrayList<Renter>();

    /**
     * Deletes a renter
     * @param entity renter
     */
    public void delete(Renter entity) {
        rentersList.remove(entity);
    }

    /**
     * Returns all renters
     * @return list of renters
     */
    public ArrayList<Renter> findAll() {
    	ArrayList<Renter> result = new ArrayList<Renter>();
        result.addAll(rentersList);
        return result;
    }

    /**
     * Saves a renter
     * @param entity renter
     */
    public void save(Renter entity) {
        rentersList.add(entity);
    }

    /**
     * finds a renter according to id
     * @param renterId renter's unique id
     * @return renter that was found or null
     */
    public Renter find(int renterId) {
    	for(Renter r : rentersList) if(r.getId() == renterId) return r;
        return null;
    }

    /**
     * finds renter according to first name
     * @param firstName first name
     * @return list of renter that were found
     */
    @Override
    public ArrayList<Renter> findByFirstName(String firstName) {
	   ArrayList<Renter> returnedRenter = new ArrayList<Renter>();
        for (Renter r : rentersList) {
            if (r.getFirstName().equalsIgnoreCase(firstName)) returnedRenter.add(r);
        }
        return returnedRenter;
    }

    /**
     * finds renter according to last name
     * @param lastName last name
     * @return list of renters that were found
     */
	@Override
    public ArrayList<Renter> findByLastName(String lastName) {
		 ArrayList<Renter> result = new ArrayList<Renter>();
         for (Renter r : rentersList) if (r.getLastName().contains(lastName)) result.add(r);              
         return result;
    }

    /**
     * finds renter according to email
     * @param email E-mail
     * @return list of renters that were found
     */
	@Override
    public ArrayList<Renter> findByEmail(String email) {
		 ArrayList<Renter> result = new ArrayList<Renter>();
		 for (Renter r : rentersList) if (r.getEmail().equals(email)) result.add(r);        
		 return result;
    }

    /**
     * finds renter according to IBAN
     * @param IBAN bank account number
     * @return list of renters that were found
     */
	@Override
    public ArrayList<Renter> findByIBAN(String IBAN) {
		 ArrayList<Renter> result = new ArrayList<Renter>();		 
		 for (Renter r : rentersList) if (r.getIBAN().equals(IBAN)) result.add(r);
		 return result;
    }
}