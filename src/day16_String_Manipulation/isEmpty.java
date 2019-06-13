package day16_String_Manipulation;

public class isEmpty {

	public static void main(String[] args) {
		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		} else {
			System.out.println("Username or password is not empty");
		}
		// ctrl shift F ==> makes your code looks like more beautiful
		
		if(userName.length() == 0) {
			System.out.println("Username length is 0, so it is empty");
		}
	}

}
