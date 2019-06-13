package day55;
/*
 
HourlyEmployee class 

	private instance fields 
		id 
		name
		MonthlyHourWorked
		hourlyRate

	constructor to set all 
	add getters and setters 
	add toString method 

  method 
	calculateAnualSalary()

TASKS : 
	ABSTRACT out an Employee class out of these two classes 
	to make it abstract to provide reusable fields 
	and abstract method to provide the idea rather than implementation detail 

 */
public class HourlyEmployee extends Employee{

//  int id;
//  String name;
  private int monthlyHourWorked; 
  private int hourlyRate;
  
  public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
    super(id,name);
    this.monthlyHourWorked = monthlyHourWorked;
    this.hourlyRate = hourlyRate;
  }

  public int getMonthlyHourWorked() {
    return monthlyHourWorked;
  }



  public void setMonthlyHourWorked(int monthlyHourWorked) {
    this.monthlyHourWorked = monthlyHourWorked;
  }



  public int getHourlyRate() {
    return hourlyRate;
  }



  public void setHourlyRate(int hourlyRate) {
    this.hourlyRate = hourlyRate;
  }



  @Override
  public String toString() {
    return "HourlyEmployee [monthlyHourWorked=" 
        + monthlyHourWorked + ", hourlyRate=" 
        + hourlyRate + ", id=" + id
        + ", name=" + name + "]";
  }



  @Override
  public void calculateAnnualSalary() {
  
    int annual = monthlyHourWorked * hourlyRate * 12;
    System.out.println("the salary is : "+ annual);
    
  } 

  
}