package day15_string_manipulation;
import java.util.*;
public class PseudoCode {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String emoji = scan.next();
		
		if(emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return; //stop execution
		}
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') { 
			if(second ==')') { 
				System.out.println(":) ==> smile");
			}else if(second == '(') {
				System.out.println(":( ==> sad");
			}else if(second == '/') {
				System.out.println(":/ ==> upset");	
			}else if(second == 'p') {
				System.out.println(":p ==> playful");
			}else {
				System.out.println("Unknown character");
			}
		}else if(first == ';') { 
			if(second == '0') {
				System.out.println(";0 ==> surprised");
			}else if(second == ')') {
				System.out.println(": ==> wink ");
			}else {
				System.out.println("Unknown character");
			}
		}else if(second == ':') {
			if(first == '(' ) {
				System.out.println("(: ==> smile");
			}else if(first ==')') {
				System.out.println("): ==> sad");
			}else {
				System.out.println("Unknown character");
			}
		}

		}
}