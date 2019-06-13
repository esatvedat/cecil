package day41;

public class TeacherAction {
	public static void main(String[] args) {
		
		Teacher akbar = new Teacher();
		//fields are private so we can not access
//		System.out.println(akbar.name);
//		System.out.println(akber.specialty);
		
		akbar.setName("Akbar");
		akbar.setSpecialty("magic");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
		akbar.setName("MagicMan Spartan");
		akbar.setSpecialty("Release magic horse");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
	
	}

}
