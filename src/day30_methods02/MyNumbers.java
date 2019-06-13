package day30_methods02;

import java.util.Random;

public class MyNumbers {
	public static void main(String[] args) {
		
	showMe5Numbers();	
	
	}
	/*method name : showMe5Numbers
	 * return type : void
	 * params:no
	 * prints 5 random numbers 0, 1000
	 * in same line separated by comma
	 * Ex: 345, 234, 566, 2, 23
	 * 
	 */
	public static void showMe5Numbers() {
		Random random = new Random();
		for(int i=1; i<=5; i++) {
			System.out.print(random.nextInt(1001)+" ");
		}
		System.out.println();
	
	}
	
}
