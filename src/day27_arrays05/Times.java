package day27_arrays05;
import java.util.*;
public class Times {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//declare 2 int arrays time1 and time2
		// both of them have 2 items/values that represent hour and minute
		
		//hours : 1 - 24
		//minutes : 0 - 59
		System.out.println("Enter time1");
		int[] time1 = {scan.nextInt(), scan.nextInt()};
		System.out.println("Enter time2");
		int[] time2 = {scan.nextInt(), scan.nextInt()};
		
//		if(time1[0] < 0 || time1[0] > 23) {
//		System.out.println("Time1 is invalid hour");	
//		return;
//		}if(time1[1] < 0 || time1[1] > 59) {
//			System.out.println("Time1 is invalid hour");	
//			return;
//		}
		
		if((time1[0] >0 && time1[0]<=12) && (time2[0]>0 && time2[0]<=12) 
				&& (time1[1]>=0 && time1[1]<=60) && (time2[1]>=0 && time2[1]<=60)){
			
			if(time1[0]>time2[0]) {
				System.out.println("time2 is earlier");
			
			}else if(time1[0] == time2[0] && time1[1] == time2[1]) {
				System.out.println("equal times");
			
			}else if(time2[0] > time1[0]) {
				System.out.println("time1 is earlier");
			
			}else if(time1[0] == time2[0] && time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}
		}else {
			System.out.println("Invalid time");
		}
	
	}
  
}	
	