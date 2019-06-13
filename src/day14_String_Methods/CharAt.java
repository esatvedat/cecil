package day14_String_Methods;

public class CharAt {

	public static void main(String[] args) {
		String word = "Computer";
		//print all characters one by one
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		//String word2 and check if first character is 'J'
		
		String word2 = "Java";
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first character");
		}else {
			System.out.println("J is not first character");
		}
		//String word3 that consist of 5 characters
		//check if first and last characters are same
		//true => "first and last match"
		//false => "first and last are different"
		
		
		String word3 = "civic";
		//1
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("first and last match");
		}else {
			System.out.println("first and last are different");
		}
		//2
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if(first == last) {
			System.out.println("first and last match");
		}else {
			System.out.println("Do not match");
		}
		
		//String word4 => always print the last character
		//no matter the length
		
		String word4 = "acddfhkh43545dhf";
		
		char lastChar = word4.charAt( word4.length()-1);
		System.out.println("Last character of "+ word4 + " is "+lastChar);
	}

	
}
