package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'a';
		while(letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}
		System.out.println();
		char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}
		//lowercase in reverse
		System.out.println();
		char reverse = 'z';
		while(reverse >='a') {
			System.out.print(reverse +" ");
			reverse--;
		}
		/*
		 A
		 AB
		 ABC
		 ABCD
		 ABCDE
		 ABCDEF
		 ABCDEFG
		 */
		
		System.out.println();
		String letters = "";
		letters = letters + 'A';
		System.out.println(letters);
		
		letters = letters + 'B';
		System.out.println(letters);
		
		letters = letters + 'C';
		System.out.println(letters);
		
		letters = letters + 'D';
		System.out.println(letters);
		
		letters = letters + 'E';
		System.out.println(letters);
		
		letters = letters + 'F';
		System.out.println(letters);

		letters = letters + 'G';
		System.out.println(letters);
		/*
		 A
		 AB
		 ABC
		 ABCD
		 ABCDE
		 ABCDEF
		 ABCDEFG
		 */
		System.out.println();
		
		String letters2 = "";
		char myLetter = 'A';
		
		while(myLetter <='G') {
			letters2 = letters2 +myLetter;
			myLetter++;
			System.out.println(letters2);
		}
	
	
	}
	
	
	

}
