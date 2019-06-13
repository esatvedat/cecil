package day39;

public class RunnerClass {
	public static void main(String[] args) {
		//local variable
		//String s = "abc";
		
		// Creating new Person object
		Person p1 = new Person();
		//setting attributes value of object
		p1.name = "Talmurat";
		p1.age = 1;
		p1.gender = 'M';
		
		//Creating new Person object
		String name = "Jon Snow";

		int age = 33;
		char gender = 'm';
		//setting attributes value of object
		Person p2 = new Person();
		p2.name = "Diana";
		p2.age = 27;
		p2.gender = 'F';
		
		System.out.println(p1.name);
		
		Horse spartan = new Horse(); //it works because we are in the same package
		spartan.breed = "Mustang";
		spartan.age = 10;
		spartan.color = "Black";
		spartan.height = 10;
		System.out.println(spartan.breed + " " + spartan.age + " " + spartan.color);
		
		/*
		 * Horse :
		 * 			properties 
		 * 				: color, breed, age
		 * 			behaviors 
		 * 				: jump, eat, run, kick, whinny
		 * 
		 *  Person :
		 *  		properties
		 *  			: name, age, gender
		 *  		behaviors
		 *  			: eat, study, laugh, speak, sleep
		 * 
		 */
		
		
	}

}
