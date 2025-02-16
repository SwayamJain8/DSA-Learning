public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // remove
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reverse
    public void reverse() {
        Node temp = head;
        Node prev = null;
        Node next;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println("Size: " + size);
        // System.out.println("Removed: " + dll.removeFirst());
        // dll.print();
        // System.out.println("Size: " + size);
        dll.reverse();
        dll.print();

    }
}
