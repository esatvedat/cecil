package day16_String_Manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Baku , Azerbaijan 

	str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
	System.out.println(str);
	
	String email = "firstName_LastName@gmail.com";
	
	String company = "WhiteHouse";
	
	String newEmail = email.replace("gmail", "WhiteHouse");
	System.out.println(newEmail);
	
	newEmail = newEmail.replace("WhiteHouse", "capitalone");
	System.out.println(newEmail);
	}

}
