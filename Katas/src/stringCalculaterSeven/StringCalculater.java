package stringCalculaterSeven;

public class StringCalculater {

	public int add(String valueItem) {
		int rtnNumber = 0;
		String startDelimiterValue = "//";
		String endDelimiterValue = "\n";
		String[] valueItemArr;
		
		if(valueItem.contains(startDelimiterValue)){
			int index = startDelimiterValue.length();
			char delimiterChar = valueItem.charAt(index);
			String newString = valueItem.replace(startDelimiterValue+""+Character.toString(delimiterChar)+""+endDelimiterValue, "");
			valueItemArr = newString.split(Character.toString(delimiterChar));
		} else {
			valueItemArr = valueItem.split(",|\n");
		}
		
		for(String s : valueItemArr) {
			rtnNumber += Integer.parseInt(s);	
		}
		
		return rtnNumber;
		
	}
}
