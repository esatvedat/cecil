package day24_arrays;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", 
				"Istanbul", "Baku", "Miami", "Silver Spring", "McLean"};
		System.out.println(cities.length);
		//TASK Print all cities that short with M
	for(int i=0; i<cities.length; i++) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);	
		}
	}
	System.out.println();
	for(String city: cities) {
		if(city.startsWith("M")) {
			System.out.println(city);
		}
	}
	
	String str = "Wooden spoon";
	//this method toCharArray() converts string into array of characters
	char[] chars = str.toCharArray();
	for(char c:chars) {
		System.out.print(c);
		
	}System.out.println();
	
	for(int i = chars.length-1; i>=0; i--) {
		str+=chars[i];
	} System.out.println(str);	
	/*TASK: 
	 *Print characters with help of array of characters, one by one
	 *if characters is equals to 'o', replace with '*';
	 */
	System.out.println();

	for(char c:chars) {
		if(c=='o') {
			System.out.print("*");
		}else {
			System.out.print(c);
		}
		
	}
	
		
		
	}

}
