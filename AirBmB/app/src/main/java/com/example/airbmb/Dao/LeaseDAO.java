package com.example.airbmb.Dao;

import java.util.ArrayList;

import com.example.airbmb.Model.Lease;

public interface LeaseDAO
{    
    void delete(Lease entity);
  
    ArrayList<Lease> findAll();
   
    void save(Lease entity);
    
    Lease find(int LeaseId);

	ArrayList<Lease> findLeaseByCost(double cost);
	
	ArrayList<Lease> findLeaseByRenter(int id);	
}