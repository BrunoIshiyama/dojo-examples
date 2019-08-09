package com.ibm.SuperMessageReceiver;

public class User {
	private String username;
	private String language;
	
	public User(String username, String language) {
		this.username = username;
		this.language = language;
		
	}

	public String getLanguage() {
		// TODO Auto-generated method stub
		return language;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
