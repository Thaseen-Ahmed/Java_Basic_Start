import java.util.HashSet;

public class _95_Hash_Set {
    public static void main(String[] args) {

//       HashSet  Array can be printed without using For-loop
//If we want to create a Set we have to use HashSet method to create
        HashSet<Integer> h1= new HashSet<>(8,0.5f);
        h1.add(6);
        h1.add(2);
        h1.add(9);
        h1.add(4);
        h1.add(7);
        h1.add(13);
        System.out.println(h1);


    }
}
