package day51;

public class SavingAccount extends BankAccount{
	

	/*Create a sub class called SavingAccount 
	field : 
		double returnRate
	Constructor 
		4 args constructor to set all above value 

	overriden methods : 
		toString method
		deposit accept one int as parameter 
			and it changes the balance accordingly
			but you get 100$ for each deposit 
		withdraw accept one int as parameter
			and it changes the balance accordingly
			but you get 10$ penalty for each withdraw 
*/
	double returnRate;
	
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		
		super(accountName, accountNumber, balance);
	
	}
	
}
