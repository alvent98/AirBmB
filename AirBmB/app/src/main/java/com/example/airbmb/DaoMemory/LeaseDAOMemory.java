package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import java.util.List;
import java.time.Period;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Model.Lease;

public class LeaseDAOMemory implements LeaseDAO {
    protected static ArrayList<Lease> leaseList = new ArrayList<Lease>();
   
    public void delete(Lease entity) {
        leaseList.remove(entity);
    }
    
    public List<Lease> findAll() {
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
    public List<Lease> findLeaseByDuration(Period duration) {
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        duration = duration.normalized();
        for (Lease l : leaseList) {
            if (l.getDuration().equals(duration)) returnedLeases.add(l);
        }
        return returnedLeases;
    }
	
   @Override
    public  List<Lease> findLeaseByCost(double cost) {
        List<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getCost() == cost) returnedLeases.add(l);
        }
        return returnedLeases;
    }
 
    @Override
    public int nextId()
    {
        return (leaseList.size() > 0 ? leaseList.get(leaseList.size()-1).getLeaseId()+1 : 1);
    }
}