package day23_LoopsAndArrays;
import java.util.*;
public class concatWorks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = "";

		for(int i=0; i<6; i++) {
			
			System.out.println("Enter a word: ");
			word += scan.next()+", ";
			if(word.equals("java")) {
				continue;

		}
		}System.out.println(word.substring(0, word.length()-2));
	}

}
