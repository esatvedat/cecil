package day27_arrays05;

import java.util.Arrays;

public class ArraysBinarySearch {
	public static void main(String[] args) {
		 int nums[] = {4, 6, 7, 10, 55};
		   
		 System.out.println(Arrays.binarySearch(nums, 7)); //2
		 System.out.println(Arrays.binarySearch(nums, 55)); //4
		 System.out.println(Arrays.binarySearch(nums, 5)); //-2
		 System.out.println(Arrays.binarySearch(nums, 1)); //-1
		 System.out.println(Arrays.binarySearch(nums, 8)); //-4
		 
		 int i = Arrays.binarySearch(nums, 10);
		 System.out.println(i);
		 
		 int[] nums2 = {40, 6, 17, 10, 55};
		 System.out.println(Arrays.binarySearch(nums2, 40)); //-5 because it must be sorted.
		 													//-5 is not garantied. It changes from prog to prog. Some algoritm behind it
		 Arrays.sort(nums2);
		 System.out.println(Arrays.toString(nums2));
		 
		// Arrays.sort(a, fromIndex, toIndex, c); comparator
		 
	}

}
