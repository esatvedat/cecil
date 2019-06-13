package day41;

public class ACTester {
	public static void main(String[] args) {
		
		AirContitioner  ac = new AirContitioner ();
		ac.brand = "Samsung";
		ac.currentTemp = 79.7f;
		ac.isOn = true;
		
		ac.displayTheBrand();
		ac.displayAllInfo();
		ac.turnOf();
		ac.turnOn();
		ac.showCurrentTemp();
	}

	
}
