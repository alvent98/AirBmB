package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Test;

public class RenterTest {

    /* @Before These should go on DAO test
    public void set(){
        Renter.removeAll();
    }
    
    @Test
    public void testRenter() {
        new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        Assert.assertEquals(3,Renter.getNumOfRenters());
    }
    
    @Test
    public void testRemoveRenter() {
        Renter r1=new Renter ("firstName","lastName","email","IBAN","username","password");
        r1.remove();
        Assert.assertEquals(0,Renter.getNumOfRenters());
    }

    @Test
    public void testRemoveRenter2() {
        Renter r1=new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        r1.remove();
        Assert.assertEquals(1,Renter.getNumOfRenters());
    }

    @Test
    public void testRemoveRenter3() {
        Renter r1=new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter.removeAll();
        r1.remove();
        Assert.assertEquals(0,Renter.getNumOfRenters());
    }
    
    */

	@Test
    public void testSetAndGetFirstName() {
        Renter r=new Renter ("firstName","lastName","email","IBAN","username","password");
        String name = "Brave Sir Robbin";
        r.setFirstName(name);
        Assert.assertEquals(r.getFirstName(),name);
    }
	
	@Test
    public void testSetAndGetLastName() {
        Renter r =new Renter ("firstName","lastName","email","IBAN","username","password");
        String name = "Black Adder";
        r.setLastName(name);
        Assert.assertEquals(r.getLastName(),name);
    }
	
	@Test
    public void testSetAndGetEmail() {
        Renter r =new Renter ("firstName","lastName","email","IBAN","username","password");
        String email = "em@il";
        r.setEmail(email);
        Assert.assertEquals(r.getEmail(),email);
    }
	
	@Test
    public void testSetAndGetIban() {
        Renter r =new Renter ("firstName","lastName","email","IBAN","username","password");
        String iban = "GR0000111666";
        r.setIBAN(iban);
        Assert.assertEquals(r.getIBAN(),iban);
    }
	
	@Test
    public void testSetAndGetUsername() {
        Renter r =new Renter ("firstName","lastName","email","IBAN","username","password");
        String username = "CoconutCarrier";
        r.setUsername(username);
        Assert.assertEquals(r.getUsername(),username);
    }
	
	@Test
    public void testSetAndGetPassword() {
        Renter r =new Renter ("firstName","lastName","email","IBAN","username","password");
        String password = "OpenTheDoor!";
        r.setPassword(password);
        Assert.assertEquals(r.getPassword(),password);
    }
	
    @Test
    public void testEquals() {
        Renter r1=new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter r2=r1;
        Assert.assertTrue(r1.equals(r2));
    }

    @Test
    public void testNotEquals() {
        Renter r1=new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter r2=new Renter ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(r1.equals(r2));
    }

    @Test
    public void testEqualsNull() {
        Renter r1=null;
        Renter r2=new Renter ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(r2.equals(r1));
    }

}