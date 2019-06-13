package day23_LoopsAndArrays;

public class letters5Rows {
	public static void main(String[] args) {
		
	char letters = 'a';
		
//		for(letters = 'a'; letters<='z'; letters++) {
//			System.out.print(letters);
//			}for(int star = 1; star<=2; star++) {
//				System.out.println();
//			System.out.println("***************************");
//		}
		
		for(int i=0; i<5; i++) {
			for(char letter ='a'; letter <='z'; letter++) {
				
				System.out.print(letter);
				System.out.print(" - ");
			}System.out.println("  ");
			System.out.println();
		
			System.out.println("*****************************************************************************");
		}
	}

}
