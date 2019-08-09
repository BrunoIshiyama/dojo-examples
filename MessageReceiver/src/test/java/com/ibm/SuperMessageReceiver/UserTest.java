package com.ibm.SuperMessageReceiver;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void getPolishUserLanguage_ShouldReturnPolish() {
		User smirnoff = new User("", "polish");
		assertEquals(smirnoff.getLanguage(), "polish");	
	}
	
	@Test
	public void getSmirnoffUsername_ShouldReturnSmirnoff() {
		User smirnoff = new User("smirnoff", "");
		assertEquals(smirnoff.getUsername(), "smirnoff");	
	}
}
