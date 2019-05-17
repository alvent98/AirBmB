package airbmbr4.r4.Test;

import airbmbr4.r4.Model.EvaluationForRenter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
class EvaluationForRenterTest {

	@Before
	void set() {
		EvaluationForRenter.removeAll();
	}
	
	@Test
	void testRemoveWithTwoEval() {
		EvaluationForRenter e1 = new EvaluationForRenter(5);
		new EvaluationForRenter(1,"King Arthur wanted to take our Holy Grail.",100);
		e1.remove();
		Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());
	}
	
	@Test
	void testRemoveWithOneEval() {
		EvaluationForRenter e = new EvaluationForRenter(5);
		e.remove();
		Assert.assertEquals(0,EvaluationForRenter.getNumOfEvaluations());
	}
	
	@Test
	void testRemoveWithNoEval() {
		EvaluationForRenter e = new EvaluationForRenter(5);
		e.remove();
		e.remove();
		Assert.assertEquals(0,EvaluationForRenter.getNumOfEvaluations());
	}

	@Test
	void testEvaluationForRenterInt() {
		new EvaluationForRenter(5);
		Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());		
	}

	@Test
	void testEvaluationForRenterIntStringInt() {
		new EvaluationForRenter(0,"Police was called in front of the Castle of Aaarg, because of the knights.",2000);
		Assert.assertEquals(1,EvaluationForRenter.getNumOfEvaluations());
	}

	@Test
	void testSetAndGetRepairsValue() {
		EvaluationForRenter e = new EvaluationForRenter(2,"The Vikings sung all the time about Spam.",20);
		e.setRepairsValue(200); //They keep singing...
		Assert.assertEquals(200,e.getRepairsValue());
	}
	
	@Test
	void testSetAndGetCommentsAndFeedBack() {
		EvaluationForRenter e = new EvaluationForRenter(4,"The rabbit in the cave has two sharp teeths!",20);
		e.setComments("The rabbit killed five knights, Bors, Gawain and Hector!");
		e.setFeedback(1); //Don't worry, we have the Holy Hand Grenade!
		Assert.assertEquals(1,e.getFeedback());
		Assert.assertTrue(e.getComments().contentEquals("The rabbit killed five knights, Bors, Gawain and Hector!"));
	}
	
	@Test
	void testHashCodeWhenEquals() {
		EvaluationForRenter e1 = new EvaluationForRenter(2,"King Arthur oppressed the free peasants.",20);
		EvaluationForRenter e2 = e1;
		Assert.assertEquals(e1.hashCode(),e2.hashCode());
	}
	
	@Test
	void testHashCodeWhenNotEquals() {
		EvaluationForRenter e1 = new EvaluationForRenter(2,"",20);
		EvaluationForRenter e2 = new EvaluationForRenter(0,"",4);
		Assert.assertNotEquals(e1.hashCode(),e2.hashCode());
	}
	
	@Test
	void testEqualsWhenNotEquals() {
		EvaluationForRenter e1 = new EvaluationForRenter(2,"King Arthur oppressed the free peasants.",20);
		EvaluationForRenter e2 = new EvaluationForRenter(0,"",4);
		Assert.assertFalse(e1.equals(e2));
	}

	@Test
	void testGetAverageFeedbackForRenter() {
		new EvaluationForRenter(4,"The Hungarian visitor is arrogant.",500);
		new EvaluationForRenter(0,"The Hungarian visitor hit me.",1000);
		Assert.assertEquals(2,EvaluationForRenter.getAverageFeedback(),0.000001);
	}

	@Test
	void testGetNumOfEvaluationsForRenter() {
		new EvaluationForRenter(4);
		new EvaluationForRenter(4,"The Magi visited the wrong stable.",1000);
		Assert.assertEquals(2,EvaluationForRenter.getNumOfEvaluations());
	}

	@Test
	void testDamagesWhenTrue() {
		EvaluationForRenter e = new EvaluationForRenter(2,"I didn't like the Spam!",10);
		Assert.assertTrue(e.damages());
	}
	
	@Test
	void testDamagesWhenFalse() {
		EvaluationForRenter e = new EvaluationForRenter(1);
		Assert.assertFalse(e.damages());
	}
}
