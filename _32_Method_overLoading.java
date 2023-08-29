public class _32_Method_overLoading {

//    static void tell_joke(){
//        System.out.println("I invented the Maths and " + "computer");
//    }
//
//    static void Change(int arr[]){
//        arr[3]=254;
//        arr[5]=2;
//    }

    static void joke(){
        System.out.println("hahaha");
    }
    static int joke(int a){
        return a;
    }
    static int joke(int a, int b){
        return a + b;
    }



    public static void main(String[] args) {

        joke();


        System.out.println(joke(4));
        System.out.println(joke(5,5));
//        tell_joke();
//
//        int numbers[] = {26, 89, 12, 789, 5, 87, 32, 0};
//        Change(numbers);
//        System.out.println("The value of New Array after using method is  " + numbers[3] + " and " + numbers[5]);
//
//        for(int i=0;i<numbers.length;i++){
//        System.out.println("The value of New Array is "+numbers[i]);
//    }

//       reversing the Array
//        for(int i= numbers.length-1;i>=0;i--){
//            System.out.println("The value of New Array is "+numbers[i]);
//        }


//        int marks[] = {1,2,3,4};
//        for(int i=marks.length-1; i>=0;i--) {
//            System.out.println(marks[i]);
//        }
//        Method OverLoading in Java



        }
    }


