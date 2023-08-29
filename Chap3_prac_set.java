import java.util.Scanner;

public class Chap3_prac_set {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Income");
//        float tax=0;
//        float income =sc.nextFloat();
//
//        if(tax<2.5){
//            tax=tax+0;
//
//        }
//        if(tax>2.5f && tax<5.0f){
//            tax = tax +0.05f *(income-2.5f);
//        }
//        else if (tax>5f && tax<10.0f) {
//            tax = tax + 0.05f*(5-0f-2.5f);
//            tax = tax + 0.2f*(income-2.5f);
//
//        }
//        else if (tax<10.0f) {
//            tax = tax + 0.05f*(5-0f-2.5f);
//            tax = tax + 0.2f*(10.0f-5f);
//            tax = tax + 0.3f*(income-10.0f);
//
//        }
//        System.out.println("The Total tax paid by Employee is " + tax);




        int b=10;
        do{
            System.out.println(b);
            b++;

        }
        while(b<5);


        for(int i=5;i<20;i++){
            if(i==10){
//                break;
                continue;
            }
//            else {
//                System.out.println(i);
//            }
            System.out.println(i);
        }
    }
}
