public class BinaryTreeArray23 {

    int[] data;
    int idxLast;

    public BinaryTreeArray23() {
        data = new int[10];
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // modif
    void add(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == 0) {
                this.data[i] = data;
                return;
            }
        }
        System.out.println("Binary tree is full.");
    }

    void traversePreOrder() {
        System.out.print("PreOrder Traversal: ");
        traversePreOrder(0);
        System.out.println();
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        System.out.print("PostOrder Traversal: ");
        traversePostOrder(0);
        System.out.println();
    }

    private void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}