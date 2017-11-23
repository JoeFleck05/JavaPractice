package stringCalculaterFive;

public class StringCalculater {

	public int add(String valueItem){
		int rtnNums = 0;
		String startDelimiter = "//";
		String endDelimiter = "\n";
		String[] valueItemArr;
		
		if(valueItem.contains(startDelimiter)) {
			int lengthstartDelimiter = startDelimiter.length();
			char delimiterChar = valueItem.charAt(lengthstartDelimiter);
			String reviseString = valueItem.replace(startDelimiter +""+ Character.toString(delimiterChar) +""+ endDelimiter, "");
			valueItemArr = reviseString.split(Character.toString(delimiterChar));
		} else {
			valueItemArr = valueItem.split(",|\n");	
		}
		
		for(String s : valueItemArr) {
			rtnNums += Integer.parseInt(s);	
		}
		return rtnNums;
	}
}
