package day19_loops;
import java.util.*;
public class TransactionsV3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your current balance?");
		double currentBalance = scan.nextDouble();
		int count = 0;
		
		while(currentBalance > 0) {
			count++;
			System.out.println("What is transaction #" + count + " amount");
			
			double transaction = scan.nextDouble();
			//currentBalance=currentBalance - transaction;
			if(transaction > currentBalance) {
				System.out.println("Warning! Your balance is about to be negative");
			}
			currentBalance-=transaction;
			System.out.println("Current balance: " + currentBalance);
		}
		System.out.println("You have insufficent funds for any more transactions, your balance is "+currentBalance);
		System.out.println("Transaction total transaction count is : " + count);
	}
	
	}

