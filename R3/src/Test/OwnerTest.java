package Test;

import Model.Owner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OwnerTest {

	@BeforeEach
	void set() {
		Owner.removeAll();
	}
	
	@Test
	void testOwner() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o3=new Owner ("firstName","lastName","email","IBAN","username","password");
		Assert.assertEquals(3,Owner.getNumOfOwners());
	}
	
	@Test
	void testRemoveRenter() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		o1.remove();
		Assert.assertEquals(0,Owner.getNumOfOwners());
	}

	@Test
	void testRemoveRenter2() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
		o1.remove();
		Assert.assertEquals(1,Owner.getNumOfOwners());
	}
	
	@Test
	void testRemoveRenter3() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner.removeAll();
		o1.remove();
		Assert.assertEquals(0,Owner.getNumOfOwners());
	}
		
	@Test
	void testEquals() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o2=o1;
		Assert.assertTrue(o1.equals(o2));
	}

	@Test
	void testNotEquals() {
		Owner o1=new Owner ("firstName","lastName","email","IBAN","username","password");
		Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
		Assert.assertFalse(o1.equals(o2));
	}
	
	@Test
	void testEqualsNull() {
		Owner o1=null;
		Owner o2=new Owner ("firstName","lastName","email","IBAN","username","password");
		Assert.assertFalse(o2.equals(o1));
	}
	

}
