package com.example.airbmb.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class EvaluationForRenterTest {

    @Before
    public void set(){
        EvaluationForRenter.removeAll();
    }

    @Test
    public void testRemoveWithTwoEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e1 = new EvaluationForRenter(l,5);
        new EvaluationForRenter(l,1,"King Arthur wanted to take our Holy Grail.",100);
        e1.remove();
        Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testRemoveWithOneEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,5);
        e.remove();
        Assert.assertEquals(0,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testRemoveWithNoEval() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,5);
        e.remove();
        e.remove();
        Assert.assertEquals(0,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testEvaluationForRenterInt() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        new EvaluationForRenter(l,5);
        Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testEvaluationForRenterIntStringInt() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        new EvaluationForRenter(l,0,"Police was called in front of the Castle of Aaarg, because of the knights.",2000);
        Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testSetAndGetRepairsValue() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,2,"The Vikings sung all the time about Spam.",20);
        e.setRepairsValue(200); //They keep singing...
        Assert.assertEquals(200,e.getRepairsValue());
    }

    @Test
    public void testSetAndGetCommentsAndFeedBack() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,4,"The rabbit in the cave has two sharp teeths!",20);
        e.setComments("The rabbit killed five knights, Bors, Gawain and Hector!");
        e.setFeedback(1); //Don't worry, we have the Holy Hand Grenade!
        Assert.assertEquals(1,e.getFeedback());
        Assert.assertTrue(e.getComments().contentEquals("The rabbit killed five knights, Bors, Gawain and Hector!"));
    }

    @Test
    public void testHashCodeWhenEquals() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e1 = new EvaluationForRenter(l,2,"King Arthur oppressed the free peasants.",20);
        EvaluationForRenter e2 = e1;
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
        EvaluationForRenter e1 = new EvaluationForRenter(l1,2,"",20);
        EvaluationForRenter e2 = new EvaluationForRenter(l2,0,"",4);
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
        EvaluationForRenter e1 = new EvaluationForRenter(l1,2,"King Arthur oppressed the free peasants.",20);
        EvaluationForRenter e2 = new EvaluationForRenter(l2,0,"",4);
        Assert.assertFalse(e1.equals(e2));
    }

    @Test
    public void testGetAverageFeedbackForRenter() {
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
        new EvaluationForRenter(l1,4,"The Hungarian visitor is arrogant.",500);
        new EvaluationForRenter(l2,0,"The Hungarian visitor hit me.",1000);
        Assert.assertEquals(2,EvaluationForRenter.getAverageFeedback(),0.000001);
    }

    @Test
    public void testGetNumOfEvaluationsForRenter() {
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
        new EvaluationForRenter(l1,4);
        new EvaluationForRenter(l2,4,"The Magi visited the wrong stable.",1000);
        Assert.assertEquals(2,EvaluationForRenter.getNumOfEvaluations());
    }

    @Test
    public void testDamagesWhenTrue() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,2,"I didn't like the Spam!",10);
        Assert.assertTrue(e.damages());
    }

    @Test
    public void testDamagesWhenFalse() {
        LocalDate start = LocalDate.of(2019,5,25);
        LocalDate end = LocalDate.of(2019,5,30);
        Renter r = new Renter ("name" ,"lastName","email@info.gr", "01234567890123456","username", "password");
        Owner o = new Owner("name", "lastname", "owner@info.gr", "987654321032568","owner", "passOwner");
        House h = new House ("city", "street", 50,100,3,2,1500,o);
        Lease l = new Lease(start,end,1500, r, h);
        EvaluationForRenter e = new EvaluationForRenter(l,1);
        Assert.assertFalse(e.damages());
    }

}