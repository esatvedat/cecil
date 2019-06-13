package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		/* 
		 Program to tell if u r eligible to vote
		 votingAge = 18
		 yourAge = take from scanner
		 if u r eligible to vote:
		 print: 
		 if
		 	you are eligible to vote.
		 	you have been eligible for 3 years
		 else
		  	you are not eligible to vote
		  	you still have 3 more years to go
		 */
		Scanner keyboard = new Scanner(System.in); //creating scanner object and assigning as keyboard
		
		int votingAge = 18;
		System.out.println("What is your age?");
		int yourAge = keyboard.nextInt();
		int years = yourAge - votingAge;
		int years2 = votingAge - yourAge;
		
		if (yourAge >= 18) {
			System.out.println("You are eligible to vote. ");
			System.out.println("you have been eligible for "+ years + " years");
			
		}else {
			System.out.println("You are not eligible to vote");
			System.out.println("You still have " + years2 + " more years to go"); 
			//also u can do (-years)
			//also u can add (votingAge-yourAge)
		
		}
				
	}

}