package day55;

public abstract class Employee {

	  int id;
	  String name;

	  public Employee() {
	    // TODO Auto-generated constructor stub
	  }

	  public Employee(int id, String name) {
	    this.id = id;
	    this.name = name;
	  }

	  public abstract void calculateAnnualSalary();
	//   {
//	     System.out.println("CALCULATE YOURSELF MY CHILD");
	//   }

	}
