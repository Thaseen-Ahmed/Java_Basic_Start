import java.util.ArrayList;
import java.util.Scanner;

class MyGenerics<T1>{
    int val=567;
    private T1 t1;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MyGenerics(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }


}

public class _110_Java_Generics {
    public static void main(String[] args) {
        System.out.println("I am Java Generics");

        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Str 1");
        arrayList.add(54);
        arrayList.add(643);
        arrayList.add(90);
        arrayList.add(12);
//        arrayList.add("Thaseen08");
//        arrayList.add(new Scanner(System.in));

//        type casting to say the array are Integers (int)
//        int a =(int)arrayList.get(2);
//        int a =arrayList.get(2);
//        System.out.println(a);

            MyGenerics<String> g1 = new MyGenerics(32,"MyString is java generics Example");
            String str = g1.getT1();
        System.out.println(str);




//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
        }

    }


