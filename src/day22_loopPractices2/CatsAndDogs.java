package day22_loopPractices2;

public class CatsAndDogs {
	public static void main(String[] args) {
		String str = "mycatyourcat ";
		//count how many cats
		int count = 0;
		for(int i=0; i<=str.length()-3; i++) {
			String strCat = str.substring(i, i+3);
			System.out.println(strCat);
				if(strCat.equals("cat")) {
				count++;
			}System.out.println(count);
		}
				
	}

}
