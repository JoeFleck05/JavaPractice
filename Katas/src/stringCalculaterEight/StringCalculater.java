package stringCalculaterEight;

public class StringCalculater {
	
	public Object add(String s){
		int rtnNum = 0;
		String startDelimiterValue = "//";
		String endDelimiterValue = "\n";
		String[] sArray = null;
		boolean negativeValuesFound = false;
		int[] negativeValues;
		
		if(s.contains(startDelimiterValue)){
			char delimiterTemp = s.charAt(startDelimiterValue.length());
			String actualDelimiter = Character.toString(delimiterTemp);
			String tempString = s.replace(startDelimiterValue + "" + actualDelimiter +""+ endDelimiterValue, "");
			sArray = tempString.split(actualDelimiter);
		} else {
			sArray = s.split(",|\n");	
		}
			
		negativeValues = new int[sArray.length];
		
		for(int i = 0 ; i < sArray.length ; i++)
		{
			int intValue = Integer.parseInt(sArray[i]); 
			if(intValue < 0) {
				negativeValues[i] = intValue;
				negativeValuesFound = true;
			} else if (intValue < 1000) {
				rtnNum += intValue;	
			}
		}
		
		if(negativeValuesFound) {
			String negatives = "";
			for(int i = 0 ; i < negativeValues.length ; i++){
				if(negativeValues[i] != 0){
					if( i > 0 && !negatives.isEmpty()){
						negatives = negatives + ",";
					}
					negatives = negatives + negativeValues[i];
					System.out.println(negatives);
				}
				
			}
			throw new IllegalArgumentException("The following number ("  + negatives + ") caused the Exception because negative values are not permitted.");
//			rtnNum = "negatives not allowed" + negativeValues;
		}
		
		return rtnNum;
	}
}
