
class Base1{
    Base1(){
        System.out.println("I am  a Constructor");
    }
    Base1(int a){
        System.out.println("I am Overloaded constructor with a value "+ a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class Derived1 extends Base1{
    Derived1(){
//        super(56);
        System.out.println("I am a derived Class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am An Overloaded Constructor of Derived class containing "+x +" and "+ y);
    }

    public int y;

    public  int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("Iam the childDerived Constructor");
    }
    ChildDerived(int x,int y,int z){
        super(x,z);
        System.out.println("I am the constructor with value "+x+" and "+y);
    }
}



public class _46_Contructors_in_Inheritance {
    public static void main(String[] args) {

//        Base1 bs=new Base1();
//        Base1 bs1=new Base1(3232);
        Derived1 d=new Derived1(2,5);
        ChildDerived ch=new ChildDerived(34,56,90);



    }
}
