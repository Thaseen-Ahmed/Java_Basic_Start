
interface sampleInterface{
    void meth1();
    void meth2();
}
//we cannot inherite(extends) interface in classes but we can implements it
interface ChildsampleInterface extends sampleInterface{

    void meth3();
    void meth4();
}
class MysampleClass implements ChildsampleInterface{
    public void meth1(){
        System.out.println("method_1");
    }
    public void meth2(){
        System.out.println("method_2");
    }
    public void meth3(){
        System.out.println("method_3");
    }
    public void meth4(){
        System.out.println("method_4");
    }

}


public class _58_Inheritance_in_Interface {
    public static void main(String[] args) {
        MysampleClass sam=new MysampleClass();
        sam.meth1();
        sam.meth3();
        sam.meth2();
        sam.meth4();
    }
}
