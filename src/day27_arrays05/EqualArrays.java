package day27_arrays05;

import java.util.Arrays;

public class EqualArrays {
	public static void main(String[] args) {
		int[] arr1 = {3, 5, 6};
		int[] arr2 = {3, 6, 5};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatched values present");
		}
		
		String[] strArr1 = {"one", "two", "three"};
		String[] strArr2 = {"One", "Two", "Three"};
		
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println(match);
		
		
		
		
		
	}

}
