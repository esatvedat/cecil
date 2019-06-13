package day53;

public class FinalVariables {
	private final String SEARCH_ENGINE; //this is not a static variable. It's an instance variable. 
	public final String JUNE ="june"; //instance variable
	final public static int MAX_NUMBER_OF_STUDENTS; //static variable
	final public static int MAX_NUMBER_OF_TEACHERS = 5;
	private final String CEO;
	public static String name; //not a final variable  //static variable
	//The blank final field MAX_NUMBER_OF_STUDENTS may not have been initialized
	//because it's final, it must be initialized
	
	//we need static block to initialize static variables.
	static {
		MAX_NUMBER_OF_STUDENTS = 100; //it is ok do initialize final variables here.
		System.out.println("Hello from static block");
	}
	//it's ok when init block initializes non-final variables.
	{
		name = "James"; //static not final variable
		//MAX_NUMBER_OF_STUDENTS =100;
		System.out.println("Hello from init block");
		SEARCH_ENGINE = "google.com";
	}
	public FinalVariables() {
		CEO = "Firuz";
	}
	public static void main(final String[] args) {
		//final makes variable constant(immutable)
	//	MAX_NUMBER_OF_STUDENTS = 1;
		System.out.println(MAX_NUMBER_OF_STUDENTS);
		FinalVariables obj = new FinalVariables();
		FinalVariables obj2 = new FinalVariables();
		//obj.JUNE = "July"; -> cant compile because JUNE variable was defined already. Since it's final variable, there is no way to update value.
		System.out.println(Math.PI); //->constant, immutable, not change
		//Pi number is final(constant)
		System.out.println(obj.SEARCH_ENGINE);
		name="Leonard"; //->not final. we can reassign it
		final String ssn = "993-02-3000";
		//ssn = "888-34-5666"; will not compile
	}
}
