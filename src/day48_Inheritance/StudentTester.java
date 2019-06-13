package day48_Inheritance;

public class StudentTester {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Lili";
		p1.age = 25;
		p1.height = 5.5;
		p1.gender = 'M';
		p1.eat();
		
		Student s1 = new Student();
		s1.name = "Sedef";
		s1.age = 25;
		s1.height = 5.5;
		s1.gender = 'M';
		s1.studentId = "SI234";
		s1.eat();
		
		System.out.println(s1.studentId);
	
	}

}
