package day46;


/*
 * Design pattern 
 * -- set of common programming practices to solve certain problems
 * 
 * Singleton :
 * --a pattern to make sure single instance of object is created
 * 		during entire runtime of the application
 */

public class FlyingCars {
	
	//String name;
	FlyingCars fcar;
	
	private FlyingCars() {
		
	}
	
	public static FlyingCars getInstance() {
		FlyingCars f1 = new FlyingCars();
		
	//	return new FlyingCars(); OR
		return f1;
	}

}
