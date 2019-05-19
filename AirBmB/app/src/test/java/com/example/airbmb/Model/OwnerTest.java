package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OwnerTest {

    @Before
    public void set(){
        Owner.removeAll();
    }

    @Test
    public void testOwner() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o3=new Owner ("firstName","lastName","email","IBAN","username","password");
        Assert.assertEquals(3,Owner.getNumOfOwners());
    }

    @Test
    public void testRemoveRenter() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        o1.remove();
        Assert.assertEquals(0,Owner.getNumOfOwners());
    }

    @Test
    public void testRemoveRenter2() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
        o1.remove();
        Assert.assertEquals(1,Owner.getNumOfOwners());
    }

    @Test
    public void testRemoveRenter3() {
        Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
        Owner.removeAll();
        o1.remove();
        Assert.assertEquals(0,Owner.getNumOfOwners());
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