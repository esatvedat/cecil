package day22_loopPractices2;

public class SubstringPractice {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2));  //ja
		/*print each character in seperate line using
		 * substring and no loop
		 */
		System.out.println("#############");
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		//remember how to use \n or \r
		System.out.println("##############");
		
		int i = 0;
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
		System.out.println("############");
		for(i=0; i<=3; i++) {
			System.out.println(word.substring(i, i+1));
		}
		
		System.out.println("############");
		
		 i=0;
		do {
			System.out.println(word.substring(i, i+1));
			i++;
		}while(i<=3);
	
		System.out.println("######## REVERSE ########");
		//a  v   a  j
		String words = "java";
		for(int n=3; n<=0; n--) {
			String letter = words.substring(n, n+1);   //check reverse
		System.out.println(letter);
	}
		System.out.println("###########");
		//word = "java";
		/*int n = 0;
		do {
			System.out.println(word.substring(n, n+1));
			
		}while(n>=0 && n<=3);
	*/
		int start = 1;
		int end = 10;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));
		System.out.println(word2.substring(2, 3));//i
		System.out.println(word2.substring(6, 7)); //s
		
		System.out.println(word2.substring(6));
		
		String word3 = "apple";
		System.out.println(word3.substring(word3.length()-1));
	
	}
	

}
