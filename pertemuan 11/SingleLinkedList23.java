public class SingleLinkedList23 {
    Node23 head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            Node23 tmp = head;
            System.out.println("Isi Linked List");
            while (tmp == null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node23 ndInput = new Node23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node23 ndInput = new Node23(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node23 ndInput = new Node23(input, null);
        Node23 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {

                    tail = ndInput;
                    break;
                }

            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input) {
        Node23 ndInput = new Node23(input, null);
        if (index > 0) {
            System.out.println("perbaiki logikanya!"
                    + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node23 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node23(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
