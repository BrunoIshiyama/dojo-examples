package com.ibm.SuperMessageReceiver;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageTest {

	@Test
	public void sendMessageInvalidLogin_shouldReturnInvalidLogin() {
		Message msg = new Message();
		assertEquals(msg.send("", "Invalid login"), "Invalid login");
	}
	
	@Test
	public void translateMessageToPolish_shouldReturnPolishMessage() {
		Message msg = new Message();
		assertEquals(msg.translate("polish", "Invalid login"), "Nieprawidtowy login");
	}
}