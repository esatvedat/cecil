package day15_string_manipulation;

public class indexOf2 {
	public static void main(String[] args) {
		//index of with 2 inputs
		
		String list = "html-selenium-angular-jenkins-grid-cucumber";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: "+firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash: " + secondDash);
		
		int thirdDash = list.indexOf("-", 14);
		System.out.println("Third dash: " + thirdDash);
		
		int fourthDash = list.indexOf("-", 22);
		System.out.println("Fourth dash: "+ fourthDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("LastDash: " + lastDash);
		
	}

}
