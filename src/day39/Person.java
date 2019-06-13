package day39;
import java.util.*;
public class Person {
	
		
//		String str = new String("abc");
//		Scanner scan = new Scanner(System.in);
//		Random ran = new Random();
		
		//properties/attributes of the object are defined by instance variable/field
		
		String name;
		int age;
		char gender;
				
		//public static void eat(){
		//any non-static method is called INSTANCE METHOD
		public void eat() {
			System.out.println("eating ");
		}
		
		
		public void tellMeYourName() {
			System.out.println("My name is " + name);
		}

		public void printPersonInfo() {
			System.out.println("My name is " + name + 
					"| My Age is "+ age +
					"| my gender is " + gender);
			
		}


}
