package day20_ForLoop;

public class EvenOrOdd {
	public static void main(String[] args) {
		//using for lop 1-100
		//same line
		//print all odd numbers in same line
		
			for(int i=1; i<=100; i++) {
				if(i %2 ==0) {
			System.out.print(i+" ");
			}
	}	
			System.out.println();
		//print even numbers
			for(int j =1; j<=100; j++) {
				if(j %2 != 0) {
					System.out.print (j+" ");
				}
			}
		
		//sumOfOdds, sumOfEvens - calculate them
			int sumOfOdds = 0;
			int sumOfEvens = 0;
			
			for(int num = 1; num<=100; num++) {
				if(num %2 == 0) {
				  sumOfEvens += num;
				 
				}
				else {
					sumOfOdds += num;
				}
				
			}System.out.println();
			System.out.println("Sum of Evens: " + sumOfEvens);
				System.out.println("Sum of Odds: " + sumOfOdds);
				
		//and print out after the loop
	
	}
}
