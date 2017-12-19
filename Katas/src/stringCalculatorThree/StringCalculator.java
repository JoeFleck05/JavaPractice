package stringCalculatorThree;

public class StringCalculator {

	public int add(String value) {
		int rtnNum;
		int tempNum = 0;
		String delimiterString = "//";
		String[] strArr;
		
		if(value.contains(delimiterString)) {
			int lengthDelimiterString = delimiterString.length();
			char delimiter = value.charAt(lengthDelimiterString);
			String newValue = value.replace("//"+ delimiter + "\n", "");
			strArr = newValue.split(Character.toString(delimiter) + "|,");
		} else {
			strArr = value.split(",|\n");
		}
		
		for(String s : strArr) {
			tempNum += Integer.parseInt(s); 
		}
		rtnNum = tempNum;
		return rtnNum;
	}
}