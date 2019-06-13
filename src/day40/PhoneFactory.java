package day40;

public class PhoneFactory {
	  public static void main(String[] args) {
		    
		    
		    Phone iphone  = new Phone();
		    iphone.brand = "Apple" ; 
		    iphone.OS = "IOS";
		    iphone.capacity = 64;
		    iphone.ring();
		    iphone.dial(425678936L);
		    
		    iphone.displayBrand();
		    
		    System.out.println( iphone.OS  );
		    
		    Phone samsung  = new Phone ();
		    samsung.brand = "Samsung" ; 
		    samsung.OS = "Android";
		    samsung.capacity= 124;
		    samsung.ring();
		    samsung.dial(425678936L);
		    
		    System.out.println( samsung.capacity  );
		    
		    
		    Phone pixel  = new Phone ();
		    pixel.brand = "Google" ; 
		    pixel.OS = "Google OS";
		    pixel.capacity = 32;
		    pixel.ring();
		    pixel.dial(425678936L);
		    
		    System.out.println( pixel.brand  );
		    
		    
		    /*
		     * Create class Phone
		     * add few instance variable to define   attribute | properties| state of object 
		     * type as String , OS as String , capacity as int 
		     * add few methods 
		     *    ring -->> accept no param return no value , just print ringing
		     *   dial -->> accept one param number as long and print dialing number 
		     * 
		     * OPTIONALLY 
		     *   add a behavior to Phone object  
		     *   displayPhoneInfo method accept no param return no value 
		     *   --> this should print all phone attributes 
		     * 
		     * 
		     * Create another class called PhoneFactory with main method 
		     * create 3 different phone object , iphone, sumsung , pixel 
		     * assign value for all attributes 
		     * and call methods 
		     * 
		     *   
		     * 
		     * */ 
	  }
}