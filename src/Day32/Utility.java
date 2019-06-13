package Day32;

public class Utility {
	public static void main(String[] args) {
	    
	    String name = "Emine ";
	    System.out.println(  name.length()   );
	      /// There are two ways to call static methods 
	      /*
	       * 1, if the method is in same class 
	       *     we can just directly call the method by it's name 
	       *       and passing the value it required
	       * 2, or we can use className.staticmethodName(params..)
	       * */
	    
	     /// we can use directly staticMethod(params) to call static methods 
	     
	     // we are printing out so we can see the result of method call 
	     System.out.println(   giveMeFive()     );
	     //System.out.println(  5  );  -->> this is what it will become at runtime
	     
	     /// we can use className.staticMethod(params) to call static methods 
	     System.out.println(   Utility.giveMeFive()     );
	     
	     // here we are saving the result so we can use it again later 
	     // instead of calling method again
	     int myNum = giveMeFive(); 
	     System.out.println(myNum);

	    //Task1 : create a method giveMe6DigitSalary that return long
	     //then return the number you have in mind
	     
	     //call this method twice and
	     //calculate how much you ll be making in 2 years
	     
	     System.out.println(giveMe6DigitSalary(130000, 2));
	      
	      long firstYear = giveMe6Salary();
		  long secondYear = giveMe6Salary();
		  System.out.println(giveMe6Salary()+ giveMe6Salary());
		  // second year 10% raise
		  long raised = (long) (giveMe6Salary() * 1.1);
	   
		 System.out.println(isAdultOrNot(2));
		 
		 System.out.println(giveMeBiggerNumber(1,3 ));
	}
	
	//TASK 3:
	//create static method called giveMeBiggerNumber
	//it takes 2 int as parameter
	// and return bigger number
	
	//call the method couple times with different result
	public static int giveMeBiggerNumber(int a, int b) {
		if(a>b) {
			return a;
		}else
		return b;
	}
	
	
	
	
	  //TASK2
	//create a method called isAdultOrNot
	//it takes one int as a parameter and return a boolean
	//inside body --> if the number passed is more than 18 return true
	//else return false
	//call your method couple times and print out the result
	//either by saving it or directly storing it
	
	public static boolean isAdultOrNot(int age) {
		
		if(age >= 18) {
			
			return true; 
		}else {
			return false;
		}
		
		
	}
	
	
	  public static int giveMeFive(){
	    
	    return 5 ; 
	    
	  }
	  
	 
	  public static long giveMe6DigitSalary(int aYearSalary, int count) {
		  long result = aYearSalary*count;
		  return result;
		  
	  }
	  public static long giveMe6Salary() {
		  return 180000L;
	  }
	  
/*
 * public static void main(String[] args) {
		boolean b = isAdiltOrNot();
		System.out.println("Is the person adult?: "+ b);
	}
	public static boolean isAdiltOrNot() {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the age: ");
		int age = scn.nextInt();
		boolean b = age >18? true:false;

		return b;
	}
}
 */
	  
	  

	}