package recursion_prac;

public class Fibonacci {

  public static void main(String[] args) {
    int result = fibonacci(8);
    System.out.println(result);

    int result1 = fib(8);
    System.out.println(result1);
  
}
//without recursion
  private static int fibonacci(int i) {

    int prev_num = 0 ;
    
    int count = 1 ;

    int result ;  
    while(i>1){
  
      result = count + prev_num ; 

      prev_num = count ; 

      count = result ; 

      i-=1;
  }

  return count ;


}

//with recursion 

private static int fib(int i) {
  if(i==0){
    return 0 ;
  }
  if(i==1){
    return 1 ;
  }
  return fib(i-1) + fib(i-2);
}


}

