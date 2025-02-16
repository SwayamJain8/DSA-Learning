public class AVLTrees {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
            this.left = this.right = null;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null)
            return 0;
        return root.height;
    }

    public static int getBalanceFactor(Node root) {
        if (root == null)
            return 0;
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        // Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get root's balance factor
        int bf = getBalanceFactor(root);

        // Left Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

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

    // ------------------------ROTATIONS------------------------
    // Left Rotate
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        // Return the new root
        return y;
    }

    // Right Rotate
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        // Return the new root
        return x;
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        // AVL Tree
        // 30
        // / \
        // 20 40
        // / \ \
        // 10 25 50

        preorder(root);
    }
}
