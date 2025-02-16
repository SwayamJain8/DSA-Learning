public class LinkedList2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // addLast
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
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

    public void deleteNthNodeFromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            head = head.next; // Remove First
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the mid node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null)
            return true;
        // step-1 find mid
        Node midNode = findMid(head);
        // step-2 reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // head of reversed second half
        Node left = head; // head of first half

        // step-3 compare first half and second half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);

        // ll.print();
        // ll.deleteNthNodeFromEnd(3);
        // ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.checkPalindrome());
    }
}
