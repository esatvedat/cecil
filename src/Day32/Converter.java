package Day32;

public class Converter {
	public static void main(String[] args) {
		
		System.out.println(metertoCM(15));
		System.out.println(FeetToInch(12));
		
		System.out.println(FaToCelcius(100));
		
		 // new requirement: 
	    /* what if i want to get the result as int 
	     * without changing the method return type to int
	     * but store the generated result as int
	     * */
	}
	
	//create a method called meterToCM
	//it takes one int as parameter and return CM
	
	//create a method called FeetToInch
	//it takes one int as parameter and return Inch as double
	
	//create a method called FaToCelcius
	//it takes one double as parameter and return C
	
	
	

	public static int metertoCM(int met) {
		
		int CM = met*100;
		return CM;
	}
	
	public static double FeetToInch(double feet) {
		double inch = 12*feet;
		
		return inch;
	}
	public static double FaToCelcius(double Fa) {
		double celcius = (Fa-32)/1.8;
		return celcius;
	}
}
