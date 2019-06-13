package day37;

public class WrapperClass {
	public static void main(String[] args) {
		//Byte b = new Byte((byte) 123);
		
		//upcasting / type widening. //10 is literally considered as int
		//10 --->> 10L and stored inside long variable
		long lval = 10; 
		
		//autoboxing --->
		//10L will become new Long(10L) as object and assigned to lRef
		Long lRef = 10L;
		
		//referance type does not care about the range
		//it only care about the relationship between types
		//range compatible assignment only works for primirive numbers
		
		//Long lRef2 = new Integer (10);
		//ABOVE CODE DOES NOT WORK
		
		//This always mislead programmer to think as below
		//10--> 10L by type widening | or upcasting
		//and then 10L autoboxed to Long Object
		//BIG NO!!!
		//COMPILER IS LAZY--> IT ONLY TAKES ONE STEP!
		//FOR EXAMPLE : It either only take acton of 10-->10L OR 10-->New Integer(10)
		//BIG BAD!!! COMMON TRICKY EXAM | INTERVIEW QUESTIONS
		//Long lRef3 = 10;
		
		Double d = 3.14; //autoboxing
		//compiler cannot turn int 3 Double object in one step
		//and compiler only willing to take one step so it does not word
		//STEP 1: 3-->3.0d
		//STEP 2: 3.0d --> New Double(3.0d); //autoboxing
		//BIG BAD
		//Double badD = 3;
		
		//Double badD = 3; 
		
		
		
		printByteValue((byte) 10);
		byte b = 12;
		printByteValue(b);
		

		
	}
	public static void printByteValue(byte b) {
		System.out.println(b);
	}
}
