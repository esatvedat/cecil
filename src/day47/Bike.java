package day47;

public class Bike {
	private String brand;
	private int id;
	private int gear, speed;
	private static int countOfBike;
	
	public static void showCurrentCount() {
		System.out.println("Current Count of Object: " + countOfBike);
	}
	public static void resetCount() {
		countOfBike = 0;
		
	}
	public Bike() {
		System.out.println("no arg is being called");
		
	}
	public Bike(String brand, int gear, int speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		++countOfBike;
		this.id += countOfBike;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Bike [brand=" + brand + ", id=" + id + ", gear=" + gear + ", speed=" + speed + "]";
	}
	public void speedUp(int increaseBy) {
		speed += increaseBy;
	}
	public void slowdown(int decreaseBy) {
		speed -= decreaseBy;
	}
		
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
