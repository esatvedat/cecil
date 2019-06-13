package day42;

public class Employee {
	
	//instance variable --> used to define properties | attribute of the objects
	String name;
	int age;
	String title;
	double salary;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	//instance method --> used to read or manipulate the properties | attribute of the objects
	public void printAllInfo() {
		System.out.println("Name is " + name + " | "
				           + "Age is " + age + " | "
				           + "Title is " + title +" | "
				           + "Salary is " + salary);
		
		
	}

}
