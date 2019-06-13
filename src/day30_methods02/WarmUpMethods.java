package day30_methods02;
import java.util.*;
public class WarmUpMethods {
	public static void main(String[] args) {
		print5Stars();
		introduce();
		
	}

	public static void print5Stars() {
		int i=1;
		do{
		System.out.println("* * * * *");
		i++;
		}while(i<100);
	}
		/*
		 * method name : introduce()
		 * params/args : nothing
		 * return type : void
		 * it will ask for a name and say Name and say Nice to meet you
		 */

		
		public static void introduce() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = scan.next();
			System.out.println("Welcome, " + name);
			System.out.println("May I assist you?");
			String answer = scan.next();
			if(answer.contains("yes")) {
				System.out.println("Sure!Please tell me how :)");
				String answerHow = scan.next();
				if(answerHow.contains("translate")) {
					System.out.println("Unfortunately I cant translate it now but promise to do later :)");
				
				System.out.println("Anything else?");
				String anyelse = scan.next();
			}
				}else {
				System.out.println("No problem! See you next time!");
			}
			
		}
		
	}


