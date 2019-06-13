package day54;

public class Computer extends Electronic{
	
	//It is not Override just a new method
	public void turnOn() {
		System.out.println("computer");
	}
	
	@Override
	//overriding method do in sub class can be optionally final
	//to block sub class of computer overriding turnOff
	public final void turnOff() {
		System.out.println("electronic off");
	}

}

class Electronic{
	
	private void turnOn() {
		System.out.println("electronic");
	}
	
	public void turnOff() {
		System.out.println("electronic off");
	}
}
