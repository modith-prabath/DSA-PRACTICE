package recursion_prac;
public class factorial {

  public static void main(String[] args) {
    int result = factorial(6);
    System.out.println(result);
  }

  private static int factorial(int n) {
    if(n>0){
      return  n * factorial(n-1);
    }
    else {
      return 1 ;
    }

    
    
  }
    
  }
  
