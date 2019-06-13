package day58_PolymorphismIntro;

public class Cat extends Animal implements IndoorPet {
	public String legsCount= "Cat leg";
	public void makeNoise() {
		System.out.println("MIA MIAO");
	}

}
