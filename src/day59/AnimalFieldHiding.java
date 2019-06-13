package day59;

import day58_PolymorphismIntro.*;
public class AnimalFieldHiding {
	public static void main(String[] args) {
		Animal myAni = new Dog();
		System.out.println(myAni.legsCount);
		
		Cat catleg = new Cat();
		System.out.println(catleg.legsCount);
		
		Animal ani2 = new Cat();
		System.out.println(ani2.legsCount);
		
		//Fields are not overriden it s only hidden
		//and only reference type decide what you can access
		//that s why there is no power of polymorphism is going on here
		//the field is being accessed is all coming from Animal class
		//at compile time and run time
		
		
		
		
	}
}
