package day53;

public class Dog extends Animal{
	//not overriden method
	//different method
	//because we dont override static method
	public static void m1() {
		System.out.println("Dog class m1");
	}
	
	/*
	 * There is no connection between static methods
	 * in the sub class and super class
	 * 
	 * super() - for constructor
	 * super. for instance methods, fields
	 */
	@Override   //non-static
	public void run() {
		//parent class version m1()
		super.run(); // we are calling super m1()
		System.out.println("Dog is running");
	}


}
