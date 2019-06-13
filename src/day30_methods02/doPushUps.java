package day30_methods02;

import java.util.Scanner;

public class doPushUps {
	public static void main(String[] args) {
		doPush10Ups();
		rangePrint();
		/*name : doPush10Ups
		 * return type : void
		 * params:no
		 * 
		 * Pushup -1
		 * Pushup -2
			..
			Pushup -10
		 Time to rest
		 */
		
	}
	public static void doPush10Ups() {
		int i=1;
		while(i<=10){
			System.out.println("Pushup - " + i);
			i++;
		}System.out.println("Time to rest!");
	}
	/*method name: rangePrint
	 * return type: void
	 * params/args: no
	 * Using a scanner ask for 2 integers
	 * you need to print all numbers between those to numbers
	 * Ex:
	 * rangePrint();
	 * 5
	 * 8
	 * 5 6 7 8
	 * rangePrint();
	 * 10
	 * 7
	 * 10 9 8 7
	 */
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		if(num2 > num1) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i+ " ");
			}
		
		}else if(num1 > num2) {
			for(int j = num1; j >= num2; j--) {
				System.out.print(j+" ");
			}
		}else {
			System.out.println(num1);
		}
		System.out.println();
		System.out.println("-------------------");
	}
}
