package linearSearch;

//Given array nums of integers , return how many of them contains an even number of digits 
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class EvenDigit {

	public static void main(String[] args) {
		
		int[] arr = {12,345,24,6,7896} ;
		int count = 0 ;
		for(int num : arr) {
			int digits = noOfDigit(num);
			
			if(digits%2==0 ) {
				count++;
			}
		}
		
		System.out.println(count);

	}

	private static int noOfDigit(int num) {
		
		int noOfDigits = 0 ;
		
		if(num == 0 ) {
			return 1 ;
		}
		
		while(num!=0) {
			noOfDigits++ ;
			num = num/10 ;
		}
		
		return noOfDigits;
	}

}
