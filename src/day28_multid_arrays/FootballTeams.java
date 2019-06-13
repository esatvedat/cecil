package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		String[][] teams = new String[2][6]; //2 teams 6 people on each one 
	
		//declare muldiD array with 2 rows and 6 columns
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		System.out.println("Habib : " + teams[0][3]);
		System.out.println("Dmitriy : " + teams[1][5]);
		
		//print how many rows/teams/arrays
		System.out.println("Number of rows: " + teams.length); 
		System.out.println("Number of people in the first team : " + teams[0].length);
		System.out.println("Number of people in the second team : " + teams[1].length);
		System.out.println(Arrays.deepToString(teams));
		
		
		int[][] cities = new int[3][4];

		cities[0][0] = 100;
		cities[0][1] = 500;
		cities[0][2] = 1234;	
		cities[0][3] = 5434;
		
		cities[1][0] = 256;
		cities[1][1] = 3554;
		cities[1][2] = 4352;
		cities[1][3] = 22341;
		
		cities[2][0] = 324;
		cities[2][1] = 4234;
		cities[2][2] = 324;
		cities[2][3] = 32445;
		
		System.out.println (Arrays.deepToString(cities));
		
		int[][] scores = {{3,5,10}, {6,4,2,10}};
		
		System.out.println("Days played/Number of arrays:" + scores.length);
		System.out.println("Number of values in 1: " + scores[0].length);
		System.out.println("Number of values in 2: " + scores[1].length);
		
		int[][] values = new int[4][]; //first [] couldnt be empty but second one could be
		
		values[0] = new int[] {34, 23, 5};
		values[1] = new int[] {34,45, 6, 5, 34, 56, 23, 5};
		
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
	
		values[3] = new int[] {5, 12, 45, 77, 34};
		
		System.out.println(Arrays.deepToString(values));
	}
	

}
