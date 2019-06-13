package day41;

import day40.BankAccount; //you r pointing

public class StudentTester {
	public static void main(String[] args) {
		
		Student muammar = new Student();
		muammar.name = "muammar";
		muammar.age = 27;
		muammar.ssn = 1234567;
		
		//BankAccount is in different package
		BankAccount acc1 = new BankAccount();
		
		//System.out.println(acc1.balance);
		//System.out.println(acc1.accountHolder);
		//acc1.add100Dollar();
		
//		muammar.displayName();
//		muammar.displayNameAndAge();
//		muammar.showSSN();

		
	}

}
