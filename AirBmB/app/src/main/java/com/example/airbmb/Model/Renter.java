package com.example.airbmb.Model;

import java.util.*;

public class Renter extends User {

    private static ArrayList<Renter> listRenter=new ArrayList<>();

    public Renter(String firstName, String lastName, String email, String IBAN, String username, String password){
        super(firstName,lastName,email,IBAN,username,password);
        listRenter.add(this);
    }

    public static int getNumOfRenters() {
        return listRenter.size();
    }

    public void remove(){
        listRenter.remove(this);
    }

    public static void removeAll() {
        listRenter.clear();
    }


}