package day26_Arrays04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		
		String[] myWords = words.split(",");
		for(int i=0; i<myWords.length; i++) {
		System.out.println(myWords[i]);
		}
		System.out.println("Count: " + myWords.length);
		System.out.println(Arrays.deepToString(myWords)); //[java, kava, html, selenium]
		
		for(String myWord : myWords) {
			System.out.println(myWord);
		}
		
		String diceResult = "1 - 20 of 1,461 positions";
		
		String[] result = diceResult.split(" ");
		System.out.println("Search result total: " + result[4]);
		
		String[] result2 = diceResult.split(" of ");
		System.out.println(result2[0].trim());
		System.out.println(result2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
		String[] happy = sentence.split(" happy ");
//		for(int i=0; i<sentence.length(); i++) {
//			System.out.println(happy[i]);
//		}
		for(String h : happy) {
			System.out.println(h);
		}System.out.println("AFTER HAPPY SPLIT");
		String[] ISplit = sentence.split("I");
//		for(int j=0; j<sentence.length(); j++) {
//			System.out.println(ISplit[j]);
//		}
		for(String I : ISplit) {
			System.out.println(I);
		}
		System.out.println("######");
		String[] allWords = sentence.split(" ");
		for(String w : allWords) {
			System.out.println(w);
		}
//		
//		for(int k=0; k<sentence.length(); k++) {
//			System.out.println(allWords[k]);
//		
//		}
		System.out.println();
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch : charsArray) {
			System.out.println(ch);
		}
		
		
	}
}

