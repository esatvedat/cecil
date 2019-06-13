package day15_string_manipulation;

public class SubString {

	public static void main(String[] args) {
		String sentence = "Java String manipulation is fun!";
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.substring(12, 24));
		System.out.println(sentence.substring(25,27));
		System.out.println(sentence.substring(8, 18)+sentence.substring(21, 22));
		
	}

}
