package HackerRankExercises;

public class JavaStringToken {
	
	public String[] javaStringToken(String s) {
		String[] sArr = null;
		int n = 0;
		String delims = "[ '.,?!]+";
		sArr = s.trim().split(delims);
		n = sArr.length - 1;
//		for(int i = 0 ; i <= n ; ++i) {
//			returnString[i] = sArr[i];
//		}
		return sArr;
	}

}
