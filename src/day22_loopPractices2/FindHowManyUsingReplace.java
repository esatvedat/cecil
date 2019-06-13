package day22_loopPractices2;

public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String word = "including webpages, images";
		
		//find how many e characters in the word
		//get the length of word 
		//replace all e with empty
		//get the length of word without e
		//do a minus
		
		int chCounts = word.length();
		word = word.replace("e", "");
		System.out.println(chCounts);
		int chCounts2 = word.length();
		System.out.println(chCounts2);
		
		
		int countE = chCounts-chCounts2;
		System.out.println(countE);
	}

}
