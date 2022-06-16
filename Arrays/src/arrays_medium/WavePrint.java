package arrays_medium;


public class WavePrint  {


  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4, 5}, 
    {6, 7, 8, 9, 10}, 
    {11, 12, 13, 14, 15}, 
    {16, 17, 18, 19, 20}, 
    {21, 22, 23, 24, 25}};

    wavePrint(arr) ; 
  }

   static void wavePrint(int[][] arr) {
    int row_length = arr.length ;
    int col_length = arr[0].length ;

    for(int row = 0 ; row < row_length ; row++){
      if(row%2 == 0){
        for(int col = 0 ; col < col_length ; col++){
          System.out.print(arr[row][col] + " ");
        }
      }
      else{
        for(int col = col_length-1 ; col >= 0 ; col--){
          System.out.print(arr[row][col] + " ");
        }
      }
    }

  }
  
}
