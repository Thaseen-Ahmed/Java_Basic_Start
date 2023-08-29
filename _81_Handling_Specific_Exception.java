import java.util.Scanner;

public class _81_Handling_Specific_Exception {
    public static void main(String[] args) {

        int []marks= new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of Array");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide the value with:");
        int number= sc.nextInt();
        try{
            System.out.println("The value at array index entered is "+marks[ind]);
            System.out.println("Tne value of array-value /number is "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some other Exception occured");
            System.out.println(e);
        }

    }
}
