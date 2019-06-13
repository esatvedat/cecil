package day23_LoopsAndArrays;

public class CheckNumber {
	public static void main(String[] args) {
		for(int i=1; i<=100; i+=2) {
			
			System.out.println("Odd number " +i);
			
			if(i%2 != 0) 
			continue;
			
		}
	System.out.println();
	
	for(int number=1; number <=20; number++) {

		if(number >=5 && number <=10)
			continue;
		
		System.out.println("Numbers " + number);
		
	}
	}
		
	}

