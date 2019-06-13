package day35;

public class MethodOverloadingExmples {
	
	public static void main(String[] args) {
		String name = "Java";
		
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("a", 2));
		System.out.println(name.replace('a', 'B'));
		System.out.println(name.replace("va", "java"));
		// not valid because of same method name and same method parameter list
//	    public static void addNums(int x,int y) {
//	      System.out.println("aaaaa");
//	    }
	  
	  // not valid because of same method name and same method parameter list
//	    public static int addNums(int a,int b) {
//	      return a+b;
//	    }
	  
		
		//Create a few static methods called addNums 
		
		System.out.println(addNum(1,2));
		System.out.println(addNum(1,3,4));
		addNum(1,2,3,4);
	}
		//first one take 2 numbers and add them
		//return the result as int
	
		public static int addNum(int num1 , int num2) {
			return num1+num2;
			
		}
		
		//first one take 3 numbers and add them
		//return the result as int
		
		public static int addNum(int num1 , int num2, int num3) {
			return num1+num2+num3;
			
		}
		
		//first one take 4 numbers and add them
		//does not return a value
		//return the result as int
		
		public static void addNum(int num1 , int num2, int num3, int num4) {
			int result = num1 + num2 + num3 + num4;
			System.out.println(result);
		}
	}

