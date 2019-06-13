package day45;

public class Mathmagic {
	public static void main(String[] args) {
		MathEquation2 math1 = new MathEquation2(120,10,'+');
		MathEquation2 math2 = new MathEquation2();
		
		math1.calculate();
		System.out.println(math1.getResult());
	}

}
