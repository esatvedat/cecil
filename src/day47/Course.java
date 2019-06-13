package day47;

public class Course {
	
	public static String school;
	public static boolean isRamadan;
	
	public Course() {
		System.out.println("Constructor");
	}
	//System.out.println(school); You cannot put any statement outside of block
	
	//STATIC BLOCK / STATIC INITILIZER BLOCK
	//it ll only run once when the class is loaded
	//it's used to initialize the static fields value before
	//the type's first usage and it ll run only one time
	//if you have more than one block it ll run in order it appears
	
	//It s used to initialize the static fields value before
	//the type's first usage and it will run only one time
	
	
	static {
		isRamadan = true;
		if(isRamadan) {
			System.out.println("Use ramadan schedule");
		}else {
			System.out.println("Use normal schedule");
		}
	}
	static {
		school = "CyberTek School";
		System.out.println("Welcome to our school : " + school);
		System.out.println("Let the Journey Begin!");
	}
}
	
	
	//int courseId;
	
//	public static void main(String[] args) {
//		System.out.println(school);
//		//System.out.println(courseId);--> not compile because courseId s not static
//		
//		
//		}

