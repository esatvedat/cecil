package day53;

public class Animal {
	//from now on, this method hidden
	//because sub class defines exactly same method
	public static void m1() {
		System.out.println("Animal class m1");
	}
	public static void m2() {
		System.out.println("Animal class m2");
	}

	public void run() {
		System.out.println("Animal running");
	}
}
