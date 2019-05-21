package project_airbmb.airbmb.Model;

import java.util.*;

public class Owner extends User{

    private int numOfOwners;
    private static ArrayList<Owner> listOwner = new  ArrayList<>();
    private static ArrayList<House> listHouse = new  ArrayList<>();


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