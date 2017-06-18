package HackerRankExercises;

import java.util.regex.Pattern;

public class PatternSyntaxChecker {
	
	public static void main(String[] args) {
		final String[] INSERT_STRING = {"([A-Z])(.+)","[AZ[a-z](a-z)","batcatpat(nat"};
		final int N = 3;
		final String[] EXPECTED_RESULT = {"Valid","Invalid","Invalid"};
		
		String[] returnArray;
		returnArray = patternSyntaxChecker(N,INSERT_STRING);
		
		try {
			if (returnArray.equals(EXPECTED_RESULT)) {
				System.out.println("Match!");
			} else {
				System.out.println("NO Match!");
			}
		} catch(Exception e) {
				System.out.println(e.getMessage());
		}
	}
	public static String[] patternSyntaxChecker(Integer testCases, String[] s) {
		String[] result = new String[testCases];
		testCases -= 1;
		while(testCases >= 0) {
			String pattern = s[testCases];
			try{
				if(Pattern.compile(pattern) != null){
					System.out.println("Valid");
					result[testCases] = "Valid";
				}
				} catch(Exception e) {
					System.out.println("Invalid");
					result[testCases] = "Invalid";
				}
			testCases -= 1;
		}
		return result;
	}
}
