import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RenterTest {

	@BeforeEach
	void set() {
		Renter.removeAll();
	}
	
	@Test
	void testRenter() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R3=new Renter ("firstName","lastName","email","IBAN","username","password");
		Assert.assertEquals(3,Renter.getNumOfRenters());
	}

	@Test
	void testRemoveRenter() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		R1.remove();
		Assert.assertEquals(0,Renter.getNumOfRenters());
	}

	@Test
	void testRemoveRenter2() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
		R1.remove();
		Assert.assertEquals(1,Renter.getNumOfRenters());
	}
	
	@Test
	void testRemoveRenter3() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter.removeAll();
		R1.remove();
		Assert.assertEquals(0,Renter.getNumOfRenters());
	}
		
	@Test
	void testEquals() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R2=R1;
		Assert.assertTrue(R1.equals(R2));
	}

	@Test
	void testNotEquals() {
		Renter R1=new Renter ("firstName","lastName","email","IBAN","username","password");
		Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
		Assert.assertFalse(R1.equals(R2));
	}
	
	@Test
	void testEqualsNull() {
		Renter R1=null;
		Renter R2=new Renter ("firstName","lastName","email","IBAN","username","password");
		Assert.assertFalse(R2.equals(R1));
	}
	
			
	
}
