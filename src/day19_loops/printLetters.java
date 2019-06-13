package day19_loops;

public class printLetters {

	public static void main(String[] args) {
		//String word = "Cybertek";
		//print each character one by one in seperate lines
		/*int index = 0;
		char wordC =(char) (word.length());
		
		while(index < wordC) {
			System.out.print(word.charAt(index)+"   ");
		//index++;	
		}
		*/
			String word = "Amazon";
		//print each character one by one in seperate lines
		int idx = 0;
		
		while(idx < word.length()) {
			System.out.println(word.charAt(idx));
		idx++;	
		
		} 
		System.out.println();
		
		int idx2 = word.length()-1;
		
		while(idx2 >= 0) {
			System.out.println(word.charAt(idx2));
		
		idx2--;
		}
	
	}
	

}
