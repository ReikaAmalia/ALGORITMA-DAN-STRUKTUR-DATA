public class BinaryTree23 {

    Node23 root;

    public BinaryTree23() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        root = addRecursive(root, data);
    }

    private Node23 addRecursive(Node23 current, int data) {
        if (current == null) {
            return new Node23(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    Node23 find(int data) {
        return findRecursive(root, data);
    }

    private Node23 findRecursive(Node23 current, int data) {
        if (current == null || current.data == data) {
            return current;
        }

        if (data < current.data) {
            return findRecursive(current.left, data);
        } else {
            return findRecursive(current.right, data);
        }
    }

    void traversePreOrder(Node23 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node23 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void traverseInOrder(Node23 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    Node23 getSuccessor(Node23 del) {
        Node23 successor = del.right;
        Node23 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node23 deleteRecursive(Node23 current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
        } else {
            current.right = deleteRecursive(current.right, data);
        }

        return current;
    }

    private int findSmallestValue(Node23 root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
}