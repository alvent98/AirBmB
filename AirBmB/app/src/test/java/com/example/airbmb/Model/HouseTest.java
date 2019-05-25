package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Test;

public class HouseTest {

    /*@Before This should go on DAO test
    public void set(){
        House.removeAll();
    }
    
    
    @Test
    public void testGetAveragePrice() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        new House("city","Backer Street", 12, 100,2, 2, 1500,o);
        new House("city","Backer Street", 12, 100,2, 2, 3000,o);
        new House("city","Backer Street", 12, 100, 2, 2, 4500,o);
        new House("city","Backer Street", 12, 100, 2, 2, 6000,o);
        Assert.assertEquals(3750,House.getAveragePrice(),0.001);
    }

    @Test
    public void testGetAveragePriceWithNoHouses() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","Backer Street", 12, 100, 2, 2, 1500,o);
        h1.remove();
        Assert.assertEquals(0,House.getAveragePrice(),0.001);
    }


    @Test
    public void testRemoveOneObj() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","Backer Street", 12, 100, 2, 2, 200,o);
        h1.remove();
        Assert.assertEquals(0,House.getNumOfHouses());
    }

    @Test
    public void testRemoveNoObj() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","Backer Street", 12, 100, 2, 2, 200,o);
        h1.remove();
        h1.remove();
        Assert.assertEquals(0,House.getNumOfHouses());
    }
    */

    @Test
    public void testHouse() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        new House("city","street", 12, 100, 2, 2, 200,o);
        new House("city","street", 12, 100, 2, 2, 200,o);
        new House("city","street", 12, 100, 2, 2, 200,o);
        Assert.assertEquals(3,House.getNumOfHouses());
    }

    @Test
    public void testSetNumber() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","street", 12, 100, 2, 2, 200,o);
        h1.setNumber(25);
        Assert.assertEquals(25, h1.getNumber());
    }

    @Test
    public void testSetArea() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","street", 12, 100, 2, 2, 200,o);
        h1.setArea(250);
        Assert.assertEquals(250, h1.getArea());
    }

    @Test
    public void testSetPrice() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","street", 12, 100, 2, 2, 200,o);
        h1.setPrice(350);
        Assert.assertEquals(350, h1.getPrice());
    }

    @Test
    public void testEqualsFalse() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","street", 12, 100, 2, 2, 200,o);
        House h2 = new House("city","street", 12, 100, 2, 2, 200,o);
        h1.setCity("lalaland");
        Assert.assertFalse(h1.equals(h2));
    }

    @Test
    public void testEqualsTrue() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","Backer Street", 12, 100, 2, 2, 200,o);
        House h2=h1;
        Assert.assertEquals(h1.hashCode(),h2.hashCode());
        Assert.assertTrue(h1.equals(h2));
    }

    @Test
    public void testEqualsNull() {
    	Owner o =new Owner ("firstName","lastName","email","IBAN","username","password");
        House h1 = new House("city","Backer Street", 12, 100,2, 2, 200,o);
        House h2=null;
        Assert.assertFalse(h1.equals(h2));
    }
}