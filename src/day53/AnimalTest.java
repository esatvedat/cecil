package day53;

public class AnimalTest {
	public static void main(String[] args) {
		Dog.m1();
		Animal.m1();
		Dog dog1 = new Dog();
		dog1.run();
		//in the Dog class we have same static method
		//that means m1() from Animal class is hidden
		Dog.m1();
		Dog.m2();
		
		
	}

}
