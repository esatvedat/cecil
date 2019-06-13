package Day31_Methods_void;

import java.util.*;

public class MethodsWithStrings {
	public static void main(String[] args) {
		/*1)
		 * name:countWords
		 * return: void
		 * params/args: String sentence
		 * countWords("Java is fun");
		 * "Words in this sentence [Java, is, fun]"
		 * "Number of words: 3"
		 */
		
		countWords("Java is fun");
	}
	
	public static void countWords(String sentence) {
		int count = 0;
		String[] str = sentence.split(" ");
		
		System.out.println(Arrays.toString(str));
		}
	}
	
	


