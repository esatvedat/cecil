package day46;

public class PersonCounting {
	public static void main(String[] args) {
		Person p1 = new Person("Ganisher", 6.1f, 'M');
		Person p2 = new Person("Mavlida", 5.3f, 'F');
		Person p3 = new Person("Manzire", 5.3f, 'F');
		Person p4 = new Person();
		
		
		
	//	System.out.println(Person.counter);
		System.out.println(p1.counter);
		System.out.println(p2.counter);
		System.out.println(p3.counter);
		System.out.println(Person.counter);
		
		
	}

}
