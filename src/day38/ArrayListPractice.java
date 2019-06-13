package day38;
import java.util.*;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Chicken");
		myList.add("Basil");
		myList.add("Blueberry ");
		myList.add("Rassberry");
		myList.add("Tomatoes");
		myList.add("Cucumber");
		myList.add("Kale");
		myList.add("olives");
		myList.add("soap");
		System.out.println(myList);
		//List<String> lst2 = new ArrayList<>();
		
		//update an Item
		myList.set(0, "Tomato");
		System.out.println(myList);
		
		//insert an Item
		myList.add("Chicken");
		System.out.println(myList);
		
		//check an item exist in the list
		boolean haveMilkOrNot = myList.contains("Milk");
		System.out.println("Got Milk? "+ haveMilkOrNot);
		
		System.out.println("Got Tomatoes? " + myList.contains("tomatoes"));
		
		//check location of certain items
		int indexOfCabbage = myList.indexOf("cabbage");
		System.out.println("indexOfCabbage : " + indexOfCabbage);
		
		//remove item
		myList.remove(4);
		System.out.println(myList);
		myList.remove("BlueBerry");
		System.out.println(myList);
		
		myList.remove("kiwi");
		System.out.println(myList);
		
		//deleting all from the list
		myList.clear();
		System.out.println(myList);
		
		//checking the list is empty or not
		System.out.println("Checking the list is empty or not: " + myList.isEmpty());
		
		for(int i = 0; i<myList.size(); i++) {
			System.out.println(myList.get(i) + "-");
			
		}System.out.println();
		
		}
		
		
		
	}


