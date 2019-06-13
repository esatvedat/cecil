package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		int i = 10;  //i is a container, contains integer value of 10
		Scanner scan = new Scanner(System.in);   //scanner is a container, is a referance type, address of the object, pointer to the object
		Double d = new Double("3.14");  //d is pointing to the address
		float f = 1.4f; //primitive data type
		
		//an ArrayList variable lst is created
		//an ArrayList object is created and assignmed to lst
		//it did not specify what we can store in this ArrayList
		//so we can store any type
		ArrayList lst = new ArrayList(); //before JDK 5  //lst a variable, ArrayList is another type, it is an object, you can add whatever item you want
		lst.add("abc");
		lst.add("efg");
		lst.add(new Integer(10));
		lst.add(Character.valueOf('A')); //highly suggested to store in one type to see what s come out
		
		System.out.println(lst);
		
		
		ArrayList<String> lst1 = new ArrayList<String>(); //After JDK 5
		ArrayList<String> lst2 = new ArrayList<>(); //After JDK 7
		
		
	}
}
