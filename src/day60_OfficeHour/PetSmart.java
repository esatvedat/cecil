package day60_OfficeHour;

public class PetSmart {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.speak();
		c1.nameCat = "Fluffy";
		
		Animal c2 = new Dog();
		c2.nameAnimal = "Boncuk";
		c2.speak();
		
		Cat c3 = new Cat();
		c3.nameCat = "Yumak";
		c3.speak();
		
		//Animal c4 = new Animal();  -> not compile
		
		System.out.println(c3);
		
		Dog c4 = new Dog();
		c4.nameDog = "Alex";
		System.out.println("c4 " + c4);
		
		Animal c5 = new Dog();
		c5.nameAnimal = "A";
		System.out.println(c5);
			
					
	}

}
