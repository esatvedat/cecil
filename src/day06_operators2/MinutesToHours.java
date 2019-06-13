package day06_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
	
		int hours, minutes, remainingMinutes;
		
		minutes=125;
		
		hours = minutes / 60;
		remainingMinutes = minutes % 60;
		
		System.out.println(hours + " hours and " + remainingMinutes + " minutes");
		
		
	}
		
	
}
