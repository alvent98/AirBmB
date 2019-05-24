package project_airbmb.airbmb.DAOMemory;


import java.util.ArrayList;
import java.util.List;
import java.time.Period;



public class OwnerDAOMemory implements LeaseDAO {
    protected static ArrayList<Owner> OwnerList = new ArrayList<Owner>();

   
    public void delete(Owner entity) {
        OwnerList.remove(entity);
    }

    
    public List<Owner> findAll() {
        ArrayList<Owner> result = new ArrayList<Owner>();
        result.addAll(OwnerList);
        return result;
    }

    
    public void save(Owner entity) {
        OwnerList.add(entity);
    }

   
    public Owner find(int OwnerΙd)
    {
        for(Owner owner : OwnerList)
            if(owner.getId() == OwnerΙd)
                return home;

        return null;
    }

  
 ///////////////////////////////////////////////////////////////////
   @Override
    public List<Owner> findOwnerByFirstName(String firstName) {
		List<Owner> returnedOwner = new ArrayList<Owner>();
        for (Owner O : leaseList) {
            if (O.getFirstName().equals(firstName)) returnedOwner.add(O);
        }
        return returnedOwner;
    }
	

    public  List<Owner> findOwnerByLastName(String lastName) {
        List<Owner> returnedOwner = new ArrayList<Owner>();
        for (Owner O : OwnerList) {
            if (O.getLastName() == lastName) returnedOwner.add(O);
        }
        return returnedOwner;
    }
	
	
	
	 @Override
    public List<Owner> findOwnerByEmail(String email) {

        List<Owner> result = new ArrayList<Owner>();

        if (email!= null) {
            for (Owner O : OwnerList) {
                if (O.getEmail().contains(email)) {
                    result.add(O);
                }
            }
        }
        return result;
    }
	
	
	 @Override
    public List<Owner> findOwnerByIBAN(String IBAN) {

        List<Owner> result = new ArrayList<Renter>();

        if (IBAN!= null) {
            for (Owner O : OwnerList) {
                if (O.getIBAN().contains(IBAN)) {
                    result.add(O);
                }
            }
        }
        return result;
    }

 
 ///////////////////////////////////////////////////////////////////
  
  
  
  
  
  
  
    @Override
    public int nextId()
    {
        return (OwnerList.size() > 0 ? OwnerList.get(OwnerList.size()-1).getId()+1 : 1);
    }
}