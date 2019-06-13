package day39;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class TextFileToList {
	
		public static void main(String[] args) {

		    List<String> lineLst = getTextFileAsList("hero.txt");
		    System.out.println(lineLst);
		    
		    List<String> lineLst2 = getTextFileAsList("cities.txt");
		    System.out.println(lineLst2);
		    
		    List<String> lineLst3 = getTextFileAsList("C:\\Users\\Owner\\Desktop\\deneme.txt");
		    System.out.println(lineLst3);
		    
		    List<String> lineLst4 = getTextFileAsList("randomFileNames.txt");
		    System.out.println(lineLst4);
		    
		    System.out.println(lineLst4.size());
		    
		    String s = "erat_quisque_erat.xls";
		    String fileExtension = s.substring(s.indexOf(".")+1);
		    System.out.println(fileExtension);
		    
		    int countxLs = 0;
		    for(String each : lineLst4) {
		    	if(each.contains(".xls")) {
		    	countxLs++;
		    	}
		    }
		    System.out.println(countxLs);
		    
		    int countpdf = 0;
		    for (String each2 : lineLst4) {
				if (each2.substring(each2.indexOf(".")).equals(".pdf")) {
					countpdf++;
				}
			}
		    System.out.println(countpdf);
		    
//		    String longest = lineLst4.get(0);
//		    for(String eachS :lineLst4 ) {
//		    	if(eachS.length()>longest.length()) {
//		    		longest = eachS;
//		    	}
//		    }
//		    System.out.println(longest);
		    
//		    String longestXLS = lineLst4.get(0);
//		    for(String eachXLS :lineLst4 ) {
//		    	if(eachXLS.length()>longestXLS.length() && eachXLS.contains(".xls")) {
//		    		longestXLS = eachXLS;
//		    	}
//		    }
		    
//		    System.out.println(longestXLS);
		    String longestXLS = lineLst4.get(0);
		    for(String eachXLS :lineLst4 ) {
		    	if(eachXLS.length()>longestXLS.length() && eachXLS.substring(eachXLS.indexOf(".")).equals(".xls")) {
		    		longestXLS = eachXLS;
		    	}
		    }
		    System.out.println(longestXLS);
	}
		  /*
		   * DO NOT MODIFY AND JUST USE IT
		   * Method name : getTextFileAsList
		   * @parameter  location of text file as String
		   *   if your file is at root path (right under project folder)
		   *  you may directly path your filename.txt
		   *  if not pass /your/own/folder/name/filename.txt as String to method
		   * 
		   * @return List of String that contain each line as per element

		   */
		  public static List<String> getTextFileAsList(String filePath) {

		    List<String> allLines = null;
		    try {
		      allLines = Files.readAllLines(Paths.get(filePath));
		    } catch (Exception e) {
		      System.out.println("Wrong file path probably");
		    }
		    return allLines;

		  }
		
	}


