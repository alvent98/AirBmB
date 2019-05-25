package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LeaseTest {

	/* These should go to the DAO test, possibly.
    @Before
    public void set() {
        Lease.removeAll();
    }

    @Test
    public void testGetNumOfLeasesWithNoLeases() {
        int numOfLeases = Lease.getNumOfLeases();
        Assert.assertEquals(0,numOfLeases);
    }

    @Test
    public void testGetNumOfLeasesWithLeases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        new Lease(start,end,1090,r, h);
        int numOfLeases = Lease.getNumOfLeases();
        Assert.assertEquals(1,numOfLeases);
    }
    
    @Test
    public void testGetNumOfLeases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        new Lease(start,end,1020,r, h);
        period = Period.of(0,0,30);
        new Lease(start,end,1003,r, h);
        Assert.assertTrue(Lease.getNumOfLeases()==2);
    }
    
        @Test
    public void testRemoveLeaseWith2Leases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(start,end,1200,r, h);
        period = Period.of(0,0,30);
        new Lease(start,end,1020,r, h);
        lease.remove();
        Assert.assertEquals(1,Lease.getNumOfLeases());
    }
    
    @Test
    public void testRemoveLeaseWith1Lease() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(start,end,1050,r, h);
        lease.remove();
        Assert.assertEquals(0,Lease.getNumOfLeases());
    }

    @Test
    public void testRemoveLeaseWithNoLeases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(start,end,1030,r, h);
        lease.remove();
        lease.remove();
        Assert.assertEquals(0,Lease.getNumOfLeases());
    }
    
        @Test
    public void testFindExistingLeaseById() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Period period = Period.of(0,0,23);
        Lease l = new Lease(start,end,1013,r, h);
        period = Period.of(0,0,20);
        new Lease(start,end,1000,r, h);
        Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
        Assert.assertEquals(l,returnedLease);
    }

    @Test
    public void testFindMissingLeaseById() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Period period = Period.of(0,0,23);
        Lease l = new Lease(start,end,1013,r, h);
        l.remove();
        period = Period.of(0,0,20);
        new Lease(start,end,1000,r, h);
        Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
        Assert.assertNull(returnedLease);
    }
    
    @Test
    public void testFindLeaseByDuration() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Period period = Period.of(0,1,20);
        new Lease(start,end,1012,r, h);
        period = Period.of(0,1,20);
        new Lease(start,end,1010,r, h);
        period = Period.of(2,1,20);
        new Lease(start,end,1002,r, h);
        period = Period.of(0,1,20);
        ArrayList<Lease> leases1m20d = Lease.findLeaseByDuration(period);
        Assert.assertEquals(2,leases1m20d.size());
        Assert.assertTrue(leases1m20d.get(0).getDuration().equals(leases1m20d.get(1).getDuration()));
    }
    
    @Test
    public void testFindLeaseByCost() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        new Lease(start,end,1000,r, h);
        new Lease(start,end,1000,r, h);
        new Lease(start,end,1002,r, h);
        ArrayList<Lease> leases1000 = Lease.findLeaseByCost(1000);
        Assert.assertEquals(2,leases1000.size());
        Assert.assertEquals(leases1000.get(0).getCost(),leases1000.get(1).getCost(),0.00001);
    }*/

    @Test
    public void testSetAndGetStartDate() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(null,end,1500,r, h);
        lease.setStartDate(start);
        Assert.assertEquals(start.toString(),lease.getStartDate().toString());
    }

    @Test
    public void testSetAndGetEndDate() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(start,null,1500,r, h);
        lease.setEndDate(end);
        Assert.assertEquals(end.toString(),lease.getEndDate().toString());
    }

    @Test
    public void testSetAndGetCost() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease lease = new Lease(start,end,1040,r, h);
        lease.setCost(2000);
        Assert.assertEquals(2000,lease.getCost(),0.00001);
    }

    @Test
    public void testHashCode() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease l1 = new Lease(start,end,1013,r, h);
        Lease l2 = l1;
        Assert.assertEquals(l1.hashCode(),l2.hashCode());
        Assert.assertTrue(l1.equals(l2));
    }

    @Test
    public void testEqualsWhenOneNull() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease l = new Lease(start,end,1013,r, h);
        Lease l2 = null;
        Assert.assertFalse(l.equals(l2));
    }

    @Test
    public void testEqualsWhenOtherClass() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease l = new Lease(start,end,1013,r, h);
        String s = "In the Castle of Aaaaaarg";
        Assert.assertFalse(l.equals(s));
    }

    @Test
    public void testEqualsWhenOtherId() {
    	LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        House h = new House("city","street", 12, 100, 2, 2, 200,o);
        Lease l = new Lease(start,end,1000,r, h);
        Lease l2 = new Lease(start,end,1000,r, h);
        Assert.assertFalse(l.equals(l2));
    }
}