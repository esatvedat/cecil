package day47;
//static import Arrays.sort method
import static java.util.Arrays.sort;
//this will import showCurrentCount so we can use it as our own
//import static day47.Bike.showCurrentCount;

//this will import every visible static members
// so we can use them as our own here
import static java.util.Arrays.sort;
import static day47.Bike.*;

public class StaticImportArraysClass {
	public static void main(String[] args) {
		int[] nums = {1,4,6,8,9,0,12};
		
	sort(nums);
	for(int i=0; i<nums.length; i++) {
		System.out.println(nums[i]);
	}
	showCurrentCount();
	
	}

}
