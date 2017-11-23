package stringCalculaterFour;

public class StringCalculater {
	
	public int add(String valueString) {
		int rtnValue = 0;
		rtnValue = returnNewArr(valueString);
		return rtnValue;
	}
	
	public int returnNewArr(String stringValue) {
		String[] tempArr = null;
		int rtnInt = 0;
		String startDelimiter = "//";
		String endDelimiter = "\n";
		
		if(stringValue.contains(startDelimiter)) {
			int lengthStartDelimiter = startDelimiter.length();
			char delimiterChar = stringValue.charAt(lengthStartDelimiter);
			String newString = stringValue.replace(startDelimiter + Character.toString(delimiterChar) + endDelimiter, "");
			tempArr = newString.split(Character.toString(delimiterChar));
		} else {
			tempArr = stringValue.split(",|\n");
		}
		
		for(String s : tempArr) {
			rtnInt += Integer.parseInt(s);
		}
		
		return rtnInt;
	}

}
