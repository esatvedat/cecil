package day29_methods01;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//public everybody can use it
	//static you can use it without object
	//void doesnt return any value
	//study name of our behaviour /first custom method
		//create one time use multiple time just writing method name
		study();
		study();
		sayHello();
		carp();
		code();
	
	}
	
	public static void study() {
			System.out.println("Student is studying");
	}
	
	//create a method with sayHello. that prints "Hello Friends!"
	public static void sayHello() {
		System.out.println("Hello Friends!");
	}
	public static void carp() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int	result = a*b;
		System.out.println(a+" x "+ b +" = "+result);
	
	}
	//create a method with name code
	//"Inside code method"
	//"Student is coding Java"
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
		
	}
}
