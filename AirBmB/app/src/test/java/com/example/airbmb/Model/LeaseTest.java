package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Period;
import java.util.ArrayList;

public class LeaseTest {

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
        new Lease(period,1090,r,o);
        int numOfLeases = Lease.getNumOfLeases();
        Assert.assertEquals(1,numOfLeases);
    }

    @Test
    public void testSetAndGetDurationForDays() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1500,r,o);
        period = Period.of(2, 2, 15);
        lease.setDuration(period);
        Assert.assertEquals(15,lease.getDuration().getDays());
    }

    @Test
    public void testSetAndGetDurationForMonths() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1050,r,o);
        period = Period.of(1, 2, 15);
        lease.setDuration(period);
        Assert.assertEquals(2,lease.getDuration().getMonths());
    }

    @Test
    public void testSetAndGetDurationForYears() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1070,r,o);
        period = Period.of(1, 2, 15);
        lease.setDuration(period);
        Assert.assertEquals(1,lease.getDuration().getYears());
    }

    @Test
    public void testSetAndGetCost() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1040,r,o);
        lease.setCost(2000);
        Assert.assertEquals(2000,lease.getCost(),0.00001);
    }

    @Test
    public void testGetNumOfLeases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        new Lease(period,1020,r,o);
        period = Period.of(0,0,30);
        new Lease(period,1003,r,o);
        Assert.assertTrue(Lease.getNumOfLeases()==2);
    }

    @Test
    public void testGetAverageDuration() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        new Lease(period,1004,r,o);
        period = Period.of(0,0,30);
        new Lease(period,1003,r,o);
        period = Period.of(0, 0, 25);
        Assert.assertTrue(Lease.getAverageDuration().equals(period));
    }

    @Test
    public void testRemoveLeaseWith2Leases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1200,r,o);
        period = Period.of(0,0,30);
        new Lease(period,1020,r,o);
        lease.remove();
        Assert.assertEquals(1,Lease.getNumOfLeases());
    }

    @Test
    public void testRemoveLeaseWith1Lease() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1050,r,o);
        lease.remove();
        Assert.assertEquals(0,Lease.getNumOfLeases());
    }

    @Test
    public void testRemoveLeaseWithNoLeases() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease lease = new Lease(period,1030,r,o);
        lease.remove();
        lease.remove();
        Assert.assertEquals(0,Lease.getNumOfLeases());
    }

    @Test
    public void testHashCode() {
        Period period = Period.of(0,0,23);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease l1 = new Lease(period,1013,r,o);
        Lease l2 = l1;
        Assert.assertEquals(l1.hashCode(),l2.hashCode());
        Assert.assertTrue(l1.equals(l2));
    }

    @Test
    public void testEqualsWhenOneNull() {
        Period period = Period.of(0,0,23);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease l = new Lease(period,1013,r,o);
        Lease l2 = null;
        Assert.assertFalse(l.equals(l2));
    }

    @Test
    public void testEqualsWhenOtherClass() {
        Period period = Period.of(0,0,23);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease l = new Lease(period,1013,r,o);
        String s = "In the Castle of Aaaaaarg";
        Assert.assertFalse(l.equals(s));
    }

    @Test
    public void testEqualsWhenOtherId() {
        Period period = Period.of(0,0,20);
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Lease l = new Lease(period,1000,r,o);
        Lease l2 = new Lease(period,1000,r,o);
        Assert.assertFalse(l.equals(l2));
    }

    @Test
    public void testSimilarWhenEquals() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        Lease l2 = l;
        Assert.assertTrue(l.similarWith(l2));
    }

    @Test
    public void testSimilarWhenSimilar() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        Lease l2 = new Lease(period,1013,r,o);
        Assert.assertTrue(l.similarWith(l2));
    }

    @Test
    public void testSimilarWhenOneNull() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        Lease l2 = null;
        Assert.assertFalse(l.similarWith(l2));
    }

    @Test
    public void testSimilarWhenOtherClass() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        String s = "In the Castle of Aaaaaarg";
        Assert.assertFalse(l.similarWith(s));
    }

    @Test
    public void testSimilarWhenOtherDuration() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1000,r,o);
        period = Period.of(0,0,20);
        Lease l2 = new Lease(period,1000,r,o);
        Assert.assertFalse(l.similarWith(l2));
    }

    @Test
    public void testSimilarWhenOtherCost() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,20);
        Lease l = new Lease(period,1013,r,o);
        Lease l2 = new Lease(period,1000,r,o);
        Assert.assertFalse(l.similarWith(l2));
    }

    @Test
    public void testFindExistingLeaseById() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        period = Period.of(0,0,20);
        new Lease(period,1000,r,o);
        Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
        Assert.assertEquals(l,returnedLease);
    }

    @Test
    public void testFindMissingLeaseById() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        Lease l = new Lease(period,1013,r,o);
        l.remove();
        period = Period.of(0,0,20);
        new Lease(period,1000,r,o);
        Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
        Assert.assertNull(returnedLease);
    }

    @Test
    public void testFindLeaseByDuration() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,1,20);
        new Lease(period,1012,r,o);
        period = Period.of(0,1,20);
        new Lease(period,1010,r,o);
        period = Period.of(2,1,20);
        new Lease(period,1002,r,o);
        period = Period.of(0,1,20);
        ArrayList<Lease> leases1m20d = Lease.findLeaseByDuration(period);
        Assert.assertEquals(2,leases1m20d.size());
        Assert.assertTrue(leases1m20d.get(0).getDuration().equals(leases1m20d.get(1).getDuration()));
    }

    @Test
    public void testFindLeaseByCost() {
        Renter r = new Renter("firstName","lastName","email","IBAN","username","password");
        Owner o =new Owner("firstName","lastName","email","IBAN","username","password");
        Period period = Period.of(0,0,23);
        new Lease(period,1000,r,o);
        period = Period.of(0,0,20);
        new Lease(period,1000,r,o);
        period = Period.of(0,0,24);
        new Lease(period,1002,r,o);
        ArrayList<Lease> leases1000 = Lease.findLeaseByCost(1000);
        Assert.assertEquals(2,leases1000.size());
        Assert.assertEquals(leases1000.get(0).getCost(),leases1000.get(1).getCost(),0.00001);
    }


}