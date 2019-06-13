package day40;

import java.util.ArrayList;
import java.util.List;

public class ComputerFactory {

	public static void main(String[] args) {
			
			Computer iMac = new Computer();
			Computer macPro = new Computer();
			
			System.out.println("------IMAC-----");
			
			iMac.type = "Mac desktop";
			iMac.OS = "MacOS";
			iMac.screenSize = 27.0;
			iMac.color = "silver";
			iMac.isPersonal = true;
			iMac.ram = 128;	
			
			//what can we do when we have a class
			/*
			 * we can create an object out of it
			 * Create a reference variable like Computer iMac
			 * it will become a type
			 * Use it as method parameter
			 * Use it as method return type
			 * Use it as type for ArrayList object
			 * 
			 */
			Computer myComputer = new Computer();
			List<String> lst = new ArrayList<>();
			ArrayList<Computer> comlst = new ArrayList<>();
			comlst.add(iMac);
			comlst.add(new Computer());
			
			String arr = new String("actual String");
			String[] strArr = new String[3];
			
			Computer myComp = new Computer();
			Computer[] comArr = new Computer[3];
			
			
			System.out.println(iMac.type);
			System.out.println(iMac.OS);
			System.out.println(iMac.screenSize);
			System.out.println(iMac.color);
			System.out.println(iMac.isPersonal);
			
			System.out.println("----macPro-----");
			System.out.println(macPro.type);
			System.out.println(macPro.OS);
			System.out.println(macPro.screenSize);
			System.out.println(macPro.color);
			System.out.println(macPro.isPersonal);
	}
	

	}


