package project_airbmb.airbmb.Model;

import java.util.Objects;

public class User {

    private static int num = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String IBAN;
    private String username;
    private String password;

    public User(String firstName, String lastName, String email, String IBAN, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.IBAN = IBAN;
        this.username = username;
        this.password = password;
        id = num++;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void remove(User user) {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}