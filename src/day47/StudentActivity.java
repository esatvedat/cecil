package day47;

//import is used to import the type that not under the package

//static import
	//-->> is used to import the visible static members of another class
	//we use keyword import static yourClassname.staticMember;
	//just like importing the class, we can use .* to import all static members

import static day47.StudentsUtility.displayAllStudent;
import static day47.StudentsUtility.*;

public class StudentActivity {
	public static void main(String[] args) {
		StudentsUtility.displayAllStudent();
		
		StudentsUtility.addOneStudent("Jon Snow");
		StudentsUtility.addOneStudent("Mavlida");
		StudentsUtility.addOneStudent("Muattar");
		
		StudentsUtility.displayAllStudent();
		StudentsUtility.removeStudent(10);
		StudentsUtility.displayAllStudent();
		
		//System.out.println(studentList);
		//StudentsUtility.displayAllStudent();
		displayAllStudent();
		addOneStudent("Secil");
		addOneStudent("Sedat");
		displayAllStudent();
		
		System.out.println("----------------");
		
		updateStudent(10, "Sharoz");
		displayAllStudent();
		removeStudent(6);
		displayAllStudent();
		
		System.out.println("--------------");
		resetTheList();
		displayAllStudent();

					
	}

}
