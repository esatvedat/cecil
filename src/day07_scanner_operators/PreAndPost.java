package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 10;
		int num2 = num++; //it ll make num +1 to it. num++ post increment. before increase the value it ll take 
		//value of num and assign to num2 then add 1.
		
		
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		int n = 20;
		int n2 = ++n; //add first then assign the variable
		
		System.out.println("n: "+n);
		System.out.println("n2: "+n2);
		
		int i=10;
		i++; //add 1
		++i; //add 1
		System.out.println("I value:" + i);
		
		

		int bananas = 6; //6
		int apples = ++bananas; //apples->7 bananas 7
		int pears = bananas++; //pears 7, bananas 8
		
		System.out.println("bananas: "+bananas);
		System.out.println("pears: "+pears);
		System.out.println("apples: " +apples);

		System.out.println();

		int friends = 10;
		System.out.println(friends++); //post increment. first see the value then increase by 1
		System.out.println(friends);
	
	
		int p1 = 10;
		int sum = p1++ + 5;
		System.out.println("sum: " + sum);
		System.out.println("p1: " + p1);
		//p1+5 first then assign to sum
		//then p1 = p1+1
		
		int p2 = 10;
		int sum2 = ++p2 + 5;
		System.out.println(sum2);
		System.out.println(p2);
		
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries); //9
		System.out.println("oldBatteries: " + oldBatteries); //6
		System.out.println("totalBatteries: "+totalBatteries); //14
	}

}

