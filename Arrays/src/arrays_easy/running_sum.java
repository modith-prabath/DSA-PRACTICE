package arrays_easy;

import java.util.Arrays;

public class running_sum {
	
	static int[] runningSum( int[] nums) {
		int[] ans = new int[nums.length] ; 
		int sum = 0;
		for (int i =0 ; i< nums.length ; i++) {
			sum = sum + nums[i];
			ans[i] = sum ;
		}
		
		
		return ans ;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,6};
		int[] ans = runningSum( nums) ; 
		System.out.println(Arrays.toString(ans));
	}

}
