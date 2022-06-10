package arrays_easy;

public class DiangonalSum {
	
	static int diagonalSum(int[][] mat) {
		
		int sum = 0;
		int k =1 ; 
		for(int i=0 ; i<mat.length ; i++) {
			sum+=mat[i][i] ;
			
			if( i != mat.length-k) {
				sum+=mat[i][mat.length-k] ;
			}
			k+=1;
			
		}
		
		return sum ;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrix = {
				{7,3,1,9},
				{3,4,6,9},
				{6,9,6,6},
				{9,5,8,5}
		} ;
		
		int sum = diagonalSum( matrix) ; 
		System.out.println(sum);
		
	}

}
