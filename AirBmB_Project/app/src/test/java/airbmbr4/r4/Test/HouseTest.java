package airbmbr4.r4.Test;

import airbmbr4.r4.Model.House;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class HouseTest {

	@Before
	void set() {
		House.removeAll();
	}
	
	@Test
	void testHouse() {
		House h1 = new House("city","street", 12, 100, "2", "2", 200);
		House h2 = new House("city","street", 12, 100, "2", "2", 200);
		House h3 = new House("city","street", 12, 100, "2", "2", 200);
		Assert.assertEquals(3,House.getNumOfHouses());
	}

	@Test
	void testSetNumber() {
		House h1 = new House("city","street", 12, 100, "2", "2", 200);
		h1.setNumber(25);
		Assert.assertEquals(25, h1.getNumber());
	}

	@Test
	void testSetArea() {
		House h1 = new House("city","street", 12, 100, "2", "2", 200);
		h1.setArea(250);
		Assert.assertEquals(250, h1.getArea());
	}

	@Test
	void testSetPrice() {
		House h1 = new House("city","street", 12, 100, "2", "2", 200);
		h1.setPrice(350.60);
		Assert.assertEquals(350.60, h1.getPrice(),0.01);
	}

	@Test
	void testEqualsFalse() {
		House h1 = new House("city","street", 12, 100, "2", "2", 200);
		House h2 = new House("city","street", 12, 100, "2", "2", 200);
		h1.setCity("lalaland");
		Assert.assertFalse(h1.equals(h2));
	}
	
	@Test
	void testEqualsTrue() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 200);
		House h2=h1;
		Assert.assertEquals(h1.hashCode(),h2.hashCode());
		Assert.assertTrue(h1.equals(h2));
	}
	
	@Test
	void testEqualsNull() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 200);
		House h2=null;
		Assert.assertFalse(h1.equals(h2));
	}
	
	@Test
	void testGetAveragePrice() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 1500);
		House h2 = new House("city","Backer Street", 12, 100, "2", "2", 3000);
		House h3 = new House("city","Backer Street", 12, 100, "2", "2", 4500);
		House h4 = new House("city","Backer Street", 12, 100, "2", "2", 6000);
		Assert.assertEquals(3750,House.getAveragePrice(),0.001);
	}
	
	@Test
	void testGetAveragePriceWithNoHouses() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 1500);
		h1.remove();
		Assert.assertEquals(0,House.getAveragePrice(),0.001);
	}
	
	
	@Test
	void testRemoveOneObj() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 200);
		h1.remove();
		Assert.assertEquals(0,House.getNumOfHouses());	
	}
	
	@Test
	void testRemoveNoObj() {
		House h1 = new House("city","Backer Street", 12, 100, "2", "2", 200);
		h1.remove();
		h1.remove();
		Assert.assertEquals(0,House.getNumOfHouses());	
	}
	
	
}
