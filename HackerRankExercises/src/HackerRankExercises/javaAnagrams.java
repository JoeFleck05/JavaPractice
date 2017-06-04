package HackerRankExercises;

import java.util.Arrays;

public class javaAnagrams {

	public boolean javaAnagrams(String a, String b) {
		
		boolean returnBoolean = false;
		
		if(a.length() >= 1 && b.length() <= 50) {
			char[] A = a.toLowerCase().toCharArray();
			char[] B = b.toLowerCase().toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);	
			returnBoolean = Arrays.equals(A,B);	
		}
		return returnBoolean;
	}
}
