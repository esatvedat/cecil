package day21_loopsPractices;
import java.util.*;
public class getUniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter word:");
	String word = scan.next();   //javva
	String unique = "";
	
	for(int i = 0; i < word.length(); i++) {
		//read the letter and assign
		char letter = word.charAt(i);
		//System.out.println(letter);
		if(!unique.contains(""+letter)) {
			unique += letter;//add to unique
		}				
	}
	
	System.out.println(unique);
	
//	for(int i = 0; i < word.length(); i++) {
//		System.out.print(i); //print i. it increases every loop
//		System.out.println(word.charAt(i));
//	}
	
	}
	
}