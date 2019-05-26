package com.example.airbmb.Dao;

import java.util.ArrayList;

import com.example.airbmb.Model.Owner;

/**
 * Owner DAO
 */
public interface OwnerDAO {

	/**
	 * Deletes an owner
	 * @param entity owner
	 */
	void delete(Owner entity);

	/**
	 * Returns all owners
	 * @return list of owners
	 */
	ArrayList<Owner> findAll();

	/**
	 * Saves an owner
	 * @param entity owner
	 */
	void save(Owner entity);

	/**
	 * finds an owner according to id
	 * @param UserId owner's unique id
	 * @return owner that was found or null
	 */
	Owner find(int UserId);

	/**
	 * finds owner according to first name
	 * @param firstName first name
	 * @return list of owners that were found
	 */
	ArrayList<Owner> findByFirstName(String firstName);

	/**
	 * finds owner according to last name
	 * @param lastName last name
	 * @return list of owners that were found
	 */
	ArrayList<Owner> findByLastName(String lastName);

	/**
	 * finds owner according to email
	 * @param email E-mail
	 * @return list of owners that were found
	 */
	ArrayList<Owner> findByEmail(String email);

	/**
	 * finds owner according to IBAN
	 * @param IBAN bank account number
	 * @return list of owners that were found
	 */
	ArrayList<Owner> findByIBAN(String IBAN);

}
