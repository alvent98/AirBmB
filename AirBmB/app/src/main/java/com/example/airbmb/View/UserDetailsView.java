package com.example.airbmb.View;

public interface UserDetailsView
{
	String getId();

	void setFirstName(String firstName);    
    void setLastName(String lastName);
    void setEmail(String email);    
    void setIBAN(String iban);
    void setUsername(String username);
    void setPassword(String password);

    void setPageName(String value);

    void startEdit(int publisherID);

    void startShowHouses(int publisherID);

    void showToast(String value);
}
