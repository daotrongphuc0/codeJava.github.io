package model;

public class TestCase {
	private String username = "";
	private String password = "";
	private String expected;
	private String result;
	private boolean isPassed;
	
	public TestCase() {
		
	}
	
	public TestCase(String username, String password, String expected) {
		this.username = username;
		this.password = password;
		this.expected = expected;
		// TODO Auto-generated constructor stub
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}

	public boolean isPassed() {
		return isPassed;
	}

	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}

	@Override
	public String toString() {
		return "TestCase [username=" + username + ", password=" + password + ", expected=" + expected + ", result="
				+ result + ", isPassed=" + isPassed + "]";
	}

	
	
}
