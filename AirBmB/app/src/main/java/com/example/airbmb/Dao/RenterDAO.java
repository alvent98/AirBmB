package com.example.airbmb.Dao;

import java.util.List;
import com.example.airbmb.Model.Renter;

public interface RenterDAO
{
	void delete(Renter entity);
	List<Renter> findAll();

	void save(Renter entity);
 
	Renter find(int UserId);

    int nextId();
	
	List<Renter> findByFirstName(String firstName);
	List<Renter> findByLastName(String lastName);
	List<Renter> findByEmail(String email);
	List<Renter> findByIBAN(String IBAN);
	
}