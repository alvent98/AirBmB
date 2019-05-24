package com.example.airbmb.View.Renter.AddEditRenter;

public class AddEditRenterViewStub {
	private String firstName, lastName, email, iban, username, password, pageName, errorTitle, 
	errorMessage, finishMessage;

	private Integer attachedRenterID;
	
	//private AddEditHousePresenter presenter;
	
	/*public void setPresenter(AddEditHousePresenter presenter) {
	   this.presenter = presenter;
	}
	
	public AddEditHousePresenter getPresenter() {
	   return presenter;
	}*/
	
	public AddEditRenterViewStub()
	{
	   firstName = lastName = firstName = lastName = email = iban = username = password= 
			   pageName = errorTitle = errorMessage = finishMessage = "";
	}
	
	public void setAttachedRenterID(Integer val)
	{
		attachedRenterID = val;
	}
	
	public String getPageName()
	{
	   return pageName;
	}
	
	public String getErrorTitle()
	{
	   return errorTitle;
	}
	
	public String getErrorMessage()
	{
	   return errorMessage;
	}
	
	public String getFinishMessage()
	{
	   return finishMessage;
	}
	
	public String getFirstName()
	{
	   return firstName;
	}
	
	public String getLastName()
	{
	   return lastName;
	}
	
	public String getEmail()
	{
	   return email;
	}
	
	public String getIBAN() {
        return iban;
    }
	
	public String getUsername() {
        return username;
    }
	
	public String getPassword() {
        return password;
    }
	
	public Integer getAttachedRenterID()
	{
	   return attachedRenterID;
	}
	
	public void setFirstName(String value)
	{
	   firstName = value;
	}
	
	public void setLastName(String value)
	{
	   lastName = value;
	}
	
	public void setEmail(String value)
	{
	   email = value;
	}
	
	public void setIBAN(String iban) {
        this.iban = iban;
    }
	
	public void setUsername(String username) {
        this.username = username;
    }
	
	public void setPassword(String password) {
        this.password = password;
    }
	
	public void setPageName(String value)
	{
	   pageName = value;
	}
	
	public void successfullyFinishActivity(String message)
	{
	   finishMessage = message;
	}
	
	public void showErrorMessage(String title, String message)
	{
	   errorTitle = title;
	   errorMessage = message;
	}
}
