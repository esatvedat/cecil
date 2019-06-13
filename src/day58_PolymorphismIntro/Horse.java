package day58_PolymorphismIntro;

public class Horse extends Animal{
	public String color;
	public String legsCount= "Horse leg";
	public void makeNoise() {
		System.out.println("NEIGH NEIGH");
	}
	public static void doStatic() {
		System.out.println("Horse Static");
	}


}
