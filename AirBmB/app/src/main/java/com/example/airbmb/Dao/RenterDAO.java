package com.example.airbmb.Dao;

import java.util.List;
import com.example.airbmb.Model.Renter;

/**
 * Renter DAO
 */
public interface RenterDAO
{
	/**
	 * Deletes a renter
	 * @param entity renter
	 */
	void delete(Renter entity);

	/**
	 * Returns all renters
	 * @return list of renters
	 */
	List<Renter> findAll();

	/**
	 * Saves a renter
	 * @param entity renter
	 */
	void save(Renter entity);

	/**
	 * finds a renter according to id
	 * @param UserId renter's unique id
	 * @return renter that was found or null
	 */
	Renter find(int UserId);

	/**
	 * finds renter according to first name
	 * @param firstName first name
	 * @return list of renter that were found
	 */
	List<Renter> findByFirstName(String firstName);

	/**
	 * finds renter according to last name
	 * @param lastName last name
	 * @return list of renters that were found
	 */
	List<Renter> findByLastName(String lastName);

	/**
	 * finds renter according to email
	 * @param email E-mail
	 * @return list of renters that were found
	 */
	List<Renter> findByEmail(String email);

	/**
	 * finds renter according to IBAN
	 * @param IBAN bank account number
	 * @return list of renters that were found
	 */
	List<Renter> findByIBAN(String IBAN);
	
 }