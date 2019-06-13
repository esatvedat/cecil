package day20_ForLoop;
import java.util.*;
public class PrintEachChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		//using for loop, print each char one by one
		for(int i=0; i<word.length(); i++ ) {
			System.out.println(word.charAt(i));
		}
		
		//using for loop, print only vowel (a, e, i, o, u)
		for(int i=0; i<word.length(); i++ ) {
			char letter = word.toLowerCase().charAt(i);

				if(letter =='a' || letter =='e' || letter == 'i' || letter == 'o'
						|| letter == 'u') {
					System.out.print(letter + ", ");
				}
					
				}
		System.out.println();
		//using for loop, print only consonants
		for(int i=0; i<word.length(); i++ ) {
			char letter = word.toLowerCase().charAt(i);
			
			if(!(letter =='a' || letter =='e' || letter == 'i' || letter == 'o'|| letter == 'u')) {
				System.out.print(letter + ", ");
				
			
			
		}
	
		
		
	}
}

}