package com.ibm.SuperMessageReceiver;

public class Message {
	
	public String send(String language, String message) {
		return translate(language, message);
	}
	
	public String translate(String language, String message) {
		if (language.contentEquals("polish")) {
			return "Nieprawidtowy login";
		}
		else if (language.contentEquals("italian")) {
			return "Login non valido";
		}
		else {
			return message;
		}
	}

}
