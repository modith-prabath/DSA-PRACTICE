package arrays_medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	
	static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> spiralOrder = new ArrayList<Integer>();
		int rowLength = matrix.length ;
		int columnLength = matrix[0].length ;
		int i =0 ,j = 0,k =0 ; // i -> printed rows j -> printed columns 
		int total = rowLength * columnLength ;
		int count =0;
		while(k <= Math.floor(rowLength/2)) {
			while(j<columnLength-k) {
				//Print first row
				spiralOrder.add(matrix[i][j]);
				j+=1;
				count++ ; 
			}
			i+=1 ; j-=1;
			if(count == total) {
				return spiralOrder ; 
			}
			while(i<rowLength-k) {
				//Print last column
				spiralOrder.add(matrix[i][j]);
				i+=1;
				count++ ; 
			}
			j-=1 ; i-=1;
			if(count == total) {
				return spiralOrder ; 
			}
			
			while(j >= k && rowLength !=1) {
				//Print lastrow
				spiralOrder.add(matrix[i][j]);
//				System.out.println(j);
				j-=1;
				count++;
			}
			
			i-=1 ; j+=1; 
			if(count == total) {
				return spiralOrder ; 
			}
			while(i >= k+1 && columnLength != 1) {
				//Print first column 
				spiralOrder.add(matrix[i][j]);
//				System.out.println(j);
				i-=1;
				count++;
			}
			i = k+1 ; j = k+1;
			if(count == total) {
				return spiralOrder ; 
			}
			System.out.println(j);
			System.out.println(i);
			System.out.println(spiralOrder);
			
			k+=1;
		}
		return spiralOrder;

	}
	
	

	public static void main(String[] args) {
		
		int[][] matrix  = {
				{1,2,3,4},
				{5,6,7,8}
				,{9,10,11,12}
		};
		
		List<Integer> spiralOrder = spiralOrder( matrix) ; 
		System.out.println(spiralOrder);
	}

}
