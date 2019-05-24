package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.Owner;

public class OwnerDAOMemory implements OwnerDAO {
    protected static ArrayList<Owner> ownersList = new ArrayList<Owner>();

    public void delete(Owner entity) {
        ownersList.remove(entity);
    }

    public ArrayList<Owner> findAll() {
    	ArrayList<Owner> result = new ArrayList<Owner>();
        result.addAll(ownersList);
        return result;
    }

    public void save(Owner entity) {
        ownersList.add(entity);
    }

    public Owner find(int ownerId) {
    	for(Owner o : ownersList) if(o.getId() == ownerId) return o;
        return null;
    }
  
    @Override
    public ArrayList<Owner> findByFirstName(String firstName) {
	   ArrayList<Owner> returnedOwner = new ArrayList<Owner>();
        for (Owner o : ownersList) {
            if (o.getFirstName().equalsIgnoreCase(firstName)) returnedOwner.add(o);
        }
        return returnedOwner;
    }
	
	 @Override
    public ArrayList<Owner> findByLastName(String lastName) {
		 ArrayList<Owner> result = new ArrayList<Owner>();
         for (Owner o : ownersList) if (o.getLastName().contains(lastName)) result.add(o);              
         return result;
    }
	
	 @Override
    public ArrayList<Owner> findByEmail(String email) {
		 ArrayList<Owner> result = new ArrayList<Owner>();
		 for (Owner o : ownersList) if (o.getEmail().equals(email)) result.add(o);        
		 return result;
    }
		
	@Override
    public ArrayList<Owner> findByIBAN(String IBAN) {
		 ArrayList<Owner> result = new ArrayList<Owner>();		 
		 for (Owner o : ownersList) if (o.getIBAN().equals(IBAN)) result.add(o);
		 return result;
    }

    @Override
    public int nextId() {
        return (ownersList.size() > 0 ? ownersList.get(ownersList.size()-1).getId()+1 : 1);
    }
}