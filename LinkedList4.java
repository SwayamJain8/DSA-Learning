import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<Integer>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
