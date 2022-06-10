package arrays_easy;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
	
	static int[] smallerthancurrent(int[] nums) {
		
		int[] out = new int[nums.length];
		for(int i=0 ; i<nums.length ; i++) {
			int count = 0;
			for(int j = 0 ; j < nums.length ; j++) {
				if(nums[j] < nums[i]) {
					count++;
				}
				
			}
			out[i] = count ;
		}
		
		return out;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {8,1,2,2,3};
		
		int[] out = smallerthancurrent(nums);
		
		System.out.println(Arrays.toString(out));
	}

}
