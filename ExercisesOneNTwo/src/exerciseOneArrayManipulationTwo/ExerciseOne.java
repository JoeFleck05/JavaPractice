package exerciseOneArrayManipulationTwo;

import java.util.Arrays;

public class ExerciseOne {
	
	public int[] intArrayDesc(int[] nArray, int topN) {
		int[] newOrder = null;
		Arrays.sort(nArray);
		newOrder = intArrayReOrder(nArray,topN);
		return newOrder;		
	}

	private int[] intArrayReOrder(int[] n, int topN){
		int[] newOrder = new int[topN];
		int a = 0;
		
		for(int i = n.length - 1 ; i >= 0 ; --i) {
			newOrder[a] = n[i];
			if(a == 2){ break;	}
			a += 1;
		}
		return newOrder;
	}
}