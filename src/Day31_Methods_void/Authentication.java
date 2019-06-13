package Day31_Methods_void;
import java.util.*;
public class Authentication {
	public static void main(String[] args) {
	login("mentoring@cybertekschool.com","mentor001" );	
	login("mylogin", "abc123");
	}
	/*
	 * Name: Login
	 * Return type: void
	 * 2 String args/params : username, password
	 * Inside the method:
	 * 	validUsername = "mentoring@cybertekschool.com"
	 *  validPassword = "mentoring001"
	 *  
	 *  if username and password match, print "Login Successful! Welcome to Okta"
	 *  if not: "Sign in failed!"
	 */
public static void login(String userName, String passWd) {
	
	String validUserName = "mentoring@cybertekschool.com";
	String validPassword = "mentor001";
	
	userName = "mylogin";
	passWd = "abc123";
	
	if(userName.equalsIgnoreCase(validUserName) && passWd.equals(validPassword)) {
		System.out.println("Login successful, Welcome to Okta!");
	}else {
		System.out.println("Sign in failed!");		
	}



}

}
