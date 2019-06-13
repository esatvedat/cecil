package day43;

public class Vehicle {

	/*
	 * create a class called Vehicle with few private fields model, make, current speed
	 * create getters and setters for all those private fields
	 * 
	 * create methods: increaseSpeed it accepts one parameter increaseBy as int
	 * and increase the speed to new speed.
	 * if your current speed is 10 and you pass 5 to this method, outcome should be 10,11,12....
	 * 
	 * create methods: decreaseSpeed it accepts one parameter decreaseBy as int
	 * and increase the speed to new speed.
	 * if your current speed is 10 and you pass 5 to this method, outcome should be 10,11,12....
	 */
	
	private String model, make;
	private int speed;
	
	public void increaseSpeed(int increaseBy) {
		for(int i=0; i<increaseBy; i++) {
			speed++;
			System.out.print(speed + " | ");
		}System.out.println();
		
		
	}
	public void decreaseSpeed(int decreaseBy) {
		for(int i=decreaseBy; i>0; i--) {
			speed--;
			
		System.out.print(speed + " | ");
		}System.out.println();
	}
	public void stop() {
		speed = 0; //direct way
		this.speed = 0; //using this keyword
		setSpeed(0); //
		this.setSpeed(0);
		
		
	}
	public String getModel() {
		return model;
	}
	
//	public void setModel(String newModel) {
//		model = newModel;
//	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
