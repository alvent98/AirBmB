package project_airbmb.airbmb.DAO;

package com.example.airbmb.DAO;
import java.time.Period;
import java.util.List;


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
}