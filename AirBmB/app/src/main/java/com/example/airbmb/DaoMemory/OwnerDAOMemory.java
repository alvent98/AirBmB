package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.Owner;

/**
 * Owner Memory DAO
 */
public class OwnerDAOMemory implements OwnerDAO {
    protected static ArrayList<Owner> ownersList = new ArrayList<Owner>();

    /**
     * Deletes an owner
     * @param entity owner
     */
    public void delete(Owner entity) {
        ownersList.remove(entity);
    }

    /**
     * Returns all owners
     * @return list of owners
     */
    public ArrayList<Owner> findAll() {
    	ArrayList<Owner> result = new ArrayList<Owner>();
        result.addAll(ownersList);
        return result;
    }

    /**
     * Saves an owner
     * @param entity owner
     */
    public void save(Owner entity) {
        ownersList.add(entity);
    }

    /**
     * finds an owner according to id
     * @param ownerId owner's unique id
     * @return owner that was found or null
     */
    public Owner find(int ownerId) {
    	for(Owner o : ownersList) if(o.getId() == ownerId) return o;
        return null;
    }

    /**
     * finds owner according to first name
     * @param firstName first name
     * @return list of owners that were found
     */
    @Override
    public ArrayList<Owner> findByFirstName(String firstName) {
	   ArrayList<Owner> returnedOwner = new ArrayList<Owner>();
        for (Owner o : ownersList) {
            if (o.getFirstName().equalsIgnoreCase(firstName)) returnedOwner.add(o);
        }
        return returnedOwner;
    }

    /**
     * finds owner according to last name
     * @param lastName last name
     * @return list of owners that were found
     */
	@Override
    public ArrayList<Owner> findByLastName(String lastName) {
		 ArrayList<Owner> result = new ArrayList<Owner>();
         for (Owner o : ownersList) if (o.getLastName().contains(lastName)) result.add(o);              
         return result;
    }

    /**
     * finds owner according to email
     * @param email E-mail
     * @return list of owners that were found
     */
	 @Override
    public ArrayList<Owner> findByEmail(String email) {
		 ArrayList<Owner> result = new ArrayList<Owner>();
		 for (Owner o : ownersList) if (o.getEmail().equals(email)) result.add(o);        
		 return result;
    }

    /**
     * finds owner according to IBAN
     * @param IBAN bank account number
     * @return list of owners that were found
     */
	@Override
    public ArrayList<Owner> findByIBAN(String IBAN) {
		 ArrayList<Owner> result = new ArrayList<Owner>();		 
		 for (Owner o : ownersList) if (o.getIBAN().equals(IBAN)) result.add(o);
		 return result;
    }
}