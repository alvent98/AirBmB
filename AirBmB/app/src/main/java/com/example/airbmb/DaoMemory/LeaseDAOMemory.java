package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Model.Lease;

public class LeaseDAOMemory implements LeaseDAO {
    protected static ArrayList<Lease> leaseList = new ArrayList<Lease>();
   
    public void delete(Lease entity) {
        leaseList.remove(entity);
    }
    
    public ArrayList<Lease> findAll() {
        ArrayList<Lease> result = new ArrayList<Lease>();
        result.addAll(leaseList);
        return result;
    }
    
    public void save(Lease entity) {
        leaseList.add(entity);
    }
   
    public Lease find(int leaseId)
    {
    	for(Lease l : leaseList) if(l.getId() == leaseId) return l;

        return null;
    }

   @Override
    public  ArrayList<Lease> findLeaseByCost(double cost) {
	   ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getCost() == cost) returnedLeases.add(l);
        }
        return returnedLeases;
    }

	@Override
	public ArrayList<Lease> findLeaseByRenter(int id) {
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getRenter().getId()==id) returnedLeases.add(l);
        }
        return returnedLeases;
	}
}