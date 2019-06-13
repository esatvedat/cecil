package day04_primitives_operators;

public class CitiesTogether {
	
	//Declare 3 String variables
	//city1
	//city2
	//city3
	
	//Assign values:
	//Tashkent
	//Kyiv
	//Moscow
	
	
	public static void main(String[] args) {
	
		String city1 = "Taskent";
		String city2 = "Kyiv";
		String city3 = "Moscow";
	
	//Print : From Tashkent to Kyiv is $500.
	System.out.println("From " + city1 + " to " + city2 + " is " + "$500" + ".");
	
	//From Moskow to Tashkent is $550.
	System.out.println("From " + city3 + " to " + city1 + " is " + "$550" + ".");
	
	//I had been to Tashkent, Moskow, Kyiv.
	System.out.println("I had been to " + city1 + ", " + city3 + ", " + city2 + ".");
	
	String app = "Slack";
	//We use <Slack> for messaging with Classmates.
	
	
	System.out.println("We use " + app +" for messaging with Classmates" + ".");
	
	app="Skype" +" and Slack";
	
	System.out.println("We use " + app +" for messaging with Classmates" + ".");
	
	
	
}
}