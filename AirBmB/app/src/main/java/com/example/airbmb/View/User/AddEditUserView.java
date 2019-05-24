package com.example.airbmb.View.User;

public interface AddEditUserView
{
	int getAttachedUserId();
	String getFirstName();
	String getLastName();
    String getEmail();
    String getIBAN();
    String getUsername();
    String getPassword();

    void setFirstName(String firstName);    
    void setLastName(String lastName);
    void setEmail(String email);    
    void setIBAN(String iban);
    void setUsername(String username);
    void setPassword(String password);
    
    void setPageName(String value);
    void successfullyFinishActivity(String message);
    void showErrorMessage(String title, String message);
}
