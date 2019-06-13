package day09_Equals_conditions;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
		
		String capitalOfCanada;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		capitalOfCanada=scan.nextLine();
		
	if(capitalOfCanada.equals("Ottowa")) {
		//capitalOfCanada.equalsIgnoreCase("Ottowa));
				
		System.out.println("Your answer is correct!");
		
	}else {
		System.out.println("Your answer is incorrect! "+capitalOfCanada+" is not capital of Canada");
	}
	
			
	}

}
