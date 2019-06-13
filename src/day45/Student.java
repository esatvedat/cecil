package day45;

public class Student {
	
	String name;
	int age;
	String major;
	
	//one constructor can be called
	//in another constructor of same class
	//this(arguments)
	
	//However
	//THIS CAN BE ONLY A SINGLE CALL
	//this(arguments) cannot be called more than once
	//this(args..)
	//call MUST BE first line of your constructor
	
	public Student() {
		//System.out.println("dsbfsbd"); ->cannot be here. 
		//constractor code hv to be very first
		//calling constructor with 1 atgument
		//to put default name
		this("no name");
		System.out.println("no arg");
	}
	public Student(String name) {
		System.out.println("1 arg " + name);
	}
	public Student(String name, int age, String major) {
		this();
		//this("my name"); this keyword only show up once. 
		//you cannot call constructor twice
		System.out.println("3 arg");
	}
}
