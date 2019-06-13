package day60;


//Director --> Manager --> Employee
public class Director extends Manager{
	int stockOption = 50000;
	
	public static void main(String[] args) {
		Director e1 = new Director();
		Employee e = new Director();
		System.out.println(e.salary);
		
		//how to access Director's stock option
		//in order to access Director specific field we need to refer the Director as a Director
		
		long myLong = 100; //upcasting
		int i = (int) myLong; //downcasting
		
		Director d = (Director) e;
		System.out.println(d.salary);
		System.out.println(d.budget);
		System.out.println(d.stockOption);
		
		Object o = new Director();
		Director m = (Director)o;
		m.budget = 200000;
		m.salary = 130000;
		m.stockOption = 20000;
		
		
		
		
		
	}
	
}
