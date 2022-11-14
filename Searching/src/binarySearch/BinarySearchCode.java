package binarySearch;

public class BinarySearchCode {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,12,34,67,89,100};
		
		int ans = BinarySearch(arr, 34);
		
		System.out.println(ans);
	}
	
	static int BinarySearch(int[] arr , int target) {
		
		int start = 0;
		
		int end = arr.length-1;
		
		boolean isAsc = arr[start]<arr[end];
		
		while(start <= end) {
			
			int mid = start + (end-start)/2 ;
			
			if(arr[mid] == target) {
				return mid ;
			}
			
			if(isAsc) {
				if(target < arr[mid] ) {
					end = mid -1 ;
				}
				else {
					start = mid +1 ;
				}
			}
				else {
					if(target > arr[mid] ) {
						end = mid -1 ;
					}
					else {
						start = mid +1 ;
					}
				}
			
		}
		return -1;
		
		
	}

}
