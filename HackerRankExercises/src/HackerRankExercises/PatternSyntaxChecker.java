package HackerRankExercises;

import java.util.regex.Pattern;

public class PatternSyntaxChecker {
	public String patternSyntaxChecker(Integer testCases, String s) {
		String result = "";
		while(testCases>0) {
			String pattern = s;
			try{
				if(Pattern.compile(pattern) != null){
					System.out.println("Valid");
					result = "Valid";
				}
				} catch(Exception e) {
					System.out.println("Invalid");
					result = "Invalid";
				}
			testCases -= 1;
		}
		return result;
	}
}
