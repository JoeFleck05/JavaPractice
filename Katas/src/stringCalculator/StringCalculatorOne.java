package stringCalculator;

public class StringCalculatorOne {
	
//	1. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty 
//	string it will return 0) for example “” or “1” or “1,2
//	2. Start with the simplest test case of an empty string and move to 1 and two numbers
	
	public int sumItUp(String[] n) {
		int returnSum = 0;
		int tempInt = 0;
		for(String nn : n) {
			tempInt = Integer.parseInt(nn);
			returnSum = returnSum + tempInt;
		}		
		return returnSum;
	}

}
