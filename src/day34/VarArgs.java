package day34;

public class VarArgs {
	public static void main(String[] args) {
		//Vararg --> variable number of arguments
	//we are passing 2 external data to a method
		//that have 2 parameters
		//we are passing 2 arguments to a method
		//that have 2 parameters
		
		add2Numbers(10, 12);
		add3Numbers(10, 12, 14);
		int[] manyNums = new int[3];
		addManyNumbers(new int[] {1,2,3,4,5});
		
		System.out.println("-------VAR ARGS------");
		addManyNumbers2(1,4,5,6,7,8,9,10);
		addManyNumbers2(1,4,5);                               // --->Create a method that can do all
		addManyNumbers2(1,4,111,122, 33, 5,6,7);
		addManyNumbers2(1,4);
		addManyNumbers2(1);
		
		//varArgs -- is used to create a method
		//that can take variable numbers of argument of same type
		//when being called
		
		//varArg parameter is represented by using
		//...after method parameter data type
		//and IT CAN ONLY BE USED HERE!!
		
		
	}
	public static void addManyNumbers2(int... manyNums) {
		//VARARGs are seen exactly the same
		// as an array inside method body
		int sum=0;
		for(int eachNum : manyNums) {
			sum+=eachNum;
		}System.out.println(sum);
	}
	
	
	
	
	public static void addManyNumbers(int[] manyNums) {
		int sum=0;
		for(int eachNum : manyNums) {
			sum+=eachNum;
		}System.out.println(sum);
		
	}

	public static void add2Numbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void add3Numbers(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
}
