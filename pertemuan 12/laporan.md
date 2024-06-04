# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET XII

code node:<br>
public class Node23 {

    int data;
    Node23 prev, next;

    Node23(Node23 prev, int data, Node23 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node23(int input, Object object) {

    }
}

code double linked list:<br>
public class DoubleLinkedList23 {
    Node23 head;
    int size;

    public DoubleLinkedList23() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node23(null, item, null);
        } else {
            Node23 newNode = new Node23(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node23 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node23 newNode = new Node23(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node23 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node23 newNode = new Node23(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node23 newNode = new Node23(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node23 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}

code main:<br>
public class DoubleLinkedListMain23 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedList23 dll = new DoubleLinkedList23();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}

output:<br>
![alt text](<image/output pcb 1.png>)<br>

PERTANYAAN

1. Jelaskan perbedaan antara single linked list dengan double linked lists!<br>
- single linked list : Hanya memiliki satu variabel penunjuk<br>
double linked list : Memiliki dua variabel penunjuk, penunjuk ke simpul sebelumnya dan penunjuk ke simpul berikutnya.<br>
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?<br>
- Atribut next dan prev dalam kelas Node digunakan untuk menyimpan referensi ke node berikutnya dan node sebelumnya dalam linked list<br>
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?<br>
public DoubleLinkedList23() {
        head = null;
        size = 0;
    }
- Pada konstruktor tersebut, ada dua atribut yang diinisialisasi: head dan size.
head agar tidak menunjuk ke node apapun saat daftar baru dibuat.
size = 0; untuk Menginisialisasi ukuran daftar berantai ganda agar dimulai dari 0.<br>
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
Node newNode = new Node(null, item, head);<br>
- Dalam method addFirst(), saat membuat objek dari konstruktor kelas Node, atribut prev diatur ke null karena node yang ditambahkan adalah node pertama dalam linked list<br>
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode?<br>
- head.prev = newNode dalam method addFirst() mengartikan bahwa node baru yang ditambahkan sebagai node pertama harus menunjuk ke node sebelumnya, yang sebelumnya adalah nul.<br>
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?<br>
Node newNode = new Node(current, item, null); <br>
- method addLast(), membuat objek Node dengan mengatur parameter prev ke current dan next ke null mengindikasikan bahwa node baru yang ditambahkan akan menjadi node terakhir dalam linked list
7. Pada method add(), terdapat potongan kode program sebagai berikut:<br>
if (current.prev == null) {
                Node10 newNode = new Node23(null, item, current);
                current.prev = newNode;
                head = newNode;
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.<br>
- Untuk kasus ini ketika elemen ditambahkan di posisi pertama (indeks 0). Jika current.prev adalah null, ini menunjukkan bahwa node baru akan menjadi node pertama dalam linked list

Percobaan 2


code node:<br>
public class Node23 {

    int data;
    Node23 prev, next;

    Node23(Node23 prev, int data, Node23 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node23(int input, Object object) {

    }
}

code double linked list:<br>
public class DoubleLinkedList23 {
    Node23 head;
    int size;

    public DoubleLinkedList23() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node23(null, item, null);
        } else {
            Node23 newNode = new Node23(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node23 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node23 newNode = new Node23(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node23 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node23 newNode = new Node23(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node23 newNode = new Node23(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node23 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node23 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node23 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
}

code main:<br>
public class DoubleLinkedListMain23 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedList23 dll = new DoubleLinkedList23();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();

        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}

output:<br>
![alt text](<image/output pc 2.png>)<br>

Pertanyaan 

1. Apakah maksud statement berikut pada method removeFirst()?<br>
head = head.next;
head.prev = null;
- method removeFirst(), statement head = head.next; untuk menggeser referensi head ke node berikutnya setelah node pertama dihapus<br>
- head.prev = null; mengatur referensi prev dari node baru yang menjadi node pertama menjadi null, karena node baru tersebut tidak memiliki node sebelumnya<br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?<br>
- dalam method removeLast(), perlu melakukan pengecekan apakah node terakhir memiliki referensi next yang kosong (null). Jika current.next == null, ini menunjukkan bahwa node saat ini adalah node terakhir dalam linked list.<br>
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!<br>
Node tmp = head.next;
head.next=temp.next;
tmp.next.prev=head;

- Untuk menghapus suatu node dari struktur data linked list ganda (doubly linked list)<br>
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!<br>
current.prev.next = current.next;
                current.next.prev = current.prev;

- current.prev.next = current.next; dan current.next.prev = current.prev; berfungsi untuk menghapus node current dari linked list<br>
- current.prev.next = current.next; mengatur referensi next dari node sebelum current agar menunjuk ke node setelah curren<br>
- current.next.prev = current.prev; mengatur referensi prev dari node setelah current agar menunjuk ke node sebelum current<br>

Percobaan 3
code node:<br>
public class Node23 {

    int data;
    Node23 prev, next;

    Node23(Node23 prev, int data, Node23 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node23(int input, Object object) {

    }
}

code double linked list:<br>
public class DoubleLinkedList23 {
    Node23 head;
    int size;

    public DoubleLinkedList23() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node23(null, item, null);
        } else {
            Node23 newNode = new Node23(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node23 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node23 newNode = new Node23(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node23 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node23 newNode = new Node23(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node23 newNode = new Node23(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node23 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node23 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node23 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosng");
        }
        Node23 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node23 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}

code main:<br>
public class DoubleLinkedListMain23 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedList23 dll = new DoubleLinkedList23();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();

        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("========================================");
        System.out.println("Data awal pada Linked List adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah: " + dll.get(1));
    }
}

output:<br>
![alt text](<image/output percb 3.1.png>)<br>
![alt text](<image/output percb 3.2.png>)<br>

Pertanyaan

1. Jelaskan method size() pada class DoubleLinkedLists!<br>
- Method mengembalikan jumlah elemen (node) yang ada dalam linked list. Pada implementasinya, method ini mengakses atribut size yang menyimpan informasi tentang jumlah elemen dalam linked list, kemudian mengembalikan nilai size tersebut.<br>
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!<br>
- Untuk nilai awal indeks ke-1 dan kemudian menyesuaikan operasi-operasi yang dilakukan pada linked list, seperti penambahan, penghapusan, atau pencarian elemen, untuk memperhitungkan pergeseran indeks.<br>
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!<br>
- Double Linked Lists (DLL) : Pada DLL, penambahan elemen baru dapat dilakukan di kedua ujung linked list (pertama atau terakhir), serta di tengah-tengah linked list<br>
- Single Linked Lists (SLL) : Pada SLL, penambahan elemen baru terbatas pada ujung-ujung linked list (pertama atau terakhir)<br>
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!<br>
public boolean isEmpty() {
    if(size ==0) {
        return true;
    } else {
        return false;
    }
}

public boolean isEmpty() {
        return head == null;
    }

- Memeriksa apakah suatu struktur data (seperti linked list) kosong, tetapi mereka melakukannya dengan cara yang berbeda dan bergantung pada atribut yang berbeda.<br>

TUGAS 
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang telah divaksinasi di menu Hapus Data(2) harus ada)<br>

code node:<br>
package tugas1;

public class Node {
    int no;
    String nama;
    Node prev, next;

    Node(int no, String nama) {
        this.prev = prev;
        this.no = no;
        this.nama = nama;
        this.next = next;
    }
}

code double linked list:<br>
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

code main:<br>
package tugas1;

import java.util.Scanner;

public class DoubleLinkedListMain {

    public static void menu() {
        System.out.println("========================================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("========================================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("========================================");
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc10 = new Scanner(System.in)) {
            DoubleLinkedList dll = new DoubleLinkedList();

            int pilih;
            do {
                menu();
                pilih = sc10.nextInt();
                sc10.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("---------------------------------------");
                        System.out.println("Nomor Antrian\t: ");
                        int nim = sc10.nextInt();
                        System.out.println("Nama Penerima \t:");
                        String nama = sc10.next();
                        dll.addLast(nim, nama);
                        sc10.nextLine();
                        dll.printQueue();
                        break;

                    case 2:
                        dll.Dequeue();

                    case 3:
                        dll.printQueue();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        }
    }
}

output:<br>
![alt text](<image/tugas prak 12.1.png>)<br>
![alt text](<image/tugas prak 12.2.png>)<br>
![alt text](<image/tugas prak 12.3.png>)<br>
![alt text](<image/tugas prak 12.4.png>)<br>
