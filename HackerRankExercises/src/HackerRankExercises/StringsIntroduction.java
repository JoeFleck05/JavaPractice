package HackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;

public class StringsIntroduction {
	
	public static void main(String[] args) {
		String toBeCapped = "i want this sentence capitalized";

		String[] tokens = toBeCapped.split("\\s");
		toBeCapped = "";

		for(int i = 0; i < tokens.length; i++){
		    char capLetter = Character.toUpperCase(tokens[i].charAt(0));
		    toBeCapped +=  " " + capLetter + tokens[i].substring(1);
		}
		toBeCapped = toBeCapped.trim();
	}
	
	public static String stringIntroduction (String A, String B) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(A);
		list.add(B);
		String returnString = null;
		int total = 0;
		
		total = A.length() + B.length();
		
		Collections.sort(list);
		
		String stringAnswer = "";
		
		if(A.compareTo(B) > 0) {
			stringAnswer = "Yes";			
		} else {
			stringAnswer = "No";
		}
		
		System.out.println(total);
		System.out.println(stringAnswer);
		System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
		returnString = total + " " + stringAnswer + " " + capFirstLetter(A) + " " +capFirstLetter(B);
		return returnString;
	}
	
	public static String capFirstLetter(String s) {
		String returnCapString = null;
		
		String[] sArray = s.split("\\s");
		 s = "";
		 
		 for(int i = 0 ; i < sArray.length ; ++i) {
			 char capLetter = Character.toUpperCase(sArray[i].charAt(0));
			 s +=  " " + capLetter + sArray[i].substring(1);
		 }
		
		 returnCapString = s.trim();
		
		return returnCapString;
	}

}
