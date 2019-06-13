package day55;
/*
 * 
SalariedEmployee

private instance fields 
		id 
		name
		monthlySalary 
 method 
	calculateAnualSalary()
	add getters and setters 
	add toString method 

 */
public class SalariedEmployee extends Employee {
	int monthlySalary;
	
	 @Override
public void calculateAnnualSalary() {
System.out.println(monthlySalary*12);	  
	 
	  } 
	
}
