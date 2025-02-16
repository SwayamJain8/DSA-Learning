public class QueueLL {

    // static class is the class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int front = head.data;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                return front;
            }
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // q.add(10);
        // q.add(20);
        // q.add(30);

        // while (!q.isEmpty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }
    }
}
