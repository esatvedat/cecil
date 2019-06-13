package day40;

public class Computer {
	
	//instance variables/fields
	//get default value if it s not specifies
	//in template class
	
	//default values can be changed
	//in template class by providing value
	//in template class itself while declaring the filed
	
	//create a template for the computer
	//these are attributes
	String type ="unknown";
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;
	
	//it s highly not recomended to have method direclt 
	//inside your template class --> use different class to create object
//BECAUSE EVERYTHING WILL BECOME MAC IF DO WRITE HERE
	//BETTER TO HAVE TEMPLATE SEPERATELY
	//COOK IN THE KITCHEN NOT IN THE RECIPE!
	//	public static void main(String[] args) {
//		
//		Computer iMac = new Computer();
//		Computer macPro = new Computer();
//		System.out.println(iMac.type);
//		System.out.println(macPro.type);
//	}
	
	

}
