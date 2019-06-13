package day59;


import day58_PolymorphismIntro.*;

public class AnimalShow59 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		//copying the address stored inside c1
		//into c2 variable, and it s pointing to same object
		Cat c2 = c1;
		
		//c1 = new Dog();
		Animal a1 = c1;
		
		a1 = new Dog();
		
		IndoorPet i1 = c1;
		
	
		
		
		
		
	}
	

}
