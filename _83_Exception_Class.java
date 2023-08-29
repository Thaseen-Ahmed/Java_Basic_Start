import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return  "I am toString()";
    }
    public String getMessage(){
        return  "I am getMessage()";
    }
}

public class _83_Exception_Class {
    public static void main(String[] args) {
        System.out.println("Enter tha value of A");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
//            try{
//                if(a>9){
//                    System.out.println("Enter less than 9");
//                }
//
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
            try{
//            throw new MyException();
            throw new ArithmeticException("I am the Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
               e.printStackTrace();
            }
        }

    }
}
