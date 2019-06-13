package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeActions {
	public static void main(String[] args) {
		
	Employee e1 = new Employee();
	e1.name = "Abdul";
	e1.age = 100;
	e1.title = "Project Manager";
	e1.salary = 120000.01;
	e1.printAllInfo();
	
	Employee e2 = new Employee();
	e2.name = "Makintosh";
	e2.age = 10;
	e2.title = "student";
	e2.salary = 50;
	e2.printAllInfo();
	
	Employee e3 = new Employee();
	e3.name = "Mavlida";
	e3.age = 38;
	e3.title = "Senior QA";
	e3.salary = 125000;
	e3.printAllInfo();
	
	Employee e4 = new Employee();
	e4.name = "Enser";
	e4.age = 20;
	e4.title = "Dev";
	e4.salary = 80000;
	e4.printAllInfo();
	
	ArrayList<String> names = new ArrayList<>();
	
	ArrayList<Employee> myPeople = new ArrayList<>();
	myPeople.add(e1);
	myPeople.add(e2);
	myPeople.add(e3);
	myPeople.add(e4);
	myPeople.add(new Employee());
	
	System.out.println(myPeople.size());
	//System.out.println(myPeople.get(4)); ->hashcode
	Employee firstItem = myPeople.get(0);
	firstItem.printAllInfo();
	
	Employee forthItem = myPeople.get(3);
	forthItem.printAllInfo();
	
	Employee fifthItem = myPeople.get(4);
	fifthItem.printAllInfo();
	
	System.out.println("*****************");
	myPeople.get(1).printAllInfo();
	
	for(int i =0; i< myPeople.size(); i++) {
		
		//store each item -- Employee Object
		Employee each = myPeople.get(i);
		//calling method using this variable
		each.printAllInfo();
		//myPeople.get(i).printAll
	}
	System.out.println("***************");
	//PRINT OUT EMPLOYEES THAT MAKE MORE THAN 100K
	for(int i=0; i<myPeople.size(); i++) {
		Employee each100 = myPeople.get(i);
		if(each100.salary>100000)
			each100.printAllInfo();
	}
	System.out.println();
	
	//COUNT EMPLOYEE THAT YOUNGER THAN 30
	int count = 0;
	for(int i=0; i<myPeople.size(); i++) {
		Employee eachY30 = myPeople.get(i);
		if(eachY30.age < 30) {
			count++;
		}
	}	System.out.println(count);
		
	
	//SAVE THE NAME OF ALL EMPLOYEE
	//WHO IS MORE THAN 25 INTO A String VARIABLE NAME
	
	String name = "";
	for(Employee each25 : myPeople) {
		if(each25.age > 25)
		name += each25.getName()+" | ";
	}
	System.out.println("\n----------more than 25----------\n" + name);
	
	System.out.println("----------Raise the salary of Employee who is younger than 100 by 20K-----");
	for(int i = 0; i<myPeople.size(); i++) {
		Employee each = myPeople.get(i);
		if(each.name != null && each.age <100) {
			each.salary += 20000;
			each.printAllInfo();
			
		}
	}
	
	}
}
