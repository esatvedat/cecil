package day39;

public class ExplorePersonBehavior {
	public static void main(String[] args) {
		
		//Person.eat(); not compiling because our method is not static
		
		Person p = new Person();
		p.age = 19;
		p.gender = 'M';
		p.name = "Night King";
		
		Person p2 = new Person();
		p2.age = 19;
		p2.gender = 'F';
		p2.name = "Night Quenn";
		
		
		p.eat();
		p2.eat();
		p.tellMeYourName();
		p2.tellMeYourName();
		p.printPersonInfo();
		
	}

}
