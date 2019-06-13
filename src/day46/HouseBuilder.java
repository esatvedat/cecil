package day46;

public class HouseBuilder {
	public static void main(String[] args) {
		
		CyberHouse h1 = new CyberHouse(1, "Victorian");
		CyberHouse h2 = new CyberHouse(2, "Spanish");
		
		//accessing static variable
		//we access static members using static way
		//className.staticFieldName
		//className.staticMethodName(args...)
		
		//CyberHouse.neighborhoodName = "CyberTek Corner";
		System.out.println(CyberHouse.neighborhoodName);
		
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		h1.houseNumber = 100;
		//changing instance variable value of object does not affect another object
		System.out.println(h1.houseNumber);
		
		//can we use object to access static variable
		//even though it's recommended to use static way
		//which is className.staticVariable
		
		System.out.println(h1.neighborhoodName);
		System.out.println(h2.neighborhoodName);
		
		System.out.println("**************");
		//changing static variable value of using static way or using object will affect each every object
		h1.neighborhoodName = "CyberTek Tower";
		System.out.println(h2.neighborhoodName);
		System.out.println(h1.neighborhoodName);
		
		
	}

}
