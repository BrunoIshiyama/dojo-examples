import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithdrawStepDef {
	Account ac;
	ATM atm;
	double toDispense;
	@Before
	public void setup() {
		ac = new Account();
		atm = new ATM();
	}

	@Given("the card is valid")
	public void the_card_is_valid() {
		Card c = new Card();
		c.setValid(true);
	}

	@Given("the account balance is {string}")
	public void the_account_balance_is(String string) {
		ac.setBalance(new Integer(string));
	}

	@Given("the machine contains {string}")
	public void the_machine_contains(String string) {
		atm.setBalance(new Double(string));
	}

	@When("the Account Holder requests {string}")
	public void the_Account_Holder_requests(String string) {
		toDispense = new Double(string);
		atm.requestMoney(ac, toDispense);
		
	}

	@Then("the ATM should dispense {string}")
	public void the_ATM_should_dispense(String string) {
		assertTrue(atm.dispense(toDispense));
	}

	@Then("the account balance should be {string}")
	public void the_account_balance_should_be(String string) {
		assertEquals(new Double(string).doubleValue(), ac.getBalance(),0.001);
	}

	@Then("the card should be returned")
	public void the_card_should_be_returned() {
		assertTrue(atm.removeCard());
	}

}
