package day21_loopsPractices;
import java.util.*;
public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		
		int itemCount = scan.nextInt();
		double price = 0;
		String items = "";
		for(int count=1; count<=itemCount; count++) {
		System.out.println("What is item "+count + "?");
		items =items + scan.next() +", ";
		
		System.out.println("How much is "+items+"?");
		price = price+ scan.nextInt();
	}System.out.println("Your items: "+items);
		System.out.println("Total price: " + "$"+price);

}
}