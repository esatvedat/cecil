package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		//automatic casting from smaller to larger type
		
		short shortValue = 3455;
		int intValue = shortValue;
	    //int intValue = (int)shortValue;    (int)  optional
		System.out.println("Int Value: " + intValue);
		
		double price = 345; //no decimals but it s working. java sees it s int and automatically convert it to double.
		System.out.println("Price after casting: " + price);
		
		int price1 = 34563;
		double dPrice = price1;
		
		System.out.println("dPrice after casting: " + dPrice);
		
		
		
		
		
		
	}

}
