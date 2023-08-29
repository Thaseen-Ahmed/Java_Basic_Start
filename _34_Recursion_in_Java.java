import java.util.Scanner;

public class _34_Recursion_in_Java {
    static int factotial(int n){
//        factorial(n)= n *(n-1)*(n-2)*(n-3)*........1;
            if(n==0||n==1){
                return 1;
            }
            else {
                return n * factotial(n-1);
            }
    }

//    static int factotial_iterative(int n){
////        factorial(n)= n *(n-1)*(n-2)*(n-3)*........1;
//            if(n==0||n==1){
//                return 1;
//            }
//            else {
//               int product = 1;
//               for(int i=1;i<=n;i++){
////                   product=product*i;
//                   product*=i;
//
//               }
//               return product;
//            }
//    }
    public static void main(String[] args) {

        System.out.println("Enter the number to do factorial: ");
        Scanner sc = new Scanner(System.in);
        int FactNum=sc.nextInt();

        System.out.println("The value n factorial "+FactNum + " is "+factotial(FactNum));
//        System.out.println("The value n factorial "+FactNum + " is "+factotial_iterative(FactNum));
    }
}
