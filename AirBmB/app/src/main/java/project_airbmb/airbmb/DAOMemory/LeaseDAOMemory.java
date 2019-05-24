package project_airbmb.airbmb.DAOMemory;


import java.util.ArrayList;
import java.util.List;
import java.time.Period;



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

   
    public Lease find(int LeaseΙd)
    {
        for(Lease lease : leaseList)
            if(lease.getLeaseId() == LeaseΙd)
                return home;

        return null;
    }

  
 ///////////////////////////////////////////////////////////////////
   @Override
    public List<Lease> findLeaseByDuration(Period duration) {
		ArrayList<Lease> returnedLeases = new ArrayList<Lease>();
        duration = duration.normalized();
        for (Lease l : leaseList) {
            if (l.getDuration().equals(duration)) returnedLeases.add(l);
        }
        return returnedLeases;
    }
	

    public  List<Lease> findLeaseByCost(double cost) {
        List<Lease> returnedLeases = new ArrayList<Lease>();
        for (Lease l : leaseList) {
            if (l.getCost() == cost) returnedLeases.add(l);
        }
        return returnedLeases;
    }
 
 ///////////////////////////////////////////////////////////////////
  
  
  
  
  
  
  
    @Override
    public int nextId()
    {
        return (leaseList.size() > 0 ? leaseList.get(leaseList.size()-1).getLeaseId()+1 : 1);
    }
}