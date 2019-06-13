package day28_multid_arrays;
import java.io.IOException;
import java.nio.*; //new input output
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {
	private static final CharSequence VA = null;

	public static void main(String[] args) throws IOException {
		//read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]); //we r just saying what kind of data would be array. thats why 0

		System.out.println("Data size: " + data.length);
		
		//print first row
		System.out.println(data[0]);
		//print second row
		System.out.println(data[1]);
		//print last restaurant
		System.out.println(data[data.length-1]);
		
		System.out.println(Arrays.toString(data)); // it s useless because too long
		
		//print each Restaurant information in seperate lines
		int counter = 0;
		for(String restaurant : data) {
			System.out.println("#" + counter + "=>" + restaurant);
			counter++;
		}
		
		//print all restaurant information in state of VA. also count it
		//and print the number
		
		int count = 0;
		for(String strVA : data) {
			if(strVA.contains(",VA,")) {
				System.out.println("#"+(count+1)+"#\t" + strVA);
			count++;
			}	
		}System.out.println("Total restaurants in VA: " + count);
		
		//Find all restaurant information in state of VA. Print the restaurant names along with cityName
		//Subway - Herndon
	
		int count1 = 0;
		for(String res : data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println("#" + (count1+1) + "#\t" + resArr[2]+" - "+resArr[1]);
				count1++;
			}
		}
	}
}
