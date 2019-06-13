package day40;

public class BankAccount {
	
	//2 instance variable/fields
	//it has default access modifier(there is no access modifier)
	String accountHolder;  //null
	private double balance; //0.0
	
	//create an instance method (non-static method ), it means I need an Object
	//called showAccountHolder
	//-->printOut Account Holder name
	public void showAccountHolder() {
		
		System.out.println("Account holder name is " + accountHolder);
	}
	
	//create an instance method showBalance and 
	//print out the balance
	//return nothing
	public void showBalance() {
		System.out.println("Account balance: " + balance);
	}
	
	//create an instance method called add100Dollar does not accept any parameters
	//increase the balance of account by 100;
	void add100Dollar() {
		balance += 100;
		showBalance();
	}
	//adding <custom> amount dollar to current balance
	public void addDollar(int amount) {
		balance += amount;
	}
	
	//create another class called BankActivity with main method
	//create bank account object
	//set account holder name and balance value
	
	//call your showAccountHolder and showBalance method
	//OPTIONALLY CALL YOUR add100Dollar method
	//and call your showBalance method again to see whether balance has changed.
	
	
}
