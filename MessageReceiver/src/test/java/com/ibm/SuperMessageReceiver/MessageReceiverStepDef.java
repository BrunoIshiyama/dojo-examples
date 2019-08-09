package com.ibm.SuperMessageReceiver;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MessageReceiverStepDef {
	private User user;
	private Message msg;
	private String msg_result;
	
	@Before
	public void setUp() {
		user = new User("", "");
		msg = new Message();
	}
	
	@Given("I am the user {string}")
	public void i_am_the_user(String username) {
		user.setUsername(username);
	}

	@Given("my language is set to {string}")
	public void my_language_is_set_to(String language) {
	    user.setLanguage(language);
	}

	@When("the system sends the message {string}")
	public void the_system_sends_the_message(String msg_string) {
		msg_result = msg.send(user.getLanguage(), msg_string);
	}
	
	@Then("I should see the message {string}")
	public void i_should_see_the_message(String error_string) {
		assertEquals(msg_result, error_string);
	}
}
