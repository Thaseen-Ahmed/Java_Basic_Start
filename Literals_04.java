import java.sql.SQLOutput;
import java.util.Scanner;

public class Literals_04 {
    public static void main(String[] args) {
        byte age=34;
        System.out.println(age);

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter the First Number");
        float num1=sc.nextFloat();
        System.out.println("Enter the Second Number");
        float num2=sc.nextFloat();
        System.out.println("Enter the Third Number");
        float num3=sc.nextFloat();

        float sum=num1+num2+num3;
        System.out.println("The result is "+ sum);

        boolean b1=sc.hasNextInt();
        System.out.println(b1);
*/

        System.out.println("Enter the Mark in English");
        int Sub1=sc.nextInt();
        System.out.println("Enter the Marks in Tamil");
        int Sub2=sc.nextInt();
        System.out.println("Enter the martks in Maths");
        int Sub3=sc.nextInt();
        System.out.println("Enter the Marks in Science");
        int Sub4 =sc.nextInt();
        System.out.println("Enter the Marks in Social");
        int Sub5=sc.nextInt();

        int toma=Sub1 + Sub2 + Sub3 + Sub4 + Sub5;

        float percent= (float) (toma /5) ;

        System.out.println("The Total Percentage of Your subjects out of 100 is "+ percent +"%");

    }
}
