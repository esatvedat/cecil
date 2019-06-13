package day21_loopsPractices;

public class UniqueCharacters {
	public static void main(String[] args) {
		String word = "javva";
		
		String unique = "";
		
		char ch = word.charAt(0);
		
		System.out.println(unique.contains(""+ch)); //or indexOf we could use 
		if(!unique.contains(""+ch)) {
			unique += ch;   //unique = unique + ch;
				
		}System.out.println("Unique: "+unique);
		
		if(unique.indexOf(ch) == -1) {
			unique +=ch;
			System.out.println(unique);
			
		}
	
	String word2 = "bananas";
	String unique2 = "";
	int i = 3;
	
	char ch2 = word2.charAt(i);
	System.out.println("Ch2:" + ch2);
	
	
	
	}
	

}
