

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import controllers.Feedback;

public class FeedbackTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void deveCriarUmaInstanciaDaClasseFeedback() {
		Feedback feedback = new Feedback(Boolean.TRUE);
		assertTrue(feedback.like);
	}
}
