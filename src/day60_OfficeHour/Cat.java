package day60_OfficeHour;

public class Cat extends Animal {
 String nameCat;

	@Override
	public void speak() {
		System.out.println("Meaow Meaow!");
	}

	public Cat() {
		System.out.println("Cat voice");
	}

	@Override
	public String toString() {
		return "Cat [nameCat=" + nameCat + "]";
	}
	
}
