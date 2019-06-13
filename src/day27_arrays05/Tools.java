package day27_arrays05;

public class Tools {
	public static void main(String[] args) {
				/*
	 * Java --> programming language
		Selenium --> Test Automation
		TestNG --> Unit Tests
		JUnit --> Unit Tests
		Cucumber --> BDD Style testing
		Git --> Version control
		Maven --> Building and execution for project
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
				 */
				
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
	
	for( String i : tools) {
		switch(i.toLowerCase()) {
		case "java" :
			System.out.println("Java --> programming language");
			break;
		case "selenium":
			System.out.println(("Selenium --> Test Automation"));
			break;
		case "testng" :
		case "junit" :
			System.out.println(i + " testing tools");
			break;
		case "cucumber" :
			System.out.println("BDD Style testing");
			break;
		case "git":
			System.out.println("Version control");
			break;
		case "maven":
			System.out.println("Building and execution for project");
			break;
			default:
				System.out.println("Unknown tool");
			break;
		}
		
		
	}
}

}