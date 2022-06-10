package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MaxValue {
	
	static int findMaxValueOfEquation(int[][] points, int k) {
		
		
		int total = 0;
		List<Integer> values = new ArrayList<Integer>() ;
		for(int i= 0 ; i<points.length ; i++) {
			
			for(int j =i+1 ; j < points.length ; j++) {
				int mod = Math.abs(points[i][0] - points[j][0] ) ;
				System.out.println(mod);
				if(mod <= k ) {
					total = points[i][1] + points[j][1]+ mod;
					values.add(total) ;
				}

				
			}
			
		}
		int maxValue = values.get(0);
		for(int i=1 ; i<values.size() ; i++) {
			maxValue = Math.max(maxValue, values.get(i));
		}
		
		
		return maxValue;
		
	}
	
	public static void main(String[] args) {
		
		int[][] points = 
				 {{-17,5},{-10,-8},{-5,-13},{-2,7},{8,-14} }; 
		int k = 4;
		int maxValue = findMaxValueOfEquation( points,  k) ; 
		System.out.println(maxValue);
	}

}
