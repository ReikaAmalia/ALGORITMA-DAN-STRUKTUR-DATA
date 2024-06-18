public class Queue23 {
    pembeli[] antrian;
    int front, rear, size, max;

    Queue23(int n) {
        max = n;
        antrian = new pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Enqueue(pembeli dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public pembeli Dequeue() {
        pembeli dt = new pembeli();
        if (IsEmpty()) {
            System.out.println("Queue kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(antrian[i] + " No HP ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i] + " No HP ");
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Pembeli terdepan: " + antrian[front].nama + " No HP " + antrian[front].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Pembeli paling belakang : " + antrian[rear].nama + " No HP " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pembeli yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pembeli yang anda cari tidak ada");
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " No HP " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " No HP " + antrian[i].noHP);
            System.out.println("Jumlah Antrian = " + size);
        }
    }
}