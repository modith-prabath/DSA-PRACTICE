package arrays_medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4, 5}, 
    {6, 7, 8, 9, 10}, 
    {11, 12, 13, 14, 15}, 
    {16, 17, 18, 19, 20}, 
    {21, 22, 23, 24, 25}};

    List<Integer> result = spiral(arr) ; 

    System.out.println(result);
  
}

   static List<Integer> spiral(int[][] arr) {
    List<Integer> spiralOrder = new ArrayList<>() ; 
    int top = 0 ;
    int bottom = arr.length-1 ;
    int left = 0 ;
    int right = arr[0].length-1 ;
    int count = (bottom+1) * (right+1) ;
    while(top <= bottom && left <= right) {
      //Print top row
      if(count > 0 ) {
        for(int i = left ; i <= right ; i++) {
          spiralOrder.add(arr[top][i]) ;
          count-- ;
        }
      }
      top++ ;
      if(count > 0 ) {
        for(int i = top; i <= bottom ; i++) {
          spiralOrder.add(arr[i][right]) ;
          count-- ;
        }
      }
      right-- ; 
      if(count > 0 ) {
        for(int i = right ; i >= left ; i--) {
          spiralOrder.add(arr[bottom][i]) ;
          count-- ;
        }
      }
      bottom-- ;
      if(count > 0 ) {
        for(int i = bottom ; i >= top ; i--) {
          spiralOrder.add(arr[i][left]) ;
          count-- ;
        }
      }
      left++ ;


    }
    return spiralOrder ;

  } 

}
