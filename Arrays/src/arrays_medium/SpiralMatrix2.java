package arrays_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix2 {

  public static void main(String[] args) {
    
    int n = 3 ;

    int[][] result = generateMatrix(n);
    System.out.println(Arrays.deepToString(result));

  }

   static int[][] generateMatrix(int n) {
    int[][] spiralOrder = new int[n][n] ; 
    int top = 0 ;
    int bottom = n-1 ;
    int left = 0 ;
    int right = n-1 ;
    int count = n*n ;
    int value = 1 ;
    while(top <= bottom && left <= right) {
      //Print top row
      if(count > 0 ) {
        for(int i = left ; i <= right ; i++) {
          spiralOrder[top][i] = value ;
          value+=1 ;
          count-- ;
        }
      }
      top++ ;
      if(count > 0 ) {
        for(int i = top; i <= bottom ; i++) {
          spiralOrder[i][right] = value ;
          value+=1 ;
          count-- ;
        }
      }
      right-- ; 
      if(count > 0 ) {
        for(int i = right ; i >= left ; i--) {
          spiralOrder[bottom][i] = value ;
          value+=1 ;
          count-- ;
        }
      }
      bottom-- ;
      if(count > 0 ) {
        for(int i = bottom ; i >= top ; i--) {
          spiralOrder[i][left] = value ;
          value+=1 ;
          count-- ;
        }
      }
      left++ ;


    }
    return spiralOrder ;

  }
  
}
