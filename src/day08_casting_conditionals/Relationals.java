package day08_casting_conditionals;

public class Relationals {
	public static void main(String[] args) {
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1>=d2);
		
		boolean check = d1>=d2;
		
		System.out.println("Check: "+check);
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2>ch1); // 'j' > 'a' comparing decimal number character
		System.out.println(ch1>ch3); // 'a' > 'A';
		System.out.println(ch2>ch3); // 'j' > 'A';
		
		//boolean b = true > false; we cant compare true and false
		
		boolean b = true==false;
		System.out.println("B: " + b); 
		
		boolean b1 = true != false;
		System.out.println("B1: " + b1);
		
		
		
	}

}
