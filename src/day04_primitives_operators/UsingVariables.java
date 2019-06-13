package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare int variables num1, num2, num3
		int num1, num2, num3;
		
		//assign 100 to num1
		num1=100;
		
		//assign value of num1 to num2
		num2=num1;
		
		//print num1 and num2 in seperate lines
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("**********");
		
		//print num1 and num2 in same line
		System.out.print(num1);
		System.out.print(" ");
		System.out.println( num2);
		
		System.out.println("**********");
		
		//assign 200 to value of num2;
		//assign num2 to num1;
		//assign num1 to num3;
		
		num2=200;
		num1=num2;
		num3=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("**********");
		//num2=200
		//num3=num1
		//num1=num2
		
		num2=200;
		num3=num1;
		num1=num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//check num3 what we declare before?
		
		
		System.out.println("**********");
		
		//declare apples and assign 25
		int apples=25;
		
		//declare kiwis and assign value of apples to it
		int kiwis=apples;
		
		
		//declare mangoes and 55
		int mangoes=55;
			
		//assign mangoes to kiwis
		kiwis=mangoes;
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
	}

}
