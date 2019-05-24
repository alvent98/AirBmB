package com.example.airbmb.DAO;

import java.util.List;


public interface RenterDAO
{
    
    void delete(Renter entity);

  
    List<Renter> findAll();

   
    void save(Renter entity);

    
    Renter find(int RenterId);


    int nextId();
	
	List<Renter> findRenterByFirstName(String firstName);
	List<Renter> findRenterByLastName(String lastName);
	List<Renter> findRenterByEmail(String email);
	List<Renter> findRenterByIBAN(String IBAN);
	
}