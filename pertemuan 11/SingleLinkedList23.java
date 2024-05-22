public class SingleLinkedList23 {
    Node23 head, tail;

    boolean isEmpty() {
        return head == null; //
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong"); // dinpindah
        } else { // dipindah
            Node23 tmp = head;
            System.out.print("Isi Linked List\t"); // ditambah /t
            while (tmp != null) { // ganti = menjadi !
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
            head = ndInput; // hanya memakai 1 saja
        }
    }

    void addLast(int input) {
        Node23 ndInput = new Node23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput; // kebalik dengan bagian atasnya
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
        if (index < 0) { // ganti jadi kurang dari
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
}
