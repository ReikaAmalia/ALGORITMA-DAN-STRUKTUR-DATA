package tugas1;

public class DoubleLinkedList {

    Node head, tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int no, String nama) {
        if (isEmpty()) {
            head = new Node(no, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(no, nama);
            current.next = newNode;
            tail = newNode;

        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 0) {
            removeLast();
        } else {
            System.out.println(head.nama + " Sudah divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println(head.nama + " Sudah divaksin");
            head = null;
            tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void enqueue(int no, String nama) {
        if (isEmpty()) {
            addLast(no, nama);
        } else {
            Node newNode = new Node(no, nama);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node removedNode = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println(removedNode.nama + " Sudah Divasksin");
        }
    }

    public void printQueue() {
        System.out.println("========================================");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("========================================");
        System.out.println(" | No\t| Nama\t  |");
        System.out.println("========================================");
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(" | " + tmp.no + "\t| " + tmp.nama + "\t  |");
                tmp = tmp.next;
            }
            System.out.println("========================================");
            System.out.println("Sisa Antrian " + size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

}