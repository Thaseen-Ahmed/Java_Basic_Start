public class _33_variable_arguments {

//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b,int c) {
//        return a+b+c;
//    }
//    static int sum(int a , int b,int c, int d){
//        return a+b+c+d;
//    }

//    var arguments
    static int sum(int ...arr){
//        Available as int[] arr
       int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
        }

    public static void main(String[] args) {

        System.out.println("Welcome Variable Arguments in java");
        System.out.println("The value of 53 and 23 is "+sum(53,23));
        System.out.println("The value of Nothing is :"+sum());
        System.out.println("The value of 48 ,56, and 23 is "+sum(48,56 ,23 ));
        System.out.println("The value of 48 ,56, and 23 and 12  is "+sum(48,56 ,23 ,12));
        System.out.println("The value of 48 ,56, and 23 and 12  is "+sum(48,56 ,23 ,12,678));

    }
}
