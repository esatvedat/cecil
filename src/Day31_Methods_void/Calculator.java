package Day31_Methods_void;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		add(10.2, 11.2);
		substract(3.4, 0.8);
		multiply(12, 4);
		divide(-22,2);
		remainder(48,-3);
		divide(2,0);
		//using scanner pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1= scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%' ");
		String operator = scan.next();
		
		switch(operator){
			case "+":
				add(n1, n2);
			break;
			case "-":
				substract(n1, n2);
			break;
			case "*":
				multiply(n1, n2);
			break;
			case "/":
				divide(n1, n2);
			break;
			case "%":
				remainder(n1, n2);
			break;
			default:
				System.out.println("invalid operator");
			break;
		}
	
	}
	//add, substract, multiply, divide, remainder
	
	
public static void add(double num1, double num2) {
	double result = num1 + num2;
	System.out.println("Result: "+result);
}
public static void substract(double num1, double num2) {
	double result = num1-num2;
	System.out.println("Result: "+result);
}
public static void multiply(double num1, double num2) {
	double result = num1*num2;
	System.out.println("Result: "+result);
}
public static void divide(double num1, double num2) {
	if(num2==0) {
		System.out.println("cannot / by zero");
		return;
	}
	double result = num1/num2;
	System.out.println("Result: "+result);
}
public static void remainder(double num1, double num2) {
	double result = num1%num2;
	System.out.println("Result: "+result);
}
}
