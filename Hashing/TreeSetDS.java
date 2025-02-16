import java.util.TreeSet;

public class TreeSetDS {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10); // O(logn)
        ts.add(20);
        ts.add(3);
        ts.add(40);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.ceiling(25));
        System.out.println(ts.floor(25));
        System.out.println(ts.higher(25));
        System.out.println(ts.lower(25));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts);
    }
}
