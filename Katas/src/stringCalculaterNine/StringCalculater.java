package stringCalculaterNine;

public class StringCalculater {
	
	public int add(String valueNum) {
		int returnNumber = 0;
		String startDelimiter = "//";
		String endDelimiter = "\n";
		String[] valueNumArray = null;
		
		if(valueNum.contains(startDelimiter)) {
			char delimiter = valueNum.charAt(startDelimiter.length());
			String tempValueNum = valueNum.replace(startDelimiter + "" + Character.toString(delimiter) + "" + endDelimiter, "");
			valueNumArray = tempValueNum.split(Character.toString(delimiter));
		} else {
			valueNumArray = valueNum.split(",|\n");	
		}
		
		boolean foundNegative = false;
		String negatives = "";
		
		for(int i = 0 ; i < valueNumArray.length ; i++) {
			int tempNums = Integer.parseInt(valueNumArray[i]);
			if(tempNums < 0) {
				if(i > 0 && !negatives.isEmpty()) {
					negatives = negatives + ",";
				}
				negatives = negatives + valueNumArray[i];
				foundNegative = true;
			} else {
				if(tempNums < 1000) {
					returnNumber += tempNums;	
				}				
			}
		}
		
		if(foundNegative) {
			throw new IllegalArgumentException("The following number ("  + negatives + ") caused the Exception because negative values are not permitted.");
		}
		
		return returnNumber;
	}

}
