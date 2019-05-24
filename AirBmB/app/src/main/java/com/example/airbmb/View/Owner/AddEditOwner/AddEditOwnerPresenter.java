package com.example.airbmb.View.Owner.AddEditOwner;

import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Model.Owner;
import com.example.airbmb.View.User.AddEditUserView;

public class AddEditOwnerPresenter
{
    private AddEditUserView view;

    private OwnerDAO owners;

    private Owner attachedOwner;
    
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

    public AddEditOwnerPresenter(AddEditUserView view, OwnerDAO owners)
    {
        this.view = view;
        this.owners = owners;

        Integer attachedOwnerID = view.getAttachedUserId();
        attachedOwner = attachedOwnerID == null ? null : owners.find(attachedOwnerID);

        if(attachedOwner != null)//edit mode
        {
            view.setPageName("Owner No " + attachedOwner.getId());
            view.setFirstName(attachedOwner.getFirstName());
            view.setLastName(attachedOwner.getLastName());
            view.setEmail(attachedOwner.getEmail());
            view.setIBAN(attachedOwner.getIBAN());
            view.setUsername(attachedOwner.getUsername());
            view.setPassword(attachedOwner.getPassword());
        }
    }

    public void onSaveOwner()
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
            if(attachedOwner == null)//add
            {
            	owners.save(new Owner(firstName,lastName,email,iban,username,password));
                view.successfullyFinishActivity("Successful Add of "+lastName+"!");

            }
            else//update
            {
            	attachedOwner.setFirstName(firstName);
            	attachedOwner.setLastName(lastName);
            	attachedOwner.setEmail(email);
            	attachedOwner.setIBAN(iban);
            	attachedOwner.setUsername(username);
            	attachedOwner.setPassword(password);

                view.successfullyFinishActivity("Successful Edit of "+lastName+"!");
            }
        }
    }
}
