package arrays_easy;

import java.util.Arrays;

public class OddValuesInAMatrix {
	
	static int oddCells(int m, int n, int[][] indices) {
		int oddNumbers = 0 ;
		 int[][] finalMatrix = new int[m][n];
		 
		 for (int i =0 ; i < indices.length ; i++) {
			 int row = indices[i][0] ;
			 int column = indices[i][1] ; 
			 
			 for(int j=0 ; j < finalMatrix.length ; j++) {
				 
				 if( j == row ) {
					 for(int k =0 ; k < finalMatrix[j].length ; k++) {
						 finalMatrix[j][k]+=1;
					 }
				 }
				 for(int l =0 ; l<finalMatrix[j].length ; l++) {
					 if(l == column) {
						 finalMatrix[j][l]+=1;
					 }
				 }
				 
			 }
			 
		 }
		 
		 for(int g = 0 ; g < finalMatrix.length ; g++) {
			 for(int h =0 ; h<finalMatrix[g].length ; h++) {
				 if(finalMatrix[g][h]%2 != 0 ) {
					 oddNumbers+=1;
				 }
			 }
		 }
		 System.out.println(Arrays.deepToString(finalMatrix));
		 
		 
		return oddNumbers ; 
	}
	
	public static void main(String[] args) {
		int rows =2 ;
		int columns = 2;
		int[][] indices  = {
				{1,1} 
				,{0,0}
		} ;
		int  totalOddNumbers = oddCells( rows ,  columns ,  indices) ; 
		
	}

}
