package day44;
/*
 * Create a class called MathEquation
    add 4 private fields
        oprand1 , oprand2 , result as double
        operator as char

    Encapsulate first 3 fiels
        with getters and setters
        provide only getter for the result

    Create no arg constructor
        just print out message from no Arg

    create 1 arg constructor
        set the operator value

    create 3 args constructor
        set all 3 fields value

    create a void instance method with no parameter
        set the result value
            according to oprand1 oprand2 operator
            if operator is + - * /
                calculate result

    Create toString method to return all fields value
 */
public class MathEquation {
	private double oprand1, oprand2, result;
	private char operator;
	
	public MathEquation() {
		System.out.println("no Arg");
	}
	public MathEquation(char operator) {
		System.out.println(operator);
	}
	public MathEquation(double oprand1, double oprand2, char operator) {
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator;
		
	}
	public void calculate() {
		switch(this.operator) {
		case '+':
		this.result = this.oprand1 + this.oprand2;	
		break;
		case '-':
			this.result = this.oprand1 - this.oprand2;
			break;
		case '*':
			this.result = this.oprand1 * this.oprand2;
			break;
		case '/':
			this.result = this.oprand1 / this.oprand2;
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
	
	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	public double getOprand1() {
		return oprand1;
	}
	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}
	public double getOprand2() {
		return oprand2;
	}
	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}
	public double getResult() {
		return result;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	

}
