public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst - O(1)
    public void addFirst(int data) {
        // step-1 create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // step-2 newNode next should point to head
        newNode.next = head;

        // step-3 update head to newNode
        head = newNode;
    }

    // addLast - O(1)
    public void addLast(int data) {
        // step-1 create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // step-2 tail next should point to newNode
        tail.next = newNode;

        // step-3 update tail to newNode
        tail = newNode;
    }

    // print - O(n)
    public void print() {
        // if (head == null) {
        // System.out.println("List is empty");
        // return;
        // }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // addAt - O(n)
    public void addAt(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst - O(1)
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removeLast - O(n)
    public int removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // Iterative Search - O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search - O(n)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addAt(2, 5);
        ll.print();
        // System.out.println("Size: " + ll.size);
        // System.out.println("Removed: " + ll.removeFirst());
        // ll.print();
        // System.out.println("Size: " + ll.size);
        // System.out.println("Removed: " + ll.removeLast());
        // ll.print();
        // System.out.println("Size: " + ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(5));
    }
}
