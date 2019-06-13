package day46;

public class Person {
	String nameString;
	float height;
	char gender;
	
	static String race = "Human";
	
    static int counter;
	//int counter;
	
	public Person() {
		counter++;
		
	}

	public Person(String nameString, float height, char gender) {
		this.nameString = nameString;
		this.height = height;
		this.gender = gender;
		
	//	counter = counter +1;
		counter ++;
		
		//you cannot reach static place with non-static
	}
	
	

}
