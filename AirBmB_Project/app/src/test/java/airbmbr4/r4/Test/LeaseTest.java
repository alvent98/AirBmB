package airbmbr4.r4.Test;

import airbmbr4.r4.Model.Lease;
import java.time.Period;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class LeaseTest {

	@Before
	void set() {
		Lease.removeAll();
	}
	
	@Test
	void testGetNumOfLeasesWithNoLeases() {
		int numOfLeases = Lease.getNumOfLeases();
		Assert.assertEquals(0,numOfLeases);
	}
	
	@Test
	void testGetNumOfLeasesWithLeases() {
		Period period = Period.of(0,0,20);
		new Lease(period,1090);
		int numOfLeases = Lease.getNumOfLeases();
		Assert.assertEquals(1,numOfLeases);
	}

	@Test
	void testSetAndGetDurationForDays() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1500);
		period = Period.of(2, 2, 15);
		lease.setDuration(period);
		Assert.assertEquals(15,lease.getDuration().getDays());
	}
	
	@Test
	void testSetAndGetDurationForMonths() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1050);
		period = Period.of(1, 2, 15);
		lease.setDuration(period);
		Assert.assertEquals(2,lease.getDuration().getMonths());
	}
	
	@Test
	void testSetAndGetDurationForYears() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1070);
		period = Period.of(1, 2, 15);
		lease.setDuration(period);
		Assert.assertEquals(1,lease.getDuration().getYears());
	}

	@Test
	void testSetAndGetCost() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1040);
		lease.setCost(2000);
		Assert.assertEquals(2000,lease.getCost(),0.00001);
	}

	@Test
	void testGetNumOfLeases() {
		Period period = Period.of(0,0,20);
		new Lease(period,1020);
		period = Period.of(0,0,30);
		new Lease(period,1003);
		Assert.assertTrue(Lease.getNumOfLeases()==2);
	}

	@Test
	void testGetAverageDuration() {
		Period period = Period.of(0,0,20);
		new Lease(period,1004);
		period = Period.of(0,0,30);
		new Lease(period,1003);
		period = Period.of(0, 0, 25);
		Assert.assertTrue(Lease.getAverageDuration().equals(period));
	}

	@Test
	void testRemoveLeaseWith2Leases() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1200);
		period = Period.of(0,0,30);
		new Lease(period,1020);
		lease.remove();
		Assert.assertEquals(1,Lease.getNumOfLeases());
	}
	
	@Test
	void testRemoveLeaseWith1Lease() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1050);
		lease.remove();
		Assert.assertEquals(0,Lease.getNumOfLeases());
	}
	
	@Test
	void testRemoveLeaseWithNoLeases() {
		Period period = Period.of(0,0,20);
		Lease lease = new Lease(period,1030);
		lease.remove();
		lease.remove();
		Assert.assertEquals(0,Lease.getNumOfLeases());
	}
	
	@Test
	void testHashCode() {
		Period period = Period.of(0,0,23);
		Lease l1 = new Lease(period,1013);
		Lease l2 = l1;
		Assert.assertEquals(l1.hashCode(),l2.hashCode());	
		Assert.assertTrue(l1.equals(l2));
	}	
	
	@Test
	void testEqualsWhenOneNull() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		Lease l2 = null;
		Assert.assertFalse(l.equals(l2));	
	}
	
	@Test
	void testEqualsWhenOtherClass() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		String s = "In the Castle of Aaaaaarg";
		Assert.assertFalse(l.equals(s));	
	}
	
	@Test
	void testEqualsWhenOtherId() {
		Period period = Period.of(0,0,20);
		Lease l = new Lease(period,1000);
		Lease l2 = new Lease(period,1000);
		Assert.assertFalse(l.equals(l2));
	}
	
	@Test
	void testSimilarWhenEquals() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		Lease l2 = l;
		Assert.assertTrue(l.similarWith(l2));	
	}
	
	@Test
	void testSimilarWhenSimilar() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		Lease l2 = new Lease(period,1013);
		Assert.assertTrue(l.similarWith(l2));	
	}
	
	@Test
	void testSimilarWhenOneNull() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		Lease l2 = null;
		Assert.assertFalse(l.similarWith(l2));	
	}
	
	@Test
	void testSimilarWhenOtherClass() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		String s = "In the Castle of Aaaaaarg";
		Assert.assertFalse(l.similarWith(s));	
	}
	
	@Test
	void testSimilarWhenOtherDuration() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1000);
		period = Period.of(0,0,20);
		Lease l2 = new Lease(period,1000);
		Assert.assertFalse(l.similarWith(l2));	
	}
	
	@Test
	void testSimilarWhenOtherCost() {
		Period period = Period.of(0,0,20);
		Lease l = new Lease(period,1013);
		Lease l2 = new Lease(period,1000);
		Assert.assertFalse(l.similarWith(l2));	
	}
	
	@Test
	void testFindExistingLeaseById() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		period = Period.of(0,0,20);
		new Lease(period,1000);
		Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
		Assert.assertEquals(l,returnedLease);	
	}
	
	@Test
	void testFindMissingLeaseById() {
		Period period = Period.of(0,0,23);
		Lease l = new Lease(period,1013);
		l.remove();
		period = Period.of(0,0,20);
		new Lease(period,1000);
		Lease returnedLease = Lease.findLeaseById(l.getLeaseId());
		Assert.assertNull(returnedLease);	
	}

	@Test
	void testFindLeaseByDuration() {
		Period period = Period.of(0,1,20);
		new Lease(period,1012);
		period = Period.of(0,1,20);
		new Lease(period,1010);
		period = Period.of(2,1,20);
		new Lease(period,1002);
		period = Period.of(0,1,20);
		ArrayList<Lease> leases1m20d = Lease.findLeaseByDuration(period);
		Assert.assertEquals(2,leases1m20d.size());
		Assert.assertTrue(leases1m20d.get(0).getDuration().equals(leases1m20d.get(1).getDuration()));		
	}
	
	@Test
	void testFindLeaseByCost() {
		Period period = Period.of(0,0,23);
		new Lease(period,1000);
		period = Period.of(0,0,20);
		new Lease(period,1000);
		period = Period.of(0,0,24);
		new Lease(period,1002);
		ArrayList<Lease> leases1000 = Lease.findLeaseByCost(1000);
		Assert.assertEquals(2,leases1000.size());
		Assert.assertEquals(leases1000.get(0).getCost(),leases1000.get(1).getCost(),0.00001);		
	}
	
}
