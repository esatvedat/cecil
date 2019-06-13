package day48_Inheritance;

public class Horse extends Animal {
	int shoesCount;
	int horsePower;
	/*
	 * We dont inherit something we dont see
	All color, wild, legCount have default access modifier 
	if Animal is in different package, they are not visible in this package

	 */

	public static void main(String[] args) {
	
		Horse h1 = new Horse();
		//h1.breed = "spartan";
		h1.wild = false;
		h1.horsePower = 600;
		//System.out.println(h1.breed);
		System.out.println(h1.horsePower);
		
		
//		Animal a1 = new Animal();
//		a1.wild = false;
		
//		System.out.println(a1.breed);
//		System.out.println(a1.legCount);
//		System.out.println(a1.color);
//		System.out.println(a1.wild);
//	//	System.out.println(a1.horsePower);
	}
}
