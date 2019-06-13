package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@")); //it doesnt have to be certain position
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		//check if apples is in the shopping list
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("Lets add some apples now!");
		}
		
		boolean hasEggs = list.contains("eggs"); //case sensitive
		
		System.out.println("Contains eggs: " + hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");

		System.out.println("Contains cucumbers: "+ hasCucumbers);
		
		
		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("It is yahoo email");
		}else if(email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		//Assign your name and check it contains "a" or "e" letters
		String name = "Secil";
		if (name.contains("a") || name.contains("e")){
			System.out.println("'a' or 'e' is present");
		}else {
			System.out.println("'a' or 'e' is missing");
		}
		if(name.contains("a")) {
		System.out.println("a is there");
		}else {
			System.out.println("not there");
		}
	}
}
