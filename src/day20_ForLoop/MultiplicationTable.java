package day20_ForLoop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		//check if it is valid
		//if it not valid return
		
		if(num < 1 || num > 10) {
			//for loop to print multiplication table
			System.out.println("ERROR: Invalid input");
			//return;	    //stop execution here            //int resNum = num*num++; 1,3,5,7,9 square
			System.exit(0); //stop execution
		}
		
				for(int i=1; i<=10; i++) {
				
				System.out.println(num+" x "+ i + " = " + (num*i));
			
		}
	}

}
