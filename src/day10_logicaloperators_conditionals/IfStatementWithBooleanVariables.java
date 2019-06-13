package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		
		Boolean isBreakTime = true;
		
	if(isBreakTime) {
		System.out.println("BREAK TILL 8:35 PM");
	}else {
		System.out.println("Not Break time yet.");
	}


	//second version
	
	if(true) {
		System.out.println("BREAK TILL 8:35 PM");
	}else {
		System.out.println("Not Break time yet.");
	}
	
	boolean classTime = false;
	if(classTime == false) {
		System.out.println("Come back on time");
		System.out.println("Stop talking");
		System.out.println("Pay Attention!");
		System.out.println("Code and have fun!");

	}else {
		System.out.println("Take a walk and have some water.");
	}
	
	boolean qualifies = false;
			//send a notification message only if not qualified
			//we need to check if qualified variable contains FALSE
			
		if(qualifies==false) {
		
		System.out.println("Your application was not approved.");
	}
}

} 
