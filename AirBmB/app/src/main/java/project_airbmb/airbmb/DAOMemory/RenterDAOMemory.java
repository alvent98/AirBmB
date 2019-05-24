package com.example.airbmb.DAOMemory;

import java.util.ArrayList;
import java.util.List;




public class HouseDAOMemory implements RenterDAO {
    protected static ArrayList<Renter> Renters = new ArrayList<Renter>();

   
    public void delete(Renter entity) {
        Renters.remove(entity);
    }

    
    public List<Renter> findAll() {
        ArrayList<Renter> result = new ArrayList<Renter>();
        result.addAll(Renters);
        return result;
    }

    
    public void save(Renter entity) {
        Renters.add(entity);
    }

   
    public Renter find(int RenterΙd)
    {
        for(Renter R : Renters)
            if(R.getId() == RenterΙd)
                return R;

        return null;
    }

  
 ///////////////////////////////////////////////////////////////////
   @Override
    public List<Renter> findOwnerByFirstName(String firstName) {
		List<Renter> returnedRenter = new ArrayList<Renter>();
        for (Renter R : leaseList) {
            if (R.getFirstName().equals(firstName)) returnedRenter.add(R);
        }
        return returnedRenter;
    }
	
	 @Override
    public List<Renter> findBylastName(String lastName) {

        List<Renter> result = new ArrayList<Renter>();

        if (lastName != null) {
            for (Renter R : Renters) {
                if (R.getLastName().contains(lastName)) {
                    result.add(R);
                }
            }
        }
        return result;
    }
	
	 @Override
    public List<Renter> findRenterByEmail(String email) {

        List<Renter> result = new ArrayList<Renter>();

        if (email!= null) {
            for (Renter R : Renters) {
                if (R.getEmail().contains(email)) {
                    result.add(R);
                }
            }
        }
        return result;
    }
	
	
	 @Override
    public List<Renter> findRenterByIBAN(String IBAN) {

        List<Renter> result = new ArrayList<Renter>();

        if (IBAN!= null) {
            for (Renter R : Renters) {
                if (R.getIBAN().contains(IBAN)) {
                    result.add(R);
                }
            }
        }
        return result;
    }


    
 
 ///////////////////////////////////////////////////////////////////
  
  
  
  
  
  
  
    @Override
    public int nextId()
    {
        return (Renters.size() > 0 ? Renters.get(Renters.size()-1).getId()+1 : 1);
    }
}