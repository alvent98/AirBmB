package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RenterTest {

    @Before
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
        Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
        R1.remove();
        Assert.assertEquals(0,Renter.getNumOfRenters());
    }

    @Test
    public void testRemoveRenter2() {
        Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        R1.remove();
        Assert.assertEquals(1,Renter.getNumOfRenters());
    }

    @Test
    public void testRemoveRenter3() {
        Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
        new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter.removeAll();
        R1.remove();
        Assert.assertEquals(0,Renter.getNumOfRenters());
    }

    @Test
    public void testEquals() {
        Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter R2=R1;
        Assert.assertTrue(R1.equals(R2));
    }

    @Test
    public void testNotEquals() {
        Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
        Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(R1.equals(R2));
    }

    @Test
    public void testEqualsNull() {
        Renter R1=null;
        Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
        Assert.assertFalse(R2.equals(R1));
    }

}