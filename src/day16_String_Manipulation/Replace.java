package day16_String_Manipulation;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Type word(s):");
	
	String words = scan.nextLine();
	
	//System.out.println(words.replace("a","y"));
	System.out.println();
	//System.out.println(words.replace("sad", "happy"));
	
	System.out.println(words.replace("JavaScript", "Java"));
	

	}

}
