public class LinkedList5 {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node getMid(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // return mid
    }

    private Node head;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right mergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge left & right
        return merge(newLeft, newRight);
    }

    // ZigZag
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; // mid
        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt merge zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList5 ll = new LinkedList5();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // // ll.addFirst(5);
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
