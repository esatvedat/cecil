package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		//print count of products
		System.out.println("Product count: " + products.length);
		//check if products, prices and itemsId have same count
		if(products.length == prices.length && prices.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
			return;
		}
		System.out.println();
		//loop through products and print each one in separate line
	int i = 1;	
		for(String prod : products) {
			System.out.println("Product "+ (i++) + " is " + prod);
		}
		System.out.println();
		//prices --> for loop
		for(int j = 0; j<prices.length; j++) {
			System.out.println("Price of product "+(j+1)+" is "+prices[j]);
		}
		System.out.println();
		//print last item id
		System.out.println(itemsId[itemsId.length-1]);
		System.out.println();
		
		//itemsId --> print this in reserve order using a loop
		
		for(int k = itemsId.length-1; k>=0; k--) {
			System.out.println("Items ids in reverse: " + itemsId[k]);
			
		}System.out.println();
		//print a report with a total price
		//Item 1: 12345 - Timberland Shoes - $120.0
		//print total price
		System.out.println("###### YOUR SHOPPING RECEIPT ######");
		double totalPrice = 0;
		for(int r = 0; r<prices.length; r++) {
			System.out.println("Item " + (r+1) +": "+itemsId[r] + " - " + products[r] + "- $" + prices[r]);
			totalPrice += prices[r];
		}
		System.out.println("Total price is: $" + totalPrice);
		System.out.println();
		
		//Find the most expensive item in your list and print it as a report
		//Loop and find. Do not use Arrays class
		
		int maxIndex = 0;
		double maxPrice = 0;
		for(int f = 0; f<prices.length; f++) {
			if(prices[f] > maxPrice) {
				maxPrice = prices[f];
				maxIndex = f;
			}
			
		}System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);
		
//		double minPrice = prices[0];
//		int minIndex = 0;
//			for(double m : prices) {
//				minPrice = m < minPrice ? m : minPrice;
//			}System.out.println(minPrice);

		int minIndex = 0;
		double minPrice = prices[0];
		for(int p = 0; p<prices.length; p++) {
			if(prices[p] < minPrice) {
				minPrice = prices[p];
				minIndex = p;
			}
	
		}System.out.println(itemsId[minIndex] + " - " + products[minIndex] + " - $" + minPrice);
}
}