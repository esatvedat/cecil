package day60_OfficeHour;

public class Dog extends Animal {
	String nameDog;

	@Override
	public void speak() {
		System.out.println("Woof Woof");
	}
	
	public Dog() {
		System.out.println("Dog voice");
	}
	

}
