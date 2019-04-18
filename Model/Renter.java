import java.util.*;

public class Renter extends User{

    private int numOfRenters;
    private ArrayList<Renter> listRenter=new ArrayList<>();

    Renter(long id, String firstName, String lastName, String email, String IBAN, String username, String password){
        super(id,firstName,lastName,email,IBAN,username,password);
        listRenter.add(this);
    }

    public int getNumOfRenters() {
        return listRenter.size();
    }

    public void remove(Renter renter){
        listRenter.remove(renter);
    }
}
