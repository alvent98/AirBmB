package project_airbmb.airbmb.DAO;

package com.example.airbmb.DAO;

import java.util.List;


public interface OwnerDAO
{
    
    void delete(Owner entity);

  
    List<Owner> findAll();

   
    void save(Owner entity);

    
    Owner find(int OwnerId);


    int nextId();
	
	List<Owner> findOwnerByFirstName(String firstName);
	List<Owner> findOwnerByLastName(String lastName);
	List<Owner> findOwnerByEmail(String email);
	List<Owner> findOwnerByIBAN(String IBAN);
	

}
}