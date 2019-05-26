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

    /**
     * Sets user's first name
     * @param firstName
     */
    void setFirstName(String firstName);

    /**
     * Sets user's last name
     * @param lastName
     */
    void setLastName(String lastName);

    /**
     * Sets user's email
     * @param email email
     */
    void setEmail(String email);

    /**
     * Sets user's iban
     * @param iban Bank account number
     */
    void setIBAN(String iban);

    /**
     * Sets user's username
     * @param username username
     */
    void setUsername(String username);

    /**
     * Sets user's password
     * @param password password
     */
    void setPassword(String password);

    /**
     * Sets the page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * Shows a message if an activity was successfully finished
     * @param message message
     */
    void successfullyFinishActivity(String message);

    /**
     * Shows an error message
     * @param title title of message
     * @param message message
     */
    void showErrorMessage(String title, String message);
}
