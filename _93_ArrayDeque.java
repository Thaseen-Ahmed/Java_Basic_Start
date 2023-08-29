import java.util.ArrayDeque;

public class _93_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(67);
        ad1.add(32);
        ad1.add(89);
        ad1.add(0);
        ad1.addFirst(43);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
