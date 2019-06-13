package day60;

import java.util.*;

public class SmartTV extends TV{

	  int channelCount = 200 ; 
	  
	  @Override
	  public void play() {
	    System.out.println("Playing smart");
	  }
	  
//	    @Override
//	    public int getChannleCount() {
//	      return channelCount; 
//	    }
	  // this is how compiler see the inherited method 
	  // if no change is made to the method 
	  // you have this method with body that call super class version
	  // That's the reason we got 100 if we did not override the method
	  //  @Override
	  //  public int getChannleCount() {
	  //    return super.getChannleCount();
	  //  }

	  public static void main(String[] args) {

	    //List<String> lst = new ArrayList<>(); 
	    TV tv1 = new SmartTV(); 
	    System.out.println(tv1.channelCount);
	    
	    tv1.play();  //new SmartTV().play(); 
	    
	    System.out.println( tv1.getChannleCount() );
	    
	    System.out.println(  new SmartTV().getChannleCount()  ) ; 
	    tv1.doTVStatic();
	    
	  }

	}
