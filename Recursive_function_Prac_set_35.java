import java.util.Scanner;

public class Recursive_function_Prac_set_35 {

//    sum(n)=1+2+3+.....n-1+n
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }

//    factorial(n)= n *(n-1)*(n-2)*(n-3)*........1;
    static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    // if n =3
    // sumRec(3)=3+sum(2); sumRec(3)=3+2+sum(1);
//    sumRec(3)=3+2+1=6;

    static void pattern(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// Printing pattern using recursive Function
    static void pattern2_rec(int n){
        if(n>0){
            pattern2_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern_re(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number to find the sum");
//        int Input=sc.nextInt();
//
//        System.out.println("The sum of "+ Input +" is "+sumRec(Input));
//
//        System.out.println("Enter the number to find the factorial");
//        int FacNum= sc.nextInt();
//        System.out.println("The Factorial of " +FacNum + " is " + Factorial(FacNum) );

        int n=5;
//        pattern(n);
//        pattern2_rec(n);
        Pattern_re(n);

    }
}

