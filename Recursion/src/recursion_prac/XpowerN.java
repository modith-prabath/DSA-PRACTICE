package recursion_prac;

public class XpowerN {


   static int xpn(int n , int power){

    if(power == 0 ){
      return 1 ;
    }

    return n * xpn(n , power-1);
  }

  public static void main(String[] args) {

    int num = 2;
    int power = 5 ; 

    int result = xpn(num,power) ;

    System.out.println(result);

  }
  
}
