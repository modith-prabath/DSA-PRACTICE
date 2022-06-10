package arrays_easy;

import java.util.Arrays;

public class Array_Shuffle {
	
	 static int[] shuffle(int[] a, int n) {
		 int[] b = new int[a.length] ;
		 for(int i=0;i<n ; i++) {
			 b[(i*2)] = a[i] ;
			 b[(i*2)+1] = a[i+(n)] ;	 
		 }
		 
		return b ;
	}
	
	public static void main(String[] args) {
		
		int n =3 ;
		int[] a = {2,3,4,5,6,7};
		
		int[] b = shuffle(a , n);
		
		System.out.println(Arrays.toString(b));
	}

}
