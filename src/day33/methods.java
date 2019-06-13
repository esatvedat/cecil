package day33;
import java.util.*;
public class methods {
	public static void main(String[] args) {
/*
 * Warmup 1.1

Create a static method
getSum  
accept 1 paramter as int array 
and return the sum of the all the items in array

another method called 
addAll 
accept 1 paramter as String array 
and return the concatenation of all items 

another method called 
getMax 
accept 1 paramter as int array 
and return the max from the all the items in array


Another method called getMax accept 1 parameter as int array
return the
max from the all the items in array
 */
		int[] arr = {1,2,3,4,5};
		System.out.println(getSum(arr));
	
		String[] a = {"java", "phyton", "selenium"};
		System.out.println(addAll(a));
		
		int[] num = {2, 5,7,9};
		System.out.println(getMax(num));
		
		System.out.println(FirstCharOfFirstWordAndLastWord("Hold the Door"));
		
	}
	public static int getSum(int[] arr) {
	int result =0;
	for(int i=0; i<arr.length; i++) {
		result+=arr[i];
	}
	return result;
	
}
	public static String addAll(String[] a) {
		String result = "";
		for(int i=0; i<a.length; i++) {
		result +=a[i]+" ";
		}return result;
	}
	
	public static int getMax(int[] num) {
		int max = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
	}return max;
}
	
	public static String FirstCharOfFirstWordAndLastWord(String sentence) {
		String firstChar = sentence.substring(0,1);
		String[] allWords = sentence.split(" ");
		String lastWord = allWords[allWords.length-1];
		
		String targetWord = firstChar +lastWord.substring(1);
		
		return targetWord;
	}
}
