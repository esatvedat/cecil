package day59;

import day58_PolymorphismIntro.Animal;
import day58_PolymorphismIntro.Dog;
import day58_PolymorphismIntro.Horse;

public class AnimalMethodHiding {
	public static void main(String[] args) {
		Animal.doStatic();
		Dog.doStatic();
		Horse.doStatic();
		
		System.out.println("*********");
		Animal myAnimal1 = new Dog();
		myAnimal1.doStatic();
		
		Animal myAnimal2 = new Horse();
		myAnimal2.doStatic();
		
		Animal myAnimal3 = new Animal();
		myAnimal3.doStatic();
		
		
		
	}
	

}
