package stringCalculaterTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculater {

	public int add(String s) {
		int rtnNum = 0;
		int tempNum = 0;
		String[] sArr = null;
		Pattern regex = Pattern.compile("[//]");
		String regexTwo = "[//]";
		
		String delimiterValue = delimiterString(s);
		if(!delimiterValue.isEmpty()) {
			
			Matcher matcher = regex.matcher(s);
			if (matcher.find()){
				String newStr = s.replace(regexTwo, "");
				System.out.println("YUP!");
			}
			sArr = s.split(delimiterValue+"|\n");	
		} else {
			sArr = s.split(",|\n");
		}
		
		
		for(String sa : sArr) {
			tempNum += Integer.parseInt(sa);
		}
		rtnNum = tempNum;
		return rtnNum;
	}
	
	public String delimiterString(String s) {
		String rtnStr = "";
		String delimiterString = "//";
		int delimiterLength = delimiterString.length();
		if(s.contains(delimiterString)){
			String indexString = s.substring(0, delimiterLength + 1);
			System.out.println(indexString.charAt(delimiterLength));
			rtnStr = Character.toString(indexString.charAt(delimiterLength));
		}
		
		return rtnStr;
	}
}