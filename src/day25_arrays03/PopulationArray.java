package day25_arrays03;

public class PopulationArray {
	public static void main(String[] args) {
		int[] population = new int[] {5000, 10000, 7000, 4455, 8907};
		
		for(int i=0; i<population.length; i++) {
			System.out.println("City "+(i+1) +" population : "+population[i]);
		
//	}
//		System.out.println();
//		int i = 1;
//		for(int pop : population) {
//			System.out.println("City " + i++ + " population : "+ pop);	
//		}
		System.out.println();
		String str = "abc";
		System.out.println("City STR.LENGTH() population : "+population[str.length()]);
		
		System.out.println();
		//String array called cities and assign some cities on it
		
	//					   {5000,    10000,    7000,    4455,    8907};
		String[] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		//Population of Miami is getting from population array
		System.out.println("Population of "+ cities[0] + " is " + population[0]);	
		System.out.println("Population of "+ cities[1] + " is " + population[1]);	
		System.out.println("Population of "+ cities[2] + " is " + population[2]);	
		System.out.println("Population of "+ cities[3] + " is " + population[3]);	
		System.out.println("Population of "+ cities[4] + " is " + population[4]);	
		
		}
	}
		}

