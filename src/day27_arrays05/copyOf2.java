package day27_arrays05;
import java.util.*;
public class copyOf2 {
	public static void main(String[] args) {
		int[] num1 = {34, 56, 23, 1, 55};
		int[] num2 = Arrays.copyOf(num1, num1.length + 2);
		int[] num3 = Arrays.copyOfRange(num1, 1, 4);
		

		System.out.println(Arrays.toString(num2));
		
		int[] brandNew = {34, 23, 54, 23};
		System.out.println("Length before: " + brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length + 5); 
		System.out.println("Length after: " + brandNew.length);
		
		
	}

}
