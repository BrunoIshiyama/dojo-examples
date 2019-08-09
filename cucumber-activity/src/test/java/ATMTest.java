import static org.junit.Assert.*;

import org.junit.Test;

public class ATMTest {

	@Test
	public void machineContainsEnoughMoney() {
		ATM atm = new ATM();
		assertEquals(100,atm.getBalance(),0.001);
	}

	@Test
	public void requestWithdrawAmount() throws Exception {
		ATM atm = new ATM();
		Account ac = new Account();
		assertTrue(atm.requestMoney(ac, 20));
	}

	@Test
	public void dispenseMoney() throws Exception {
		ATM atm = new ATM();
		Account ac = new Account();
		double toDispense = 20;
		atm.requestMoney(ac, toDispense);
		assertTrue(atm.dispense(toDispense));
	}

	@Test
	public void cardShouldBeReturned() throws Exception {
		ATM atm = new ATM();
		assertTrue(atm.removeCard());
	}
	
	@Test
	public void setBalance() throws Exception{
		ATM atm = new ATM();
		atm.setBalance(new Double(100));
		assertEquals(100, atm.getBalance(),0.001);
	}
}
