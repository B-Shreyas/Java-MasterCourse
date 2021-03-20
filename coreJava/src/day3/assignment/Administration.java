package day3.assignment;

public class Administration {

	public void signIn(String username, String password, Authentication au1) {

		System.out.println("The username is : " + au1.getUsername());
		System.out.println("The password is : " + au1.getPassword());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Authentication obj = new Authentication();
		obj.loginCredentials("Shreyas@9711", "Shri@9711");

		Administration cred = new Administration();
		cred.signIn("Shri@9711", "12345", obj);

	}

}
