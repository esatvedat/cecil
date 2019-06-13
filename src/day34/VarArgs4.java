package day34;

public class VarArgs4 {
	public static void main(String[] args) {
		 //varArgs -- is represented in method parameter using...
		 /*
		  * ... CAN ONLY SHOW UP AS METHOD PARAMETERS
		  * IT CANNOT BE USED ANYWHRE ELSE
		  * 
		  * Calling a method that have varArg
		  * we directly pass variable number of arguments
		  * You may also pass an array --(not so common but possible)
		  * 
		  * What if we have more than one parameter in methods
		  *  //if there is multiple parameters varArgs should be last one (thats why doSomethingElse didnt work)
		  *  
		  *  Multiple varargs in one method parameters are not allowed
		  *  you can have at most one varArg in one method
		  *  
		  *  A method that takes varArg as parameter can accept an array object as an argument
		  *  
		  *  A method that takes varArg as parameter cannot accept a varArg  as an argument
		  */
		
		doSomething("magic horse", 1,2,3,2);
//		doSomethingElse(1,2,3, "Magic Horse");
//		doSomethingElse(1, "Magic Horse");
		
	}
		 public static void doSomething(String name, int... nums) {
			 
			 System.out.println("do something was called");		 
			 
		 }
		 
		
		 
//		 public static void doSomethingElse(int... nums, String name) {
//			 
//			 System.out.println("do somethingElse was called");
//	 
//		 }
	}


