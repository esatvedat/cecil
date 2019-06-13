package day16_String_Manipulation;

public class PutWordInBetween {

	public static void main(String[] args) {
		String chars = "{{}}";
		String word = "automation";
		String result = chars.substring(0,2).concat(word)+ chars.substring(2,4);
		//String result = chars.substring(0,2) + word + chars.substring(2,4);
		System.out.println(result);

		
	}

}
