package day20_ForLoop;

public class IndexOf {
	public static void main(String[] args) {
		String word = "amazon";
		char letter = 'o';
		int index = 0;
		//System.out.println(word.indexOf(letter)); 
		
		//using for loop - look for the letter
		//if it is a match assign value to index
		//print value of index
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)==letter) {
				index = i;
				break;
				
			}
		}
		System.out.println("Index: "+ index);
		
		
	
	}

}
