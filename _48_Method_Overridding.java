
class A{
    int a;
    public int thaseen(){
        return 4;
    }
    public void metho2(){
        System.out.println("I am Method two(2) of class A");
    }
}
class B extends A{
    @Override
    public void metho2(){
        System.out.println("I am Method 2 of Class B");
    }
    public void metho3(){
        System.out.println("I am Method 3 of class B");
    }

}


public class _48_Method_Overridding {
    public static void main(String[] args) {

        A a=new A();
        a.metho2();

        B b=new B();
        b.metho2();
        b.metho3();

    }
}
