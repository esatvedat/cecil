import java.util.ArrayList;

public class Accumulator{
	public static boolean main(String[] args) {
		String target = "laptop";
		String sentence ="I would like to buy a new laptop, because my laptop";

	 if(sentence.length() <2*target.length()){
		    return false;
		  }else if(!sentence.contains(target)){
		    return false;
		  }
				return true;
			}

	@Override
	public String toString() {
		return "Accumulator []";
	}
	
	}

	  