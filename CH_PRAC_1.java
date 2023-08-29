import java.util.Scanner;

public class CH_PRAC_1 {


    public static void main(String[] args) {

//        int  a=3;
//        int b=6;
//        int c=67;
//        int sum=a+b+c;
//        System.out.println(sum) ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of kilometers to Convert");
        int kilom=sc.nextInt();

        float miles=0.621f;

        float convrt= kilom*miles;
        System.out.println("The number of miles for " + kilom + " kilometers is "+ convrt + " Miles");

    }
}
