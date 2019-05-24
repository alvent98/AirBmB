package com.example.airbmb.View.User;

public interface UserDetailsView
{
	int getAttachedUserId();

	void setId(int id);
	void setFirstName(String firstName);    
    void setLastName(String lastName);
    void setEmail(String email);    
    void setIBAN(String iban);
    void setUsername(String username);
    void setPassword(String password);

    void setPageName(String value);

    void startEdit(int renterID);

    void startDelete(String title, String msg);

    void doDeleteAndFinish(String msg);
    
    void showToast(String value);
}
