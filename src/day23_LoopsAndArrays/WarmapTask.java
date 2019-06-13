package day23_LoopsAndArrays;

import java.util.Scanner;

public class WarmapTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Write a program that will verify if the number is prime.
		 * Prime number is a whole number greater than 1 and cannot be made by
			multiplying other whole numbers
		 * Ask a user to provide a number than if it is a prime number display message "number - it's a prime number
		 * otherwise display message "number - it's not a prime number"
		 * 
		//	if(number%number==0 && number%1==0 && number%2==1) 
		 * System.out.println("enter a number");
		*/
		int number = scan.nextInt();
		int count = 0;
		for (int i = 2;  i<= number; i ++) {
			
			if(number % i == 0) {
				count++;	
			
		}if(count>1) { System.out.println("not prime"); 
		return;
		}else{ 
			System.out.println(number +" is prime");
			}
		}/*  for( int i = 1; i <= number; i++) {
            if(number%1==0 && i/number==1 && ) {
                System.out.println("Prime number!");
                System.out.println("provide a number");
             number=scan.nextDouble();
        }else{
            System.out.println("not prime");
    
            System.out.println("provide a number");
            number=scan.nextDouble();
        }*/
	//KENDI KENDINE SAYILARI BULSUN 0 DAN 100 E KADAR PRIME LARI YAZDIRSIN
		}
}
