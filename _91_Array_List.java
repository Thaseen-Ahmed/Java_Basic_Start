
import java.util.*;

public class _91_Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>(6);
        ArrayList<String> s3 = new ArrayList<>();
        l2.add(15);
        l2.add(12);
        l2.add(11);
        l2.add(18);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,2);

//        the below method will add two list
//        l1.addAll(l2);
//        the below will add after the respective index
        l1.addAll(0,l2);

        // the below will clear the list
//        l1.clear();
//        the below will show true or false if element is present in list

//        System.out.println(l1.contains(12));
//        System.out.println(l1.contains(78));
        System.out.println(l1.indexOf(15));
//        System.out.println(l1.indexOf(11));
//        System.out.println(l1.indexOf(116));
//        System.out.println(l1.indexOf(6));
//        l1.set(1,78);
//        System.out.println(l1.isEmpty());
//        System.out.println(l1.lastIndexOf(6));


//
//        for (int i=0;i<=l1.size();i++){
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }
//

        s3.add("Thaseen");
        s3.add("Ahmed");
        s3.add("Adnan");
        s3.add("Muzammil");
        s3.add("Afraz");
        s3.add("Mudassir");

        System.out.println(s3.contains("Mudassir"));
        System.out.println(s3.contains("Captain"));
        s3.add(3,"Sami");
        s3.set(1,"Roshan");
        System.out.println(s3.indexOf("Adnan"));
        System.out.println(s3.isEmpty());
//        s3.clear();
//        System.out.println(s3.isEmpty());

        for(int i=0;i<=s3.size();i++){
            System.out.print(s3.get(i));
            System.out.print(", ");
        }


    }
}
