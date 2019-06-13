package day09_Equals_conditions;

public class IfElseNoBraces {
	public static void main(String[] args) {
		String day = "Tuesday";
		
	if(day.equals("Tuesday")) 
		System.out.println("Today is Tuesday");
		//System.out.println("Another statement"); when we put another statement the prog get confused but just with these tuesdays it works
	else 
		System.out.println("Today is not Tuesday");
		System.out.println("Tuesday is not today"); //it s not part of ELSE block. without braces just work with one line
	}

}
