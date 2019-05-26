package com.example.airbmb.View.User;

public interface UserDetailsView
{
	int getAttachedUserId();

    /**
     * Sets user's unique id
     * @param id unique id
     */
	void setId(int id);

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
     * @param email
     */
    void setEmail(String email);

    /**
     * Sets user's iban
     * @param iban
     */
    void setIBAN(String iban);

    /**
     * Sets user's username
     * @param username
     */
    void setUsername(String username);

    /**
     * Sets user's password
     * @param password
     */
    void setPassword(String password);

    /**
     * Sets page's name
     * @param value page's name
     */
    void setPageName(String value);

    /**
     * Shows renter's edit button
     * @param renterID renter's unique id
     */
    void startEdit(int renterID);

    /**
     * Shows user's delete message
     * @param title title of message
     * @param msg message
     */
    void startDelete(String title, String msg);

    /**
     * Deletes the user from the list and shows a message
     * @param msg message
     */
    void doDeleteAndFinish(String msg);

    /**
     * Shows a toast message
     * @param value message
     */
    void showToast(String value);
}
