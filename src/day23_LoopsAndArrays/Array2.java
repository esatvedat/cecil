package day23_LoopsAndArrays;

public class Array2 {
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] names2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
		
		System.out.println(names2[4]);
		System.out.println("Number of items: "+ names2.length);
		
		String[] countries = {};
		
	//	double[] values =
		//ARRAY HAS FIXED SIZE
	//	countries[0] ="USA"; //exception error because our array is empty
//		String name =null;
		
		String[] fruits = new String[] {"apple", "orange"};
		for(String fruit: fruits) {
			System.out.println(fruit);
			
		}
	}

}
