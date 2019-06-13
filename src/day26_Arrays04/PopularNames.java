package day26_Arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {
		String[] names = new String[] {
				"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		System.out.println("Total names " + names.length);
		//Print all names in single line
		System.out.println(Arrays.toString(names));
		
		//Print in column format
		//2 names in each line
		
		for(int i=0; i<names.length; i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
		System.out.println("\nMALE NAMES:");
		//print male names in single line separated by comma
		for(int j=0; j<names.length-2; j+=2) {
				
			System.out.print(names[j]+", ");
		}
		
		System.out.println("\nFEMALE NAMES:");
		
		//print female names in single line separated by comma
		for(int k=1; k<names.length; k+=2) {
			if(k == names.length -1) {
				System.out.print(names[k]);	
			}else {
				System.out.print(names[k]+", ");
			}
		}
			System.out.println("\nRANDOM NAME: ");
			//print random names from this array
			//use Random class
			Random random = new Random();
			int r = random.nextInt(names.length);
			System.out.println("Random name: " + names[r]);
			
			//PRINT all names that are up to 4 characters, in uppercase, in same line
			int count = 0;
			for(int s = 0; s<names.length; s++) {
				if(names[s].length() <= 4) {
					count++;
					
				}
			}System.out.println(count);
			
//			int count2 = 0;
//			for(String name : names) {
//				if(name.length() <=4) {
//					System.out.print(name.toUpperCase() + ", ");
//					count2++;
//				}
//			}System.out.println(count2);
			System.out.println();
			
			String namesUpto4 = "";
			String names5to6 = "";
			String names7orMore = "";
			
			for(int n=0; n<names.length; n++) {
				if(names[n].length() <= 4) {
					namesUpto4 += names[n] +", ";
				}else if(names[n].length() >=5 && names[n].length() <=6){
					names5to6 += names[n]+", ";
				}else if(names[n].length() >= 7) {  //u can use else too
					names7orMore += names[n]+", ";
				}
			}System.out.println("Names up to 4: " + namesUpto4.substring(0, namesUpto4.length()-2));
			System.out.println("Names between 5 and 6: " + names5to6.substring(0, names5to6.length()-2));
			System.out.println("Names 7 or more: " + names7orMore.substring(0, names7orMore.length()-2));
			
			
//			for(String name : names) {
//				if(name.length() <= 4) {
//					namesUpto4 += name + ", ";
//				}else if(name.length() == 5 || name.length() == 6) {
//					names5to6 += name + ", ";
//				}else {
//					names7orMore += name + ", ";
//				}
//			}
//			System.out.println("namesUpto4: "+ namesUpto4.substring(0, namesUpto4.length()-2));
//			System.out.println("names5to6: "+ names5to6);
//			System.out.println("names7orMore: "+ names7orMore);
			
			System.out.println("####### SWITCH NAMES #######");
			//switch names
			System.out.println(Arrays.deepToString(names));
			String temp = "";
			for(int i = 0; i< names.length; i+=2) {
				temp = names[i];
				names[i] = names[i+1]+", ";
				names[i+1] = temp+", ";
			System.out.println(names[i]  + names[i+1]);
			}
			System.out.println(Arrays.deepToString(names));
		}
	}

	


