package day3.assignment;

public class Authentication {

	// Private username, private password | getter setter.

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String uname) {
		username = uname;
	}

	public void setPassword(String passw) {
		password = passw;
	}

	public void loginCredentials(String usrname, String pass) {
		username = usrname;
		password = pass;
	}
}
