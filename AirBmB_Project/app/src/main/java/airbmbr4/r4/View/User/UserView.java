package airbmbr4.r4.View.User;

import android.view.View;

public interface UserView extends View {
	public void setUserId(long id);
	public int getUserId();
	
	public void setFirstName(String firstName);
	public String getFirstName();
	
	public void setLastName(String lastName);
	public String getLastName();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void setIBAN(String IBAN);
	public String getIBAN();
	
	public void setUsername(String username);
	public String getUsername();
	
	public void setPassword(String password);
	public String getPassword();	
}
