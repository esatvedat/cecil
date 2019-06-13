package day19_loops;
import java.util.*;
public class TransactionsV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		
		while(balance > 0) {
			System.out.println("What is transaction amount");
			
			double transaction = scan.nextDouble();
			//balance=balance - transaction;
			balance-=transaction;
		}System.out.println("You have insufficent funds for any more transactions, your balance is "+balance);
	
	}

}
