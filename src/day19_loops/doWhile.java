package day19_loops;

public class doWhile {

	public static void main(String[] args) {
		//print 1 to 10 using do while loop
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		//between 1 to 5 ==>  1+2+3+4+5 = 15
		int sum = 0;
		int j = 1;
		
		do {
			System.out.print(j+"+");
			sum = sum + j;
			j++;
			
			
		}while(j<=5);
		String result = " = " + sum;
		//odev: en son + yi kaldir ciktidan
		System.out.println(result);
		

	}

}
