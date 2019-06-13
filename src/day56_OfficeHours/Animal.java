package day56_OfficeHours;


public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//the idea is that it's a common behavior for all animals, but all animals speak differently
	
	public abstract void speak(); //cat speaks: meow, dog: woof, cow: moo
	//abstract methods must be implemented in the concrete class
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}

//we cannot instantiate abstract class, even though we can have constructor
	//abstract class allows to have abstract methods
	//abstract class cannot be final 
	//because it must be sub-classed by concrete (regular) class
	//we have to use abstract class only if we are planning to define abstract method	
	//abstract methods cannot be private and final and static
	//because, abstract method must be implemented
	//it can only be public and protected.
	//abstract method will be implemented in the concrete class
	//
