package arrays_easy;

public class EvenNumberOfDigits {
	
	static boolean isEven(int value) {
		int flag = 0 ;
		int num = value ; 
		while(value != 0 ) {
			flag+=1;
			num = num %10 ; 
			value = value /10 ; 
		}
		if(flag%2 == 0 ) {
			return true ;
		}
		return false ;
		
	}
	
	static int findNumbers(int[] nums) {
		int total = 0 ;
		for(int i=0 ; i<nums.length ; i++) {
			if(isEven(nums[i])) {
				total+=1;
			}
		}
		return total ;
		
	}

	public static void main(String[] args) {
		
		int[] nums =  {12,345,2,6,7896} ; 
		
		int total = findNumbers(nums) ;
		
		System.out.println(total);
	}

}
