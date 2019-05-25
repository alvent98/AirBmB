package com.example.airbmb.Model;

import java.util.*;

/**
 * The Owner of a House
 */

public class Owner extends User{

    private static ArrayList<Owner> listOwner = new  ArrayList<>();

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
        listOwner.add(this);
    }

    public static int getNumOfOwners() {
        return listOwner.size();
    }

    public void remove(){
        listOwner.remove(this);
    }

    public static void removeAll() {
        listOwner.clear();
    }

}