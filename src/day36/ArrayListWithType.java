package day36;

import java.util.ArrayList;

public class ArrayListWithType {
	public static void main(String[] args) {
		
		//NO PRIMITIVES TYPE ALLOWED AS TYPE
		//ArrayList<int> numList ; THIS IS BAD
		
		ArrayList<Integer> numList = new ArrayList<>();
		//numList.add("ABC"); // doesnt compile because our ArrayLst integer
		
		Integer i = 100; // autoboxing to Integer Object
		numList.add(i);
		
		//ADDING ITEM
		//We call add method from ArrayList class
		numList.add(200);
		numList.add(300);
		
		//we can directly printing
		System.out.println(numList);
		
		//GETTING SINGLE ITEM FROM ARRAYLIST
		//we call get(index) of ArrayList
		Integer i1 =  numList.get(0);
		int i2 =  numList.get(1); //auto unboxing happen here
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
