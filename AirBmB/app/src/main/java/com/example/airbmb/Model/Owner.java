package com.example.airbmb.Model;


/**
 * The Owner of a House
 */

public class Owner extends User{
	
    /**
     * Constructor that initializes the main characteristics of an Owner
     * @param firstName First Name
     * @param lastName Last Name
     * @param email E-mail
     * @param IBAN Bank Account Number
     * @param username Username
     * @param password Password
     */
    public Owner(String firstName, String lastName, String email, String IBAN, String username, String password){
        super(firstName,lastName,email,IBAN,username,password);
    }
}