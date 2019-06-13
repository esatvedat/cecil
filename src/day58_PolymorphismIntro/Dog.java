package day58_PolymorphismIntro;

public class Dog extends Animal implements IndoorPet {
	public String legsCount= "Dog leg";
	String breed;
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}
	public static void doStatic() {
		System.out.println("Dog Static");
	}

}
