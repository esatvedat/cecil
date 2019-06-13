package day19_loops;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	
		
		System.out.println("Your balance: ");
		double balance = scan.nextInt();
		System.out.println("What is transaction amount: ");
		double transaction = scan.nextInt();
		double endBalance; 
		while (balance - transaction > 0) {
		
			System.out.println("Balance: " + balance);
			
		} System.out.println("You have insufficent funds, your balance is " + balance);
		
	//gozden gecir hata var	
		

	}

}
