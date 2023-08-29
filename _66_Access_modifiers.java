
class C1{
        public int x=78;
        protected int y=64;
        int z=21;
        private int a=89;
        public void meth1(){
            System.out.println("the value of x is "+x);
            System.out.println("the value of y is "+y);
            System.out.println("the value of z is "+z);
            System.out.println("the value of a   is "+a);
        }

}
class C2{

}

public class _66_Access_modifiers {
    public static void main(String[] args) {
        C1 c= new C1();
//        c.meth1();

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//  The above am will print result but the below will not print because we cant use private in same package
//        System.out.println(c.a);


    }
}
