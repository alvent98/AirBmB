import java.util.Random;

public abstract class User {
    Random random = new Random();
    private long id = (long)random.nextInt() + (long) (1L << 31);
    private String firstName;
    private String lastName;
    private String email;
    private String IBAN;
    private String username;
    private String password;


    User(){}

    User(long id, String firstName, String lastName, String email, String IBAN, String username, String password){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.IBAN=IBAN;
        this.username=username;
        this.password=password;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setIBAN(String IBAN){
        this.IBAN=IBAN;
    }

    public String getIBAN(){
        return this.IBAN;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void remove(User user){};


}
