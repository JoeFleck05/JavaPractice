package interviewQ1TopNumVersion2;

import java.util.Arrays;

public class TopNinth {
	
	public int[] TopNinth(Integer[] n, int returnNumber) {
		int[] rtnArray = new int[returnNumber + 1];
		int startPoint = n.length - returnNumber - 1;
		if(!Arrays.asList(n).contains(null)) {
			Arrays.sort(n);
			int s = 0;
			for(int i = n.length - 1 ; i >= startPoint ; i--) {
				rtnArray[s] = n[i];	
				s += 1;
			}
		} else {
			rtnArray[0] = 0;
		}
		return rtnArray;
	}
	
	public boolean justNull(Integer[] d){
		boolean response = false;
		for(Integer s : d) {
			if(!Arrays.asList(s).contains(null)){
				System.out.println("Not NULL: " + s);
			}else{
				response = true;
				System.out.println("NULL: " + s);
			}
		}
		return response;
	}

}
