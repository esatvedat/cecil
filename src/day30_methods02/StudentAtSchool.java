package day30_methods02;

import java.util.Scanner;

public class StudentAtSchool {
	public static void main(String[] args) {
	
		study("", "");
		sleep();
		
	}

	public static void study(String name, String topic) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = scan.next();
		System.out.println("Enter the topic: ");
		topic = scan.next();
	System.out.println(name + " is studying " + topic);
		
	}
	/*Method name: sleep
	 * return type: void
	 * params/args/input: int hours
	 * 
	 */
	public static void sleep() {
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		System.out.println("Student sleeps at " + hours+ "pm");
		System.out.println("Student has been sleeping for " + (19-hours) +" hours.");
	}
}
