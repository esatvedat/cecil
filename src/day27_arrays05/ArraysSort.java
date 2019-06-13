package day27_arrays05;

import java.util.*;

public class ArraysSort {
	public static void main(String[] args) {
		int[] nums = {43, 12, 4, 1, 3};
		//toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		//toString method exits in each and every class. It is normally used to describe values i formatted string
		
		//sort method. sorts array in ascending order
		
	   Arrays.sort(nums);
	   System.out.println(Arrays.toString(nums));
	   
	   String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
	   System.out.println(Arrays.toString(languages));
	   Arrays.sort(languages);
	   System.out.println(Arrays.toString(languages));
	   /*When sorting string values order will be this way:
	    * numbers > UPPERCASE > lowercase
	    * for the characters always check for ASCII value / Unicode value
	    */
	   
	   int nums2[] = {345, 665, 3333, 11, 3, 66};
	   //find lowest and largest values from nums2 array
	   
	   Arrays.sort(nums2);
//	   System.out.println(Arrays.toString(nums2));
//	   System.out.print(nums2[0] +" " + nums2[nums.length]);
	   int lowest = nums2[0];
	   int largest = nums2[nums2.length-1];
	   System.out.println("Lowest is : "+lowest + "\nLargest is: "+largest);
	   
	  
	   
	   

		
		
	}

}
