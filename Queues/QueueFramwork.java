import java.util.*;
import java.util.LinkedList;

public class QueueFramwork {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // ArrayDeque()<> is also possible
        q.add(10);
        q.add(20);
        q.add(30);
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
