@FunctionalInterface
interface DemoAno{ 
//    void Meth1();
//    void Meth1(int a);
    void Meth1(int a,int b);
//    void Meth2();

}
//class AnonyDemo implements DemoAno{
//    void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void Meth1() {
//
//        System.out.println("I am Method1");
//    }
//
//    @Override
//    public void Meth2() {
//
//        System.out.println("I am Method 2");
//
//    }
//}
public class _109_Anonymous_and_Lambda_Expression {
    public static void main(String[] args) {

        System.out.println("I am Anonymous and Lambda Expressions");
//        DemoAno an =new AnonyDemo();
//        an.Meth1();
//        DemoAno obj = new AnonyDemo();
//        obj.Meth1();
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void Meth1() {
//                System.out.println("I am Meth1 of Anonymous Class");
//            }
//
//            @Override
//            public void Meth2() {
//                System.out.println("I am Meth 2 of Anonymous Class");
//            }
//
//        };
//        obj.Meth1();
//        obj.Meth2();

//   Lambda Expressions only used when only single Interface Is Created and we don't have to create any class for this.

//        Below is Short Code
//        DemoAno obj= ()->{System.out.println("I am Method 1 from the Anonymous Function and num ");};
//       Long code
//        DemoAno obj= ()->{
//        System.out.println("I am Method 1 from the Anonymous Function and num ");
//        };
//        obj.Meth1();

//        We can also pass Arguments in Lambda Expressions
//        DemoAno obj= (a)->{
//            System.out.println("I am Method 1 from the Anonymous Function and num "+a);
//        };
//        obj.Meth1(67);
        DemoAno obj= (a,b)->{
            System.out.println("I am Method 1 from the Anonymous Function and num "+a +" and "+b+" is "+(a+b));
        };
        obj.Meth1(67,5);


    }
}
