package day35;

public class MainClass {
	public static void main(String[] args) { //cannot change the data type. just this one has power to run this app. Just this one is valid.
		 // java MainClass abc d egf 
	    // this is how it's working behind scence
	    // String[] args = {"abc","d","egf"} ; 
	    // if we dont pass any cmd argument 
	    // String[] args = {} ;     
		
		
		System.out.println("I did not come this far just to come this far");
		System.out.println(args.length);
		System.out.println(args[0]); //out of bound error
	}

}
