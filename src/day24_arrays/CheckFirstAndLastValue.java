package day24_arrays;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		//write a program that will print true
		//if first and last number is the same
		//if first and last value in the array of ints
		//is same, print true
		
		int[] numbers = {12, 41, 213, 21, 42, 12};
//		for(int i=1; i<numbers.length; i++) {
//			if(numbers[0]==numbers[numbers.length-1]) {
//			 System.out.println("same");
//			 break;
//			}else if(numbers[i]==numbers[0]) {
//				System.out.println("yes");
//				break;
//}
		boolean equals = numbers[0] == numbers[numbers.length-1];
		if(numbers[0] == numbers[numbers.length-1]) {
		System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
