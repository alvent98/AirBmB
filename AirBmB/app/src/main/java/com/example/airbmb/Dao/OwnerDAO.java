package com.example.airbmb.Dao;

import java.util.ArrayList;

import com.example.airbmb.Model.Owner;

public interface OwnerDAO {
	void delete(Owner entity);
	ArrayList<Owner> findAll();

	void save(Owner entity);
	 
	Owner find(int UserId);

	int nextId();
		
	ArrayList<Owner> findByFirstName(String firstName);
	ArrayList<Owner> findByLastName(String lastName);
	ArrayList<Owner> findByEmail(String email);
	ArrayList<Owner> findByIBAN(String IBAN);

}
