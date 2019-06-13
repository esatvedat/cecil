package day54;


public class FinalInstanceFields {
	
	// FINAL FIELDS MUST BE INITIALIZED BEFORE USAGE
	final int NUM=100;
	final int NUM1= getNumber();
	final int NUM2;
	final int NUM3;
	
	{
		NUM2 = 200;
	}
	
	public FinalInstanceFields() {
		NUM3 = 300;
	}
	private int getNumber() {
		return 150;
	}
	
	public static void main(String[] args) {
		//local final variable does not have to get initial value
		//IF NOT USED
		
		//final int NUM;
		final int x; //if we dont assign it no matter final or not it wont compile 
		x=20;
		//x=30; -> if it s final cant be reassign
		System.out.println(x);
		FinalInstanceFields f1 = new FinalInstanceFields();
		System.out.println(f1.NUM);
		System.out.println(f1.NUM2);
		System.out.println(f1.NUM3);
		
		//f1.NUM = 200; cannot reassign value for final value
		
		
		System.out.println("THE END");
	}

}
