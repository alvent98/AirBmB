package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class EvaluationForHouseTest {

	/*Ôhese should go on DAOTest
    @Before
    public void set(){
        EvaluationForHouse.removeAll();
    }
        
    @Test
    public void testGetAverageFeedbackForHouse() {
        LocalDate start1 = LocalDate.of(2019,4,25);
        LocalDate start2 = LocalDate.of(2019,5,10);
        LocalDate end1 = LocalDate.of(2019,5,2);
        LocalDate end2 = LocalDate.of(2019,5,15);
        Renter r1 = new Renter ("John" ,"Snow","got@info.gr", "01234567890123456","Revive", "Johny123");
        Renter r2 = new Renter ("Khaleesi" ,"Targaryen","dragons@info.gr", "01234567890123456","QueenOfDragons", "iLoveDragons123");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l1 = new Lease(start1,end1,1500, r1, h);
        Lease l2 = new Lease (start2,end2,1000,r2,h);
        new EvaluationForHouse(l1,4,"");
        new EvaluationForHouse(l2,0,"");
        Assert.assertEquals(2,EvaluationForHouse.getAverageFeedbackForHouse(),0.000001);
    }

    @Test
    public void testGetNumOfEvaluationsForHouse() {
        LocalDate start1 = LocalDate.of(2019,4,25);
        LocalDate start2 = LocalDate.of(2019,5,10);
        LocalDate end1 = LocalDate.of(2019,5,2);
        LocalDate end2 = LocalDate.of(2019,5,15);
        Renter r1 = new Renter ("John" ,"Snow","got@info.gr", "01234567890123456","Revive", "Johny123");
        Renter r2 = new Renter ("Khaleesi" ,"Targaryen","dragons@info.gr", "01234567890123456","QueenOfDragons", "iLoveDragons123");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l1 = new Lease(start1,end1,1500, r1, h);
        Lease l2 = new Lease (start2,end2,1000,r2,h);
        new EvaluationForHouse(l1,4);
        new EvaluationForHouse(l2,4,"");
        Assert.assertEquals(2,EvaluationForHouse.getNumOfEvaluations());
    }
    
    @Test
    public void testRemoveWithTwoEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForHouse e1 = new EvaluationForHouse(l,5);
        new EvaluationForHouse(l,1);
        e1.remove();
        Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());
    }

    @Test
    public void testRemoveWithOneEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForHouse e = new EvaluationForHouse(l,5);
        e.remove();
        Assert.assertEquals(0,EvaluationForHouse.getNumOfEvaluations());
    }

    @Test
    public void testRemoveWithNoEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForHouse e = new EvaluationForHouse(l,5);
        e.remove();
        e.remove();
        Assert.assertEquals(0,EvaluationForHouse.getNumOfEvaluations());
    }

	    @Test
    public void testEvaluationForHouseInt() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        new EvaluationForHouse(l,5);
        Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());
    }

    @Test
    public void testEvaluationForHouseIntString() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        new EvaluationForHouse(l,0,"The french knights were hostile");
        Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());
    }
    */
	
    @Test
    public void testSetAndGetCommentsAndFeedBack() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForHouse e = new EvaluationForHouse(l,3,"The french knights threw some animals towards our soldiers!");
        e.setComments("We fled these arrogant knights.");
        e.setFeedback(1);
        Assert.assertEquals(1,e.getFeedback());
        Assert.assertTrue(e.getComments().contentEquals("We fled these arrogant knights."));
    }

    @Test
    public void testHashCodeWhenEquals() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForHouse e1 = new EvaluationForHouse(l,2,"They said they didn't elect King Arthur, so they don't obey!");
        EvaluationForHouse e2 = e1;
        Assert.assertEquals(e1.hashCode(),e2.hashCode());
    }

    @Test
    public void testHashCodeWhenNotEquals() {
        LocalDate start1 = LocalDate.of(2019,4,25);
        LocalDate start2 = LocalDate.of(2019,5,10);
        LocalDate end1 = LocalDate.of(2019,5,2);
        LocalDate end2 = LocalDate.of(2019,5,15);
        Renter r1 = new Renter ("John" ,"Snow","got@info.gr", "01234567890123456","Revive", "Johny123");
        Renter r2 = new Renter ("Khaleesi" ,"Targaryen","dragons@info.gr", "01234567890123456","QueenOfDragons", "iLoveDragons123");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l1 = new Lease(start1,end1,1500, r1, h);
        Lease l2 = new Lease (start2,end2,1000,r2,h);
        EvaluationForHouse e1 = new EvaluationForHouse(l1,0,"The old man killed Sir Kalahan.");
        EvaluationForHouse e2 = new EvaluationForHouse(l2,0,"The black knight had just a small skratch, he said.");
        Assert.assertNotEquals(e1.hashCode(),e2.hashCode());
    }

    @Test
    public void testEqualsWhenNotEquals() {
        LocalDate start1 = LocalDate.of(2019,4,25);
        LocalDate start2 = LocalDate.of(2019,5,10);
        LocalDate end1 = LocalDate.of(2019,5,2);
        LocalDate end2 = LocalDate.of(2019,5,15);
        Renter r1 = new Renter ("John" ,"Snow","got@info.gr", "01234567890123456","Revive", "Johny123");
        Renter r2 = new Renter ("Khaleesi" ,"Targaryen","dragons@info.gr", "01234567890123456","QueenOfDragons", "iLoveDragons123");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l1 = new Lease(start1,end1,1500, r1, h);
        Lease l2 = new Lease (start2,end2,1000,r2,h);
        EvaluationForHouse e1 = new EvaluationForHouse(l1,2,"The black knight didn't let us pass.");
        EvaluationForHouse e2 = new EvaluationForHouse(l2,0,"The knights who say \"ni\", demanded a srawberry.");
        Assert.assertFalse(e1.equals(e2));
    }
}