package day59;

import day58_PolymorphismIntro.Horse;
import day58_PolymorphismIntro.*;

public class AnimalShow59_1 {
	public static void main(String[] args) {

		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		
		myAnimal = new Cat();
		myAnimal.makeNoise();
		
		//this is creating object
		//without storing the address of the object
		//and just using it once -- like calling method as below
		
		//this object is not accessible after this line
		//because we did not write down the address
		
		new Dog().makeNoise();
		
		Animal a2 = new Horse();
		
		a2.makeNoise();
		
		Horse h1 = new Horse();
		h1.makeNoise();
		h1.color = "black";
		
		
		
		
		
		
		
		
	}
	

}
