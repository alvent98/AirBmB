import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class EvaluationForHouseTest {

	@BeforeEach
	void set() {
		EvaluationForHouse.removeAll();
	}
	
	@Test
	void testRemoveWithTwoEval() {
		EvaluationForHouse e1 = new EvaluationForHouse(5);
		new EvaluationForHouse(1);
		e1.remove();
		Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());
	}
	
	@Test
	void testRemoveWithOneEval() {
		EvaluationForHouse e = new EvaluationForHouse(5);
		e.remove();
		Assert.assertEquals(0,EvaluationForHouse.getNumOfEvaluations());
	}
	
	@Test
	void testRemoveWithNoEval() {
		EvaluationForHouse e = new EvaluationForHouse(5);
		e.remove();
		e.remove();
		Assert.assertEquals(0,EvaluationForHouse.getNumOfEvaluations());
	}

	@Test
	void testEvaluationForHouseInt() {
		new EvaluationForHouse(5);
		Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());		
	}

	@Test
	void testEvaluationForHouseIntString() {
		new EvaluationForHouse(0,"The french knights were hostile");
		Assert.assertEquals(1,EvaluationForHouse.getNumOfEvaluations());
	}

	@Test
	void testSetAndGetCommentsAndFeedBack() {
		EvaluationForHouse e = new EvaluationForHouse(3,"The french knights threw some animals towards our soldiers!");
		e.setComments("We fled these arrogant knights.");
		e.setFeedback(1);
		Assert.assertEquals(1,e.getFeedback());
		Assert.assertTrue(e.getComments().contentEquals("We fled these arrogant knights."));
	}
	
	@Test
	void testHashCodeWhenEquals() {
		EvaluationForHouse e1 = new EvaluationForHouse(2,"They said they didn't elect King Arthur, so they don't obey!");
		EvaluationForHouse e2 = e1;
		Assert.assertEquals(e1.hashCode(),e2.hashCode());
	}
	
	@Test
	void testHashCodeWhenNotEquals() {
		EvaluationForHouse e1 = new EvaluationForHouse(0,"The old man killed Sir Kalahan.");
		EvaluationForHouse e2 = new EvaluationForHouse(0,"The black knight had just a small skratch, he said.");
		Assert.assertNotEquals(e1.hashCode(),e2.hashCode());
	}
	
	@Test
	void testEqualsWhenNotEquals() {
		EvaluationForHouse e1 = new EvaluationForHouse(2,"The black knight didn't let us pass.");
		EvaluationForHouse e2 = new EvaluationForHouse(0,"The knights who say \"ni\", demanded a srawberry.");
		Assert.assertFalse(e1.equals(e2));
	}

	@Test
	void testGetAverageFeedbackForHouse() {
		new EvaluationForHouse(4,"");
		new EvaluationForHouse(0,"");
		Assert.assertEquals(2,EvaluationForHouse.getAverageFeedbackForHouse(),0.000001);
	}

	@Test
	void testGetNumOfEvaluationsForHouse() {
		new EvaluationForHouse(4);
		new EvaluationForHouse(4,"");
		Assert.assertEquals(2,EvaluationForHouse.getNumOfEvaluations());
	}
}
