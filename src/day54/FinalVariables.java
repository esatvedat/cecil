package day54;

public class FinalVariables {
	

	public static void main(String[] args) {
		
		//cannot reassign a value for final variable
		
		//a primitive type store value directly so final variable
		//x can not have new value here
		
		
		final int x = 10;
		   //we cannot reassing a value for final variable
		
		//a referance variable store address of the object
		//once it's pointed to the object, it can not point to different object
		
		final Building b1 = new Building(100);
		b1.num = 200;
		b1.num = 300;
		
	//	b1 = new Building(200); -->>not compile!!
		
		
		Building b2 = b1;
		
		System.out.println(b1.num);
	}
}

class Building{
	int num;
	
	public Building(int num) {
		this.num = num;
	}
}
