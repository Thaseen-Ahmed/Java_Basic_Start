
// we have declare Abstract class if we use Abstreact Method ;
abstract class PaBase2{
    PaBase2(){
        System.out.println("I am Constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void Greet();
    abstract public void Greet2();

//    We have implement both the Above Methods in Child class to access abstract otherwise it will show error

}
class Child2 extends PaBase2{
    @Override
    public void Greet(){
        System.out.println("Good Morning");
    }
  @Override
    public void Greet2(){
        System.out.println("Good Afternoon");
    }

}
abstract class Child3 extends PaBase2{
    public void th(){
        System.out.println("Hi good Evening");
    }
}

public class _53_Abstract_method {
    public static void main(String[] args) {

//                PaBase2 pb=new PaBase2();
//        The above will show error we cannot create object of abstract class
              Child2 c2=new Child2();
              c2.Greet();
              c2.Greet2();
//        but we can create object using the child classes
//        Child3 ch3 = new Child3();


    }
}
//          Pa--->refers to Parent Class