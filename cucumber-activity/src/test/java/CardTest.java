import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void cardIsValid() {
		Card c = new Card();
		assertTrue(c.isValid());
	}
	@Test
	public void setValidStatus() throws Exception{
		Card c = new Card();
		c.setValid(true);
		assertTrue(c.isValid());
	}

}
