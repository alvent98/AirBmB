import java.util.*;

public class Owner extends User{
    private int numOfOwners;
    ArrayList<User> listOwner = new  ArrayList<>();
    ArrayList<House> listHouse = new  ArrayList<>();


    Owner(String firstName, String lastName, String email, String IBAN, String username, String password){
        super(firstName,lastName,email,IBAN,username,password);
        listOwner.add(this);
    }

    public int getNumOfOwners() {
        return listOwner.size();
    }

    public void addHouse(House house){
        listHouse.add(house);
    }

    public void removeHouse(House house){
        listHouse.remove(house);
    }

    public void remove (Owner owner){
        listOwner.remove(owner);
    }

}
