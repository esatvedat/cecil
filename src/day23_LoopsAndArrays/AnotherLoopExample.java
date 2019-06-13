package day23_LoopsAndArrays;

import java.util.Scanner;

public class AnotherLoopExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*Loop through the numbers from 1 till 50
print each number in the same line
if number is divisible by 5 (n%5==0), skip it
if number is divisible by 20, then exit the loop (use break)
Use FOR LOOP */
		int number = 0;
		
		for(int i=0; i<=50; i++) {
			System.out.println("Enter a number: ");
			number = scan.nextInt();
			if(number%5!=0 && number%20!=0) {
				continue;
			}System.out.println("it is divisible by 5");
			if(number%20!=0) {
				break;
			}System.out.println("It is divisible by 20");
		}
		
	}

}
