package day34;
import java.util.*;
public class ArrayMethods {
	public static void main(String[] args) {
		/*
		 * create static a method
		 * called getArrayFrom1toX
		 * it takes one parameter and
		 * return array starting from 1 to the number specified
		 * 
		 * getArrayForm1toX(5) --> {1,2,3,4,5}
		 * 
		 */
		
		
		int[][] array = { { 1, 2, 3 }, { 1, 2, 3 } };
		 System.out.println(twoDPrinter(array));
		
		int x=10;
		
		
		int[] resultArr = getArrayForm1toX(x);
		System.out.println(Arrays.toString(resultArr));
		
		//turn this result into String outside
		System.out.println(Arrays.toString(getArrayForm1toX(7)));
	}
	public static int[] getArrayForm1toX(int x) {
		
		int[] arr = new int[x];
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;  //System.out.println(i+1);
		}
				
		return arr;
		
		}
	//Task 2:
	/*
	 * create a method 2 dimensions array called twoDPrinter
	 * accept one 2D int array object as parameter
	 * and print them all out in excel like row and column
	 * 
	 * create a method called twoDArray
	 * accept 2 int as parameters
	 * return 2D array object in below logic :
	 * 
	 * get2DArray(2,3) -->> { {1,2,3}, {1,2,3} };


	 */
	public static void twoDPrinter2(int[][] twoD) {
	    
	    //System.out.println(  Arrays.deepToString(twoD)  );
	    for( int[] eachArr : twoD ) {
	      
	      for ( int eachNum : eachArr) {
	        
	        System.out.print(eachNum + " ");
	      }
	      System.out.println();
	    }
	}

	
	public static String twoDPrinter(int[][] arr) {
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
	}
	return Arrays.deepToString(arr);
	
}
}
