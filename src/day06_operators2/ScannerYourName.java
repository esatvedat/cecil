package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
		public static void main(String[] args) {
		
		//create scanner object
			
		Scanner scan = new Scanner(System.in);

		System.out.println("Hi, What is your name?");
		//String name = scan.next(); //accept String input
		String name = scan.nextLine(); //print first and last name
		
			System.out.println("Nice to meet you, " +name);
			
		}

}
