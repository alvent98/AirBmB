package Test;

import Model.Request;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class RequestTest {

	@BeforeEach
	void set() {
		Request.removeAll();
	}
	
	@Test
	void testHashCodeAndEqualsWhenEqual() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		Request r2 = r1;
		Assert.assertEquals(r1.hashCode(),r2.hashCode());	
		Assert.assertTrue(r1.equals(r2));
	}
	
	@Test
	void testHashCodeAndEqualsWhenNotEqual() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		LocalDate ld3 = LocalDate.of(2019, 4, 30);
		Request r2 = new Request(now,ld1,ld3);
		Assert.assertNotEquals(r1.hashCode(),r2.hashCode());	
		Assert.assertFalse(r1.equals(r2));
	}
	
	@Test
	void testHasEqualsWhenOneNull() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		Request r2 = null;
		Assert.assertFalse(r1.equals(r2));
	}

	@Test
	void testEqualsWhenOtherClass() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r = new Request(now,ld1,ld2);
		String s = "But it is just a rabbit!";
		Assert.assertFalse(r.equals(s));	
	}
	
	@Test
	void testGetAndSetStartDate() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		r1.setStartDate(ld2);
		Assert.assertTrue(r1.getStartDate().isEqual(ld2));
	}

	@Test
	void testGetAndSetEndDate() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		LocalDate ld3 = LocalDate.of(2019, 4, 22);
		r1.setEndDate(ld3);
		Assert.assertTrue(r1.getEndDate().isEqual(ld3));
	}

	@Test
	void testGetRequestId() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		long id = r1.getRequestId();
		Assert.assertEquals(id,r1.getRequestId());
	}

	@Test
	void testGetSubmissionDate() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		Assert.assertTrue(now.isEqual(r1.getSubmissionDate()));
	}

	@Test
	void testIsAccepted() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		Assert.assertFalse(r1.isAccepted());
	}

	@Test
	void testSetAccepted() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		r1.setAccepted();
		Assert.assertTrue(r1.isAccepted());
	}

	@Test
	void testGetNumOfRequests() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		new Request(now,ld1,ld2);
		Assert.assertEquals(1,Request.getNumOfRequests());
	}


	@Test
	void testGetNumOfRequestsWhenZero() {
		Assert.assertEquals(0,Request.getNumOfRequests());
	}
	
	@Test
	void testGetNumOfAcceptedRequests() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		r1.setAccepted();
		Assert.assertEquals(1,Request.getNumOfAcceptedRequests());
	}
	
	@Test
	void testGetNumOfAcceptedRequestsWhenZero() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		new Request(now,ld1,ld2);
		Assert.assertEquals(0,Request.getNumOfAcceptedRequests());
	}

	@Test
	void testRemoveRequestWith2Requests() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r1 = new Request(now,ld1,ld2);
		LocalDate ld3 = LocalDate.of(2019, 4, 30);
		new Request(now,ld1,ld3);
		r1.remove();
		Assert.assertEquals(1,Request.getNumOfRequests());
	}
	
	@Test
	void testRemoveRequestWith1Request() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r = new Request(now,ld1,ld2);
		r.remove();
		Assert.assertEquals(0,Request.getNumOfRequests());
	}
	
	@Test
	void testRemoveRequestWith1AcceptedRequest() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r = new Request(now,ld1,ld2);
		r.setAccepted();
		r.remove();
		Assert.assertEquals(0,Request.getNumOfAcceptedRequests());
		Assert.assertEquals(0,Request.getNumOfRequests());
	}
	
	@Test
	void testRemoveRequestWithNoRequests() {
		LocalDate now = LocalDate.of(2019, 4, 18);
		LocalDate ld1 = LocalDate.of(2019, 4, 20);
		LocalDate ld2 = LocalDate.of(2019, 4, 26);
		Request r = new Request(now,ld1,ld2);
		r.remove();
		r.remove();
		Assert.assertEquals(0,Request.getNumOfRequests());
	}

}
