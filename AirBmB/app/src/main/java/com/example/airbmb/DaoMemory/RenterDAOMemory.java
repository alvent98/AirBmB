package com.example.airbmb.DaoMemory;

import java.util.ArrayList;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Renter;

public class RenterDAOMemory implements RenterDAO {
    protected static ArrayList<Renter> rentersList = new ArrayList<Renter>();

    public void delete(Renter entity) {
        rentersList.remove(entity);
    }

    public ArrayList<Renter> findAll() {
    	ArrayList<Renter> result = new ArrayList<Renter>();
        result.addAll(rentersList);
        return result;
    }

    public void save(Renter entity) {
        rentersList.add(entity);
    }

    public Renter find(int renterId) {
    	for(Renter r : rentersList) if(r.getId() == renterId) return r;
        return null;
    }
  
    @Override
    public ArrayList<Renter> findByFirstName(String firstName) {
	   ArrayList<Renter> returnedRenter = new ArrayList<Renter>();
        for (Renter r : rentersList) {
            if (r.getFirstName().equalsIgnoreCase(firstName)) returnedRenter.add(r);
        }
        return returnedRenter;
    }
	
	 @Override
    public ArrayList<Renter> findByLastName(String lastName) {
		 ArrayList<Renter> result = new ArrayList<Renter>();
         for (Renter r : rentersList) if (r.getLastName().contains(lastName)) result.add(r);              
         return result;
    }
	
	 @Override
    public ArrayList<Renter> findByEmail(String email) {
		 ArrayList<Renter> result = new ArrayList<Renter>();
		 for (Renter r : rentersList) if (r.getEmail().equals(email)) result.add(r);        
		 return result;
    }
		
	@Override
    public ArrayList<Renter> findByIBAN(String IBAN) {
		 ArrayList<Renter> result = new ArrayList<Renter>();		 
		 for (Renter r : rentersList) if (r.getIBAN().equals(IBAN)) result.add(r);
		 return result;
    }

    @Override
    public int nextId() {
        return (rentersList.size() > 0 ? rentersList.get(rentersList.size()-1).getId()+1 : 1);
    }
}