package day40;

public class Phone {
	
	//these instance variables
	//can be accessed
	//inside instand methods directly
	//just like it is a local variable
	//for that method
	
	//if you are outside class
	//you need an object to access
	//these attributes
	
	  String brand;
	  String OS;
	  int capacity;

	  public void ring() {
	    System.out.println("ringing");
	  }

	  public void dial(long number) {
	    System.out.println("dialing " + number);
	  }
	  public void displayBrand() {
		  
	  }

	}