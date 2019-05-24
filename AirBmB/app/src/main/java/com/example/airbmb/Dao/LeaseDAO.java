package com.example.airbmb.Dao;

import java.time.Period;
import java.util.List;
import com.example.airbmb.Model.Lease;

public interface LeaseDAO
{    
    void delete(Lease entity);
  
    List<Lease> findAll();
   
    void save(Lease entity);
    
    Lease find(int LeaseId);

    int nextId();
    
	List<Lease> findLeaseByDuration(Period duration);
	
	List<Lease> findLeaseByCost(double cost);
	
}