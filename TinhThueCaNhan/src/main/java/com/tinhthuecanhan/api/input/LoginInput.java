package com.tinhthuecanhan.api.input;

public class LoginInput {
	private String username;
	private String password;
	
	public LoginInput() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginInput(String usertname,String pass) {
		this.username = usertname;
		this.password =pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
