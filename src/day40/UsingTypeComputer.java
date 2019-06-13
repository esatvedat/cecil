package day40;

public class UsingTypeComputer {
	public static void main(String[] args) {
		Computer myComp = new Computer();
		Computer[] comArr = new Computer[3];
		
		printComputer(myComp);
	}
	//We created a method that return computer object
	public static Computer getComputer() {
		//in order to return computer object
		//first we need to create an object
		Computer iMac = new Computer();
		iMac.OS = "MAC OS";
		return iMac; //returned computer object
	}
	//created a method that accept computer as parameter
	//so when we call this method
	//we will pass computer object as an argument
	public static void printComputer(Computer comObject) {
		System.out.println("computer object");
	}

	public static void printString(String strObj) {
		System.out.println(strObj);
	}
	public static String getString() {
		return "my string";
		
	}
}
