public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // public static Node insert(Node root, int val) {
    // if (root == null) {
    // root = new Node(val);
    // return root;
    // }
    // if (root.data > val) {
    // root.left = insert(root.left, val);
    // } else {
    // root.right = insert(root.right, val);
    // }
    // return root;
    // }

    // public static void inorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // inorder(root.left);
    // System.out.print(root.data + " ");
    // inorder(root.right);
    // }

    // public static void mirrorBST(Node root) {
    // if (root == null) {
    // return;
    // }
    // if (root.left == null && root.right == null) {
    // return;
    // } else if (root.left == null) {
    // root.left = root.right;
    // root.right = null;
    // return;
    // } else if (root.right == null) {
    // root.right = root.left;
    // root.left = null;
    // } else if (root.left != null && root.right != null) {
    // Node temp = root.right;
    // root.right = root.left;
    // root.left = temp;
    // }
    // mirrorBST(root.left);
    // mirrorBST(root.right);
    // }

    public static Node createMirror(Node root) { // O(n)
        if (root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        // int values[] = { 11, 10, 8, 3, 6, 5 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        // root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();

        // mirrorBST(root);
        // inorder(root);

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /*
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         */

        // Mirror BST
        /*
         * 8
         * / \
         * 10 5
         * / / \
         * 11 6 3
         */

        root = createMirror(root);
        preorder(root);

    }
}
