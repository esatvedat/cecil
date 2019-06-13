package day23_LoopsAndArrays;

import java.util.Scanner;

public class BruteForce {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String userName = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts-- ==0){   //it will check and reduce the value
				System.out.println("You have exceed number of attempt");
				System.out.println("This user has been deactivated");
				return;
			}
			//attempts--; you can use here instead of if condition like attemps ==0;
			System.out.println("Please enter user name");
			userName = scan.next();
			if(!userName.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			System.out.println("Please enter password");
			userName = scan.next();
			if(!userName.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: "+attempts);
				continue;
			
			}
			
		}while(!userName.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login succesful!");
	}

}
