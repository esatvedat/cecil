package day48_Inheritance;

//if the field is in same package different class
//protected, default are both accessible

//if the field is in different package different class
//protected + public

public class Animal {
	private String breed;
	protected String color;
	protected boolean wild;
	int legCount;
	
	//what if 
	//I want to access the members in sub classes located in different packages
	
	//Protected Access Modifier
	//Enable sub classes outside package
	//to access super classes protected(access modifier) fields

}
