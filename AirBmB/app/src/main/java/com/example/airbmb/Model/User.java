package com.example.airbmb.Model;

import java.util.Objects;

/**
 * Main class of a User
 */
public class User {

    private static int num = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String IBAN;
    private String username;
    private String password;

    /**
     * Constructor that initializes the basic characteristics of a user
     * @param firstName First Name
     * @param lastName Last Name
     * @param email E-mail
     * @param IBAN Bank Account Number
     * @param username Username
     * @param password Password
     */
    public User(String firstName, String lastName, String email, String IBAN, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.IBAN = IBAN;
        this.username = username;
        this.password = password;
        id = num++;
    }

    /**
     * Returns user's ID
     * User's ID is unique for each user
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets user's first name
     * @param firstName First Name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns user's first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets user's last name
     * @param lastName Last Name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns user's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets user's email
     * @param email E-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns user's email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets user's IBAN
     * @param IBAN Bank Account Number
     */
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    /**
     * Returns user's IBAN
     * @return IBAN
     */
    public String getIBAN() {
        return this.IBAN;
    }

    /**
     * Sets user's username
     * @param username Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Return user's username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets user's password
     * @param password Password
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns user's password
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * This method tests if two objects are equal.
     * @param o the object to be tested
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    /**
     * This method generates a hash code for the id
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}