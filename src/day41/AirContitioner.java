package day41;

public class AirContitioner {

	/*
	 	Create a class called AirContitioner 
    	Add instance fields 
        brand as String 
        currentTemp as float  
        isOn as boolean  
	 */
	String fields;
	String brand;
	Float currentTemp;
	boolean isOn;
	/*
	 * Add below behaviors 
	 * displayTheBrand() ;
	   accept no parameter and print out the brand  
	 */
	public void displayTheBrand() {
	System.out.println("the brand is " + brand);
	}
 

	/*
	 *  showCurrentTemp
        accept no paramter and
        simply display current temp on console 
	 */
	
	public void showCurrentTemp() {
	System.out.println("Current Temp is " + currentTemp);
	}
	
	
	
	/*
	 * displayAllInfo 
       accept no parameter and display all AC info 
	 */
	public void displayAllInfo() {
	System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
	}
	
	/*
	  turnOn 
      accept no parameter 
      and set isOn value to true if it's not already true
      */
	
	public void turnOn() {
		if(isOn != true) {
		System.out.println("It is ON");
		}
	}
	
	/*
	 * turnOf 
       accept no parameter 
       and set isOn value to false if it's not already true
	 */
		public void turnOf() {
			if(isOn != true) {
			System.out.println("It is OFF");
			}
		}
		
		/*
		 * OPTIONALLY
		 * Modify below code if AC Off there should NOT be any
		 * action can be performed as below
		 */
		public void increaseTemp(int increaseBy) {
			//currentTemp = currentTemp + increaseBy;
			currentTemp += increaseBy;
			System.out.println("New temp after increase: " + currentTemp);
		}
		public void decreaseTemp(int decreaseBy) {
			//currentTemp = currentTemp - decreaseBy;
			currentTemp -= decreaseBy;
			//an instance method can be called inside
			//another instance method directly
			//just like an instance field
			//can be accessed directly inside any instance method
			showCurrentTemp();
		}
		public void setTemperature(float targetTempurature) {
		    currentTemp = targetTempurature ; 
		    //calling instance method of same class directly
		    //in another instance method
		}
		
		
}

