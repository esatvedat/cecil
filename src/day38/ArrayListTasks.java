package day38;
import java.util.*;
public class ArrayListTasks {
	public static void main(String[] args) {
	
			    /*
			     * TASK 1 : 
			     * Create an ArrayList of integer from 1-100
			     * 
			     * get the sum of the each items 
			     * get the average
			     * 
			     * Create another list that contain items from 100- 1 
			     * get the count of numbers divisible by 3 and 5 
			     * 
			     * OPTIONAL 
			     * Combine above 2 lists -- add everything from 2nd list to first one
			     * 
			     * Update every odd items to 0 ; 
			     * 
			     * */
			    ArrayList<Integer> lst1 = new ArrayList<>();
			    for(int i=1; i<=5; i++) {
			      lst1.add(i);
			    }
			    System.out.println(  lst1  );    
			    
			    ArrayList<Integer> lst2 = new ArrayList<>();
			    for (int i = 6; i > 0; i--) {
			      lst2.add(i);
			    }
			    System.out.println(lst2);
			  
			    //// addAll method of ArrayList class 
			    //this will just add every item in lst2 by the end of lst1 item
			  			    
			    lst1.addAll(lst2) ; 
			    System.out.println( lst1 );
			    
			    //addAll method of ArrayList class, second overloaded version 
			    //this will just add every item in lst2 by the end of lst1 items
			    
			    lst1.addAll(3, lst2);
			    System.out.println(lst1);
			    
			    
			  }
			}
