package com.example.airbmb.View.Renter.AddEditRenter;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.Renter;
import com.example.airbmb.View.User.AddEditUserView;

public class AddEditRenterPresenter
{
    private AddEditUserView view;

    private RenterDAO renters;

    private Renter attachedRenter;
    
    private boolean isValidIBAN(String in) {
    	if(in.length()<15 || in.length()>31) return false;
    	for(int i = 0; i < 2; i++) if(!Character.isAlphabetic(in.charAt(i))) return false;
    	return true;
    }
    
    private boolean isValidName(String in) {
    	if(in.length()<2 || in.length()>15) return false;
    	for(int i = 0; i < in.length(); i++) if(!Character.isAlphabetic(in.charAt(i))) return false;
    	return true;
    }
    
    private boolean validateCredential(String in) {
    	if(in.length()<2 || in.length()>15) return false;
    	if(in.toLowerCase().equals(in)) return false;
    	return true;
    }
    
    private boolean validateEmail(String email) {
    	int posOfPapaki = -1;
    	int posOfDot = -1 ;
    	if(email.contains("@") && email.contains(".") && !email.contains(" ")) {
    		for(int i = 0; i < email.length(); i++) {
        		if(email.charAt(i)=='@') posOfPapaki = i;
        		if(email.charAt(i)=='.') posOfDot = i;
        	}
    		if(posOfPapaki>0 && posOfPapaki<email.length()-5)
    			if(posOfDot>2 && posOfDot<email.length()-3) 
    				if(posOfPapaki < posOfDot) return true;
    	}    	
		return false;
	}

    public AddEditRenterPresenter(AddEditUserView view, RenterDAO renters)
    {
        this.view = view;
        this.renters = renters;

        Integer attachedRenterID = view.getAttachedUserId();
        attachedRenter = attachedRenterID == null ? null : renters.find(attachedRenterID);

        if(attachedRenter != null)//edit mode
        {
            view.setPageName("Renter No " + attachedRenter.getId());
            view.setFirstName(attachedRenter.getFirstName());
            view.setLastName(attachedRenter.getLastName());
            view.setEmail(attachedRenter.getEmail());
            view.setIBAN(attachedRenter.getIBAN());
            view.setUsername(attachedRenter.getUsername());
            view.setPassword(attachedRenter.getPassword());
        }
    }

    public void onSaveRenter()
    {
        String  firstName = view.getFirstName(),
        		lastName = view.getLastName(),
                email = view.getEmail(),
                iban = view.getIBAN(),
                username = view.getUsername(),
                password = view.getPassword();

        if(!isValidName(firstName))
            view.showErrorMessage("Invalid first name length","The first name must be between 2 and 15 letters.");
        if(!isValidName(lastName))
            view.showErrorMessage("Invalid last name length","The last name must be between 2 and 15 letters.");
        else if(email.length() < 2 || email.length() > 100 || !validateEmail(email))
            view.showErrorMessage("Invalid email","The email is invalid");
        else if(!isValidIBAN(iban))
            view.showErrorMessage("Invalid IBAN","The IBAN is invalid.");       
        else if(!validateCredential(username))
            view.showErrorMessage("Invalid Username",
            		"The Username must be between 2 and 15 letters and must contain at least one capital letter.");     
        else if(!validateCredential(password))
            view.showErrorMessage("Invalid Password",
            		"The Password must be between 2 and 15 letters and must contain at least one capital letter.");       
        else
        {
            if(attachedRenter == null)//add
            {
            	renters.save(new Renter(firstName,lastName,email,iban,username,password));
                view.successfullyFinishActivity("Successful Add of "+lastName+"!");

            }
            else//update
            {
            	attachedRenter.setFirstName(firstName);
            	attachedRenter.setLastName(lastName);
            	attachedRenter.setEmail(email);
            	attachedRenter.setIBAN(iban);
            	attachedRenter.setUsername(username);
            	attachedRenter.setPassword(password);

                view.successfullyFinishActivity("Successful Edit of "+lastName+"!");
            }
        }
    }
}
