package Day31_Methods_void;

public class googleSearch {
	public static void main(String[] args) {
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
	}
	public static void googleSearchResults(String str) {
		String[] strArr = str.split(" ");
		
		System.out.println("Result count: "+ strArr[1].replace(",", ""));
		System.out.println("Time in seconds:"+strArr[3].substring(1, 5));
	}

}
