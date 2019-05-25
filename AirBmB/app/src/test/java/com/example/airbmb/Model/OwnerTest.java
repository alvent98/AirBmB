package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Test;

public class OwnerTest {

    /*@Before These should go on DAO test
    public void set(){
        Owner.removeAll();
    }
    
    @Test
    public void testRemoveRenter() {
        Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        o.remove();
        Assert.assertEquals(0,Owner.getNumOfOwners());
    }

    @Test
    public void testRemoveRenter2() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        new Owner ("firstName","lastName","email","IBAN","username","password");
        o1.remove();
        Assert.assertEquals(1,Owner.getNumOfOwners());
    }

    @Test
    public void testRemoveRenter3() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner.removeAll();
        o1.remove();
        Assert.assertEquals(0,Owner.getNumOfOwners());
        
    @Test
    public void testOwner() {
        new Owner ("firstName","lastName","email","IBAN","username","password");
        new Owner ("firstName","lastName","email","IBAN","username","password");
        new Owner ("firstName","lastName","email","IBAN","username","password");
        Assert.assertEquals(3,Owner.getNumOfOwners());
    }
    }
    */
	
	@Test
    public void testSetAndGetFirstName() {
        Owner r=new Owner ("firstName","lastName","email","IBAN","username","password");
        String name = "Brave Sir Robbin";
        r.setFirstName(name);
        Assert.assertEquals(r.getFirstName(),name);
    }
	
	@Test
    public void testSetAndGetLastName() {
        Owner r =new Owner ("firstName","lastName","email","IBAN","username","password");
        String name = "Black Adder";
        r.setLastName(name);
        Assert.assertEquals(r.getLastName(),name);
    }
	
	@Test
    public void testSetAndGetEmail() {
        Owner r =new Owner ("firstName","lastName","email","IBAN","username","password");
        String email = "em@il";
        r.setEmail(email);
        Assert.assertEquals(r.getEmail(),email);
    }
	
	@Test
    public void testSetAndGetIban() {
        Owner r =new Owner ("firstName","lastName","email","IBAN","username","password");
        String iban = "GR0000111666";
        r.setIBAN(iban);
        Assert.assertEquals(r.getIBAN(),iban);
    }
	
	@Test
    public void testSetAndGetUsername() {
        Owner r =new Owner ("firstName","lastName","email","IBAN","username","password");
        String username = "CoconutCarrier";
        r.setUsername(username);
        Assert.assertEquals(r.getUsername(),username);
    }
	
	@Test
    public void testSetAndGetPassword() {
        Owner r =new Owner ("firstName","lastName","email","IBAN","username","password");
        String password = "OpenTheDoor!";
        r.setPassword(password);
        Assert.assertEquals(r.getPassword(),password);
    }
	
    @Test
    public void testEquals() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o2=o1;
        Assert.assertTrue(o1.equals(o2));
    }

    @Test
    public void testNotEquals() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testEqualsNull() {
        Owner o1=null;
        Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(o2.equals(o1));
    }


}