package day57;

public class IceCoffee implements Drinkable{

	String size;
	
	public IceCoffee(String size) {
		super();
		this.size = size;
	}

	@Override
	public void eat() {
		System.out.println("Burger and coffee is not good idea");
		
	}

	@Override
	public void drink() {
		System.out.println("Try Coke!");
		
	}

	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}
	

}
