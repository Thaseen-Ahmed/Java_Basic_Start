import java.util.Scanner;

public class _80_try_catch_block {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a=9000;

        try{
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("the result of a and b is "+c);

        }
        catch(Exception e){
            System.out.println("we failed to divdide. Reason:");
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
