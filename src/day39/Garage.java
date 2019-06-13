package day39;

public class Garage {
	public static void main(String[] args) {
		
		//default values for fields
		//if it s not defined
		/*
		 * Any reference type field --> null
		 * Any whole numbers type --> 0
		 * Any fractional numbers type -->0.0
		 * char --> empty char or ascii 0
		 * boolean --> false
		 * 
		 */
		
		//int i;
		//System.out.println(i); // it ll not compile. 
		//it s a local variable and
		//any local value need to be initialized
		
		Car c1=new Car();
//		c1.model = "Toros";
//		c1.make = "Toyota";
//		c1.year = 2019;
//		c1.price = 60000;
//		c1.horsePower = 200;	
//		
		//if you not put any value;
		System.out.println(c1.model); //null
		System.out.println(c1.make); //null 
		System.out.println(c1.year); //0
		System.out.println(c1.price); // 0.0
		System.out.println(c1.horsePower); //0
		System.out.println(c1.isConvertable); //false 
	}

}
