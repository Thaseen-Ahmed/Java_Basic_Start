import java.util.Scanner;

public class cwh_25_Prac_set_5 {
    public static void main(String[] args) {
  /*      int n=5;
            for(int i=n;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
*/
//        prac--2
//        int sum = 0;
//        int n=3;
//        for(int i=0;i<n;i++){
//             sum=sum + (2*i);
//        }
//        System.out.print("Sum of even number is :");
//        System.out.println(sum);

//
//        int  n=10;
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

//        Factorial
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ;");
//        int n=sc.nextInt();
//        int i=1;
//        int factotrial=1;
//        while(i<=n){
//            factotrial=factotrial*i;
//            i++;
//        }
//        System.out.println(factotrial);

//        int rows = 5, i = 1, j = 1;
//
//        while(i <= rows)
//        {
//            while(j <= i)
//            {
//                System.out.print("*");
//                j++;
//
//            }
//            System.out.print("\n");
//            i++;
//            j=1;


        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
                sum+=n*i;

        }
        System.out.println(sum);
    }
}
