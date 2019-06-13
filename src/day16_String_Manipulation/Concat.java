package day16_String_Manipulation;

public class Concat {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));

		System.out.println(word);

		word = word.concat("+Eclipse");
		System.out.println(word);
		
		word = word.concat(" Automation");
		System.out.println(word);
		
		word = word + "-Cucumber";
		System.out.println(word);
		
		//word = word.concat(123): will not work
		
		word = word + 123;
		System.out.println(word);
		
		word = word + true; //plus operator more capabilities than concat
		System.out.println(word);
		
		String word2 = "Hi";
		word2 = word2.concat(" -hey").concat("-how are you").concat("-good");
		System.out.println(word2);
	}

}
