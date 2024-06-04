import org.w3c.dom.Node;

public class SingleLinkedList23 {
    Node23 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong"); // dinpindah
        } else { // dipindah
            Node23 tmp = head;
            System.out.print("Isi Linked List\t"); // ditambah /t
            while (tmp != null) { // ganti menjadi !
                System.out.print(tmp.data + "\t"); // print
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int input) {
        Node23 ndInput = new Node23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput; // hanya memakai 1
        }
    }

    void addLast(int input) {
        Node23 ndInput = new Node23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput; // terbalik dengan bagian atasnya
        }
    }

    void insertAfter(int key, int input) {
        Node23 ndInput = new Node23(input, null);
        Node23 temp = head;
        while (temp != null) { // tmbahkan while
            // hapus do
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { // ganti tanda seru menjadi =
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } // hapus while
    }

    void insertAt(int index, int input) {
        Node23 ndInput = new Node23(input, null);
        if (index < 0) { // ganti jadi <
            System.out.println("perbaiki logikanya!"
                    + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node23 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) { // tambahkan -1 && temp != null;
                temp = temp.next;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Indeks melebihi panjang linked list");
            }
        }
    }

    int getData(int index) {
        Node23 tmp = head;
        for (int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            return tmp.data;
        }
        return -1;
    }

    int indexOf(int key) {
        Node23 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }
        return index;
    }

    void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            System.out.println("Linked list masih kosong,");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node23 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            Node23 temp = head;
            if (temp.data == key) {
                removeFirst();
                return;
            }
            while (temp.next != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Elemen tidak ditemukan dalam linked list");
        } else {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }

    public void removeAt(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                removeFirst();
            } else {
                Node23 temp = head;
                for (int i = 0; temp != null && i < index - 1; i++) {
                    temp = temp.next;
                }
                if (temp == null || temp.next == null) {
                    System.out.println("Indeks melebihi panjang linked list");
                } else {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                }
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }
}
