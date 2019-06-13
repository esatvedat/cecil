package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		
	System.out.println(10 / 2.0); //java chooses larger type so the result will be double
	System.out.println(10.0 / 2); //double
	
	int result = (int)(10/2.0); //or (int) 10/(int)2.0
	System.out.println("The result: "+result);
	
	int rent1 = 987;
	int rent2 = 1100;
	int rent3 = 894;
	int rent4 = 1234;
	
	double avarage = (double)(rent1 + rent2 + rent3 + rent4) / 4.0;
	//OR double avarage = (double)(rent1 + rent2 + rent3 + rent4) / 4;	
	System.out.println("Avarage: " + avarage);
	
	double d = 40.2;
	int i = (byte)d;
	//in above statement explicit and implicit casting happening
	//explicit: double>byte
	//implicit:byte > int
	
	int a =10;
	int b =20;
	int x=a;
	b=x;
	a=b;
	System.out.println(a+","+b);
	
	//int a =10;
	//int b=a;
	// a=20;
	//System.out.println(a+","+b);
	
	System.out.println('a'+1);
	char ch = 98;  //int
	System.out.println(ch);
	
	
	}

}
