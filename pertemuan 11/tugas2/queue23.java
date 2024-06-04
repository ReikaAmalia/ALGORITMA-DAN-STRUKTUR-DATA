package tugas2;

public class queue23 {
    MahasiswaQueue23 front, rear;

    queue23() {
        this.front = this.rear = null;
    }

    void enqueue(int NIM, String nama) {
        MahasiswaQueue23 newNode = new MahasiswaQueue23(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    MahasiswaQueue23 dequeue() {
        if (this.front == null)
            return null;
        MahasiswaQueue23 temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue23 current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}
