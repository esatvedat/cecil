package day35;

public class MethodOverloading5 {
	public static void main(String[] args) {
		
		//ANY literal non-fractional numbers will be seen as int
		//ANY literal fractional numbers will be seen as double
		
		//add(10,12);
		//add(10L,12L); //not work. not matches with our method. long -> double casts  but second long one cant cast to int
		add(10d, (byte)12);
		
		//add(9, 9); //ambigous method call error. compiler gets confused. cant choose which one they seem same to it.
		add(9.0, 9);
		add(300D, 9);
		add(300, 9D);
		
	}
	
	public static void add(double a, int b) {
		System.out.println(" add(double a, int b) ");
	}
	
	public static void add(int a, double b) {
		System.out.println(" add(int a, double b) ");
	}


}
