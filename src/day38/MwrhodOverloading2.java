package day38;

public class MwrhodOverloading2 {
	public static void main(String[] args) {
		doSomething(new Integer(100));
		doSomething(Integer.valueOf(100));
		doSomething(100);
		
		//can we set a Integer variable value to null?
		//ANSWER YES!!
		//int x = null; BAD IDEA
		Integer b = null; //it works.
		doSomething(null);
		// null is a variable is a reference to an object. A null value thus indicates an unset reference
		
		//Integer x =100;
		//doSomething(x);
		int val = Integer.parseInt("100");
		doSomething(val);
		
		
	}
	public static void doSomething(int x) {
		System.out.println("doSomething(int x)");
	}
	
	public static void doSomething(Integer x) {
		System.out.println("doSomething(Integer x)");
		
	}

}
