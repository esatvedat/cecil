package day18_while_dowhile_loops;

public class StairCase {

	public static void main(String[] args) {
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 ******     (Asterix)
		 */
	//1) with a counter
		//String stairs = "*";
		//int num = 1;
		//while(num<=10) {
		//System.out.println(stairs);
		//stairs += "*";
		//num++;
		
	//2)with checking length()
		
		String stairs = "*";

		while(stairs.length()<=10) {
		System.out.println(stairs);
		stairs+="*";
		}
		//homework do reverse too.
		}
		
	}
	
	
	


