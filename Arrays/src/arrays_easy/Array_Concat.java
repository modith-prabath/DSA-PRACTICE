package arrays_easy;

import java.util.Arrays;

public class Array_Concat {
	static int[] getConcat(int[] nums) {
		int l = nums.length;
		int[] ans = new int[2*l];
		for (int i = 0 ; i < ans.length ; i++) {
			if (i< l) {
				ans[i] = nums[i];
			}
			else {
				ans[i] = nums[i-l];
			}
		}
		return ans ; 
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int[] ans = getConcat(nums);
		System.out.println(Arrays.toString(ans));
	}
}
