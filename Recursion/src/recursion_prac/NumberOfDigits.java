package recursion_prac;




public class NumberOfDigits {

  static int noOfDigits(int digit) {

    if(digit > 0) {
      return 1 + noOfDigits(digit/10);
    }
    else {
      return 0 ;
    }
  }

  public static void main(String[] args) {

    int digit = 123456785 ;

    int count = noOfDigits(digit) ;

    System.out.println(count);
    
  }
}
