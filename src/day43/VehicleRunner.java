package day43;


public class VehicleRunner {
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();
		
		//this.setMake(); not compile
		car1.setMake("Tesla");
		car1.setModel("Model X");
		car1.setSpeed(100);
		
		car1.increaseSpeed(10);
		car1.decreaseSpeed(5);
		
		
		Vehicle car2 = new Vehicle();
		car2.setMake("BMW");
		car2.setModel("M6");
		car2.setSpeed(10);
		
		System.out.println(car2.getSpeed());
		
		car1.stop();
		System.out.println(car1.getSpeed());
		
		
	}
	
}
