package day51;

public class BankAccount {
	String accountName;
	long accountNumber;
	double balance;
	/*
	 * Create a BankAccount class 
		fields : 
			accountName as String
			accountNumber as long 
			balance as double 

		Constructor 
			3 args constructor to set all above value 

		methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
			withdraw accept one int as parameter
				and it changes the balance accordingly
	 */
	
	public BankAccount(String accountName, long accountNumber, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;	
	}
	
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withDraw(int amount) {
		this.balance -= amount;
	}
	
}
