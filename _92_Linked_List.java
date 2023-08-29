//import java.util.ArrayList;
import java.util.LinkedList;

public class _92_Linked_List {
    public static void main(String[] args) {

        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
//        ArrayList<String> s3 = new ArrayList<>();
        l2.add(15);
        l2.add(12);
        l2.add(11);
        l2.add(18);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.addAll(l2);
//        l1.add(0,5);
//        l1.add(0,2);

//        The below methods are not present in ArrayList it is only LinkedList And only work in it

        l1.addFirst(98);
        l1.addLast(423);
        System.out.println(l1.clone());

        for(int i=0;i<=l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }



    }
}
