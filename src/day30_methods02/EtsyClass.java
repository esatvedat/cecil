package day30_methods02;

import java.util.Scanner;

public class EtsyClass {
	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
		//"wooden spoon" (14,720 Results)
		
	}

	private static void printResults() {
		System.out.println("\"wooden spoon\" (14,720 Results)");
		
	}

	private static void searchForWoodenSpoon() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Searching for ");
		String item = scan.nextLine();
		System.out.println("Search for: " + item);
		
	}

	private static void navigateToEtsy() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the url: ");
		String url = scan.next();
		System.out.println(url);
	}
	
	/*navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
	}
	
	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}

	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden spoon' into search field");
		System.out.println("Click on 'Search' button");
	}
	
	public static void printResults() {
		System.out.println("“wooden spoon” (14,720 Results)");
	}

}*/
}

