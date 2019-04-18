import java.util.*;

public class Owner extends User{
    private int numOfOwners;
    private ArrayList<Owner> listOwner = new  ArrayList<>();
    private ArrayList<House> listHouse = new  ArrayList<>();


    Owner(long id, String firstName, String lastName, String email, String IBAN, String username, String password){
        super(id,firstName,lastName,email,IBAN,username,password);
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

    public void remove(Owner owner){
        listOwner.remove(owner);
    }

}
