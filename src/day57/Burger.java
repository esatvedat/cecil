package day57;

public class Burger implements Edible{

	String name;
	String size;
	
	@Override
	public void eat() {
		System.out.println("Enjoy your burger");
	}

	public Burger(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}
	

}
