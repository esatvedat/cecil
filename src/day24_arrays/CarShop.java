package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		 // BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
        // 1. Step: Create an array of strings, and store these cars inside that array.
        String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
        // 2. Step: Print car names that starts with M
        for (String c : cars) {
            if (!c.startsWith("M")) {
                continue;
            }
            System.out.println(c);
        }
        System.out.println("******************");
        // 3. Step: Print all cars that have letter "r" somewhere in the name.
        // Please make your search case insensitive
        for (String make : cars) {
            if (make.toLowerCase().contains("r")) {
                System.out.println(make);
            }
        }
        //Step 4: Print car names that ends with a
        System.out.println();
        for (String a : cars) {
            if (!a.endsWith("a")) {
                continue;
            }
            System.out.println(a);
        
        }
        //Step 5: Print all cars that have at least 6 letters
        System.out.println();
        for (String st : cars) {
            if (!(st.length()>=6)) {
                continue;
            }
            System.out.println(st);
            System.out.println();
         for(int i = 0; i< cars.length; i++) {
        	 if(cars[i].length()>=6) {
        		 System.out.println(cars[i]);
        	 }
         }
         //Before:  BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
         //After:  Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, BMW
         //Step 6: Swap first and last value in the array
         
        System.out.println();
     	
        String temp = cars[0];
        cars[0]=cars[cars.length-1];
        cars[cars.length-1]=temp;
        System.out.println(Arrays.deepToString(cars));
        
         }
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));

	}
}
