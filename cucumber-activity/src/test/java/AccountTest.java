import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {

	@Test
	public void checkAccountBalance() {
		Account ac = new Account();
		assertEquals(100, ac.getBalance(),0.001);
	}
	
	@Test
	public void checkSetAccountBalance() {
		int value = 100;
		Account ac= new Account();
		ac.setBalance(value);
		assertEquals(value, ac.getBalance(),0.001);
	}

}
