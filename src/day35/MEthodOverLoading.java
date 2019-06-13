package day35;

public class MEthodOverLoading {
	public static void main(String[] args) {
		/*
		 * can I use same method name for different methods?
		 * 
		 * YES !!!
		 * That's called method overloading
		 * 
		 * Defination:
		 * reusing the name of the method with different method parameters
		 * 
		 * you cn have method with different parameter count
		 * you can have method with different parameter type
		 * or both
		 */
		printName();
		printName("Java");
		printName("Java", "Spartan");
		printName(12);
	}
		public static void printName() {
			System.out.println(" Method overloading ");
			
		}
	
		public static void printName(String name) {
			System.out.println(" Method overloading " + name);
			
		}
		public static void printName(String firstName, String lastName) {
			System.out.println(" Method overloading " + firstName + lastName);
			
		}
		public static void printName(int number) {
			System.out.println(" Method overloading " + number);
			
		}

}
