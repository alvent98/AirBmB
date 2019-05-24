package com.example.airbmb.Dao;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import com.example.airbmb.Model.Lease;

public interface LeaseDAO
{    
    void delete(Lease entity);
  
    List<Lease> findAll();
   
    void save(Lease entity);
    
    Lease find(int LeaseId);

    int nextId();
    
	ArrayList<Lease> findLeaseByDuration(Period duration);
	
	ArrayList<Lease> findLeaseByCost(double cost);
	
	ArrayList<Lease> findLeaseByRenter(int id);
	
	ArrayList<Lease> findLeaseByOnwer(int id);
	
}