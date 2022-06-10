package arrays_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
	
	static int maxInArray(int[] a) {
		 int max = 0;
		for (int i= 0 ; i<a.length ; i++) {
			if(a[i]>max) {
				max = a[i] ;
			}
		}
		return max ;
	}
	
	
	static List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
		
		int max = maxInArray(candies);
		List<Boolean> b = new ArrayList<Boolean>() ;
		for(int i=0 ; i<candies.length ; i++) {
			if(candies[i]+extraCandies == max || candies[i]+extraCandies > max  ) {
				b.add(true) ;
				
			}
			else {
				b.add(false);
			}
		}
		
		
		
		return b ;
		
	}

	public static void main(String[] args) {
		
		int extraCandies =3 ;
		int[] candies = {2,3,5,1,3};
		
		List<Boolean> maxCandy = kidsWithCandies(candies , extraCandies) ; 
		
		System.out.println(Arrays.toString(maxCandy.toArray()));
		

	}

}
