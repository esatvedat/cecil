package day24_arrays;

import java.util.Arrays;

public class SomeOfTheNumbers {
	public static void main(String[] args) {
		//create an array of integers with length 3
		
		int[] numbers = new int[3];
		//first value in array
		numbers[0] = 5;
		//second value
		numbers[1] = 10;
		//3rd value in array
		numbers[2] = 20;
		//[I@59f95c5d this is a has code
		System.out.println(numbers);
		//print actual values
		//toString() from arrays class can help as to print an array as a string
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//please use for loop, in order to loop through the array
		//and calculate sum of all elements
		//numbers.length --> returns number of elements in the array
		//numbers.length = 3;
		for(int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
		System.out.println("Sum: " + sum);
		//find largest value in the array
		
		int max = Integer.MIN_VALUE;
		System.out.println(max); //-2147483648 it s minimum value for ints
		for(i=0; i<numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				
			}
		}System.out.println("Max value: " + max);
		//TASK
		//PLEASE FIND MIN VALUE IN THE ARRAY
		//int min = 0;
		int min = Integer.MAX_VALUE;
		for(i=0; i<numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
		}
	}System.out.println("Min value: "+min);
	
		}
}
}