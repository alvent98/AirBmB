package com.example.airbmb.Model;

/**
 * The Renter of a House
 */

public class Renter extends User {

    /**
     * Constructor that initializes the main characteristics of a Renter
     * @param firstName First Name
     * @param lastName Last Name
     * @param email E-mail
     * @param IBAN Bank Account Number
     * @param username Username
     * @param password Password
     */
    public Renter(String firstName, String lastName, String email, String IBAN, String username, String password){
        super(firstName,lastName,email,IBAN,username,password);
    }
}