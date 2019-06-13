package day35;

public class MethodOverloading3 {
	public static void main(String[] args) {
		add(10);
		add(10L);
		add((int)1000000000L);
		add((short)100);
		
	}
	
	public static void add(int x) {
		System.out.println(" int x " + x);
	}
	
	public static void add(long x) {
		System.out.println(" long x " + x);
	}
	
	public static void add(short x) {
		System.out.println(" short x " + x);
	}
}
