package day06_operators2;

import java.util.Scanner;

public class EnterNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //creating object of scanner
		System.out.println("Enter a number:");
		
		int number = scan.nextInt(); //with this code  after running prog u enter the number
		
		System.out.println("You entered " + number);
		
		
	}
}
