package day60_OfficeHour;

public abstract class Animal {
	String nameAnimal;
	public abstract void speak();
	
	public Animal() {
		System.out.println("Animal voice");
	}

	@Override
	public String toString() {
		return "Animal [nameAnimal=" + nameAnimal + "]";
	}
	
	
}
