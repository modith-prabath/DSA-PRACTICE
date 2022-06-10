package arrays_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
	
	static int[] createTargetArray(int[] nums , int[]index) {
		List<Integer> result = new ArrayList<Integer>() ;
		for(int i= 0 ; i<nums.length ; i++) {
			result.add(index[i], nums[i]);
		}
		
        int[] primitive = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
		return primitive ; 
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4} ; 
		int[] index = {0,1,2,2,1} ;
		
		int[] result = createTargetArray(nums , index);
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
