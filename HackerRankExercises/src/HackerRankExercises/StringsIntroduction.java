package HackerRankExercises;

import java.util.ArrayList;
import java.util.Collections;

public class StringsIntroduction {
	
	public static String stringIntroduction (String a, String b) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		String returnString = null;
		int total = 0;
		
		total = a.length() + b.length();
		
		Collections.sort(list);
		
		String stringFirst = list.get(0);
		String stringLast = list.get(list.size() - 1);
		String stringAnswer = "";
		String stringNo = "";
		
		if(stringFirst.compareTo(stringLast) > 0) {
			stringAnswer = "Yes";			
		} else {
			stringAnswer = "No";
		}
		
		System.out.println(total);
		System.out.println(stringAnswer);
		System.out.println(a.substring(0));
		return returnString;
	}

}
