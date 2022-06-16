package recursion_prac;


public class Demo2 {

  public static void main(String[] args) {

  pdiSkip(5) ; 
  }

  private static void pdiSkip(int n) {
    if(n == 0){
      return;
    }
    if(n%2 ==1) {
      System.out.println(n);
    }
    pdiSkip(n-1);
    if(n%2==0){
      System.out.println(n);
    }
  }
  
}
