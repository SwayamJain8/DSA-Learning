import java.util.LinkedHashSet;

public class LinkedHashSetDS {
    public static void main(String[] args) {
        // LinkedHashSet maintains the insertion order
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");

        System.out.println(lhs); // [A, B, C, D]
    }
}
