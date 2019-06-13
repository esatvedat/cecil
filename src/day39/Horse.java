package day39;

public class Horse {
	
		String breed, color;
		int age;
		double height;
	
		//CREATE A CUSTOM CLASS CALLED
				//Horse
				//it should have 4 instance variables
				//any object created out of this class
				//should have 4 attribute as below
				/*
				 * breed as String age as int
				 * color as String
				 * height as double
				 */
	
		public static void main(String[] args) {
			
			//each objects attributes
			//are completely independent from any other objects that created
			//from same class
			Horse h1 = new Horse();
			h1.breed = "Arabian";
			h1.color = "black";
			h1.age = 2;
			h1.height = 2.3;
			
			Horse h2 = new Horse();
			h2.breed = "Mongolian horse";
			h2.color = "black";
			h2.age = 3;
			h2.height = 5.5;
			
			
			System.out.println(h1.color);
			System.out.println(h2.height);
			
			h1.color = "brown"; //reassigned the value
			System.out.println(h2.color);
			System.out.println(h1.color);
			
			//lets do it everything in one shot
			System.out.println(h1); //gives hashcode. h1.toString());
			System.out.println(("Breed is " + h1.breed +", Color is " 
					+ h1.color + ", Age is " + h1.age));
		}

	}
