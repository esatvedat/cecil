package day33;
import java.util.*;
public class ReturnKeyword2 {
	///BREAK VS RETURN
	/*
	 * BREAK	:  we can only use it inside switch and loop
	 * RETURN	:  exclusively used to return a value or terminate method execution
	 */
	public static void main(String[] args) {
		ageTester(17);
		System.out.println("**********");
		ageTester(21);
		
		System.out.println(isAdultOrNot(16));
		System.out.println(isAdultOrNot(26));
	}
	
	public static boolean isAdultOrNot(int age) {
		if(age<18) {
			System.out.println("not adult");
		return false;
		}
		return true;
	}
	

	public static void ageTester(int age) {
		
		if(age<18) {
			System.out.println("not adult");
			return;
		}
		
		System.out.println("-go to work" +"\n-get paid"+"\n-pay your bill");
	
		
		
		
		
		
	}
}
