public class App {

     static void fallingRecursion(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        fallingRecursion(n-1);
        System.out.println(n);

     }

    public static void main(String[] args) {

        fallingRecursion(5);


    }
}
