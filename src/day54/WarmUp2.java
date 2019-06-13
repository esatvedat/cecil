package day54;

import java.util.Random;

import day34.warmUp;

public class WarmUp2 {
	
	//How can we initialize fields value
	/*
	 * if no action is taken, default value will be provided
	 * we can directly assign the value with value 
	 * or we can call a method
	 * it can be initialized in initializer block
	 * it can be initialized in constructor
	 * 
	 */
	
	int num =  getANumber();  // 100;
	
	public WarmUp2() {
		
	}
	public static void main(String[] args) {
		WarmUp2 w = new WarmUp2();
		System.out.println(w.num);
	}
	public int getANumber() {
		Random r = new Random();
		int number = r.nextInt(100);
		return number;
	}

}
