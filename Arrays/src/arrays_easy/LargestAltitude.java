package arrays_easy;

import java.util.Arrays;

public class LargestAltitude {
	static int max(int[] altitudes) {
		int maxNum = 0;
		
		for(int i = 0  ; i<altitudes.length ; i++) {
			if(altitudes[i] > maxNum) {
				maxNum = altitudes[i];
			}
		}
		return maxNum;
	}
	
	static int largestAltitude(int[] gain) {
		int result = 0 ;
		int flag = 0;
		int[] altitudes = new int[gain.length + 1];
		altitudes[0] = 0;
		for (int i =0 ; i < gain.length ; i++ ) {
			flag = flag + gain[i] ;
			
			altitudes[i+1] = flag;
			result =Math.max(altitudes[i+1], result); // using math class 
			
		}
		System.out.println(Arrays.toString(altitudes));
		
		result = max(altitudes) ;
		
		
		return result ;
		
	}

	public static void main(String[] args) {
		
		int[] gain = {-5,1,5,0,-7};
		
		int largestAlt = largestAltitude(gain) ; 
		
		System.out.println(largestAlt);

	}

}
