package day56;
/*
 * abstract class Shape

	instance filed : 
		color

	1 arg constructor to set the field value 

	abstract methods 

		calculatePerimeter() 
		calculateArea()  
		abstract toString() method accpet no param , return String 

	 */
public abstract class Shape {
	  
	  String color;
	  
	  
	  public Shape(String color) {
	    this.color=color;
	  }
	  
	  public abstract  void calculatePerimeter();
	  public abstract  double calculateArea();
	  @Override
	  public abstract String toString(); 
	  
	  
	  
	  // THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD 
	  
	  // --->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT'S DEFINED IN ABSTRACT METHOD
	  

	}


