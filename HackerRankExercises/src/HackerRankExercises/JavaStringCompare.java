package HackerRankExercises;

	//Given a string, find out the lexicographically smallest and largest substring of length .

	//

	//[Note: Lexicographic order is also known as alphabetic order dictionary order. 

	// So "ball" is smaller than "cat", "dog" is smaller than "dorm". 

	// Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" 

	// and "Zoo" is smaller than "ball".]

import java.util.ArrayList;

import java.util.Collections;



public class JavaStringCompare {
	
	public static void main(String[] args) {
		String myString = "welcometojava";
		int myInt = 3;
		javaStringCompare(myInt,myString);
	}
	
	public static ArrayList<String> javaStringCompare(int n, String value) {
		ArrayList<String> tempArrayList = new ArrayList<String>();
		ArrayList<String> returnArrayList = new ArrayList<String>();
		
		if(value.length() <= 1000) {
			int valueLength = value.length();
			int originalN = n;
			if(n == value.length()) {
				tempArrayList.add(value);
			} else {
				for(int i = 0 ; i <= valueLength ; ++i) {
					tempArrayList.add(value.substring(i, n));
					int m = valueLength - i;
					if ( m == originalN ) {
						break;
					} else {
						n += 1;
					}
				}
			}
			Collections.sort(tempArrayList);
		}
		System.out.println(returnArrayList.add(tempArrayList.get(0)));
		System.out.println(returnArrayList.add(tempArrayList.get(tempArrayList.size()-1)));
		return returnArrayList;
	}

}