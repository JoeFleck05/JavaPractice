package stringCalculaterSix;

public class StringCalculaterSeven {
	
	private static String START_DELIMITER = "//";
	private static String END_DELIMITER = "\n";
	private static String[] STR_ARR = null;
	
	public int add(String s) {
		int rtnNums = 0;
		
		if(s.contains(START_DELIMITER)) {
			STR_ARR = revisedArray(s);
		} else {
			STR_ARR = s.split(",|\n");
		}
		for(String i : STR_ARR) {
			rtnNums += Integer.parseInt(i);
		}
		return rtnNums;
	}
	
	private String[] revisedArray(String str) {
		String[] rtnStringArray = null;
		int startDelimiterLength = START_DELIMITER.length();
		char delimiterChar = str.charAt(startDelimiterLength);
		String revisedString = str.replace(START_DELIMITER +""+ Character.toString(delimiterChar) +""+ END_DELIMITER , "");
		rtnStringArray = revisedString.split(Character.toString(delimiterChar));
		return rtnStringArray;
	}

}
