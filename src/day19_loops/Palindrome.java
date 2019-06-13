package day19_loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		/*bob, madam, civic, racecar, hannah
		 * reverse it and assign to different string
		 * compare if it matches the word
		 * check first and last char
		 * second char and second from the end 
		 */
		//loop through word in reverse order and 
		//concetanate each character to reversed string
		
	
		/*Deneme
		String print = word.substring(0, word.length()/2);
		String print2 = word.substring(word.length()/2+1, word.length());
		System.out.println(print);
		System.out.println(print2);
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test:");
		             //0123
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and 
		//concetanate each character to reversed string
		
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		
		System.out.println(reversed);
		//compare if word and reversed are equal
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
		
	}
}