package day47;

import java.util.ArrayList;

public class StudentsUtility {
	
	// create a private static field called studentList as ArrayList of String
	
	private static ArrayList<String> studentList;
	
	// create a static block to print out "Welcome to StudentUtility"
	static {
		System.out.println("Welcome to StudentsUtility");
	}
	
	//create another static block
		//initialize your arrayList object
		//add 10 students
	static {
		studentList = new ArrayList<String>();
		studentList.add("Abdul Kahn");
		studentList.add("Nurilla");
		studentList.add("Odiljan");
		studentList.add("Ansar");
		studentList.add("Muhammad");
		studentList.add("Ali");
		studentList.add("Erdem");
		studentList.add("Muratbek");
		studentList.add("Marat");
		studentList.add("Kubanych");
		System.out.println("ALL STUDENT HAS BEEN LOADED");
	}
	// create a method to pre-populate 10 student into the list 
	  private static void loadAllMyData() {
	    
	    studentList = new ArrayList<String>();
	    studentList.add("Abdul Kahn");
	    studentList.add("Nurilla");
	    studentList.add("Odiljan");
	    studentList.add("Ansar");
	    studentList.add("Muhammad");
	    studentList.add("Ali");
	    studentList.add("Erdem");
	    studentList.add("Muratbek");
	    studentList.add("Marat");
	    studentList.add("Kubanych");
	  
	    
	  }
	
	//check if works
	public static void main(String[] args) {
		//System.out.println(studentList);
		//StudentsUtility.displayAllStudent();
		displayAllStudent();
		addOneStudent("Secil");
		addOneStudent("Sedat");
		displayAllStudent();
		System.out.println("----------------");
		updateStudent(10, "Sharoz");
		displayAllStudent();
		removeStudent(6);
		displayAllStudent();
		System.out.println("--------------");
		resetTheList();
		displayAllStudent();
	}
	
	//create a static method called displayAllStudent, accept no param return nothing
	
	public static void displayAllStudent() {
		for(int i=0; i<studentList.size(); i++) {
			System.out.println("No: " + (i+1) + "-> " + studentList.get(i));
		}
		
	}
	
	//create a static method called addOneStudent, accept one parameter as String name
		//and add that name to the List, return no value
	public static void addOneStudent(String name) {
		studentList.add(name);
	}
	//create a static method called updateStudent
		//accept 2 param index as int, newNae as String
		//and it ll update the name of student at that location
	public static void updateStudent(int index, String newName) {
		if(index >= studentList.size()) {
			System.out.println("Out of range");
			return;
		}
		studentList.set(index, newName);
	}
	
	//create a static method called removeStudent
		//accept 1 param index as int
		//and it ll remove the name of student at that location
	public static void removeStudent(int index) {
		if(index >= studentList.size()) {
			System.out.println("Out of range");
			return;
		}
		studentList.remove(index);
	}
	//create a static method called resetTheList
		//accept no param and delete everything in the list
	public static void resetTheList() {
		studentList.clear();
	}
}
