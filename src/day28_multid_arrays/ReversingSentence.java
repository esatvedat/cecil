package day28_multid_arrays;

import java.util.Arrays;

public class ReversingSentence {
	public static void main(String[] args) {
		
		String sentence = "You love java";
	
		//reverse the sentence and assign to new String called reversed
		//"you love java"  --> "java love you"
		//print the reversed
		
		String[] arr = sentence.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		String reversed = "";
		for(int i = arr.length-1; i>=0; i--) {
			reversed = arr[i] + " ";
		System.out.print(reversed);
		}
	}

}
