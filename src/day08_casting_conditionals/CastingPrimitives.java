package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		
		System.out.println("i: " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("Dollars: " + dollars);
		
		//WHOLE NUMBERS. byte, short, int
		
		int count = 44;
		byte byteCount = (byte)count;
		System.out.println("byteCount: " + byteCount);
		
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		System.out.println("intValue: "+intValue);
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: "+ small);
		
		int result = (int)(500.4/2.0);  
		//OR int result = (int)500.4/(int)2.0;
		System.out.println("Result: " + result);
		
		byte b = 123;
		int a = b; //(int) is optional. it ll automatically cast it.
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
