package day08_casting_conditionals;
	import java.util.Scanner;
	
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you pass or failed
	Scanner input = new Scanner(System.in);
	
	int passingPercentage = 65;
	System.out.println("Enter your score: ");
	
	int yourScorePersentage = input.nextInt();
	
	if(yourScorePersentage >= passingPercentage) {
		System.out.println("Passed! Congrats!");
	}else {
		System.out.println("Failed");
		
	}
		System.out.println("Java is fun!");
	}

}
