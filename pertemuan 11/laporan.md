# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET XI

code node:<br>
public class Node23 {
    int data;
    Node23 next;

    Node23(int nilai, Node23 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}

code singlelinkedlist:<br>
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
}

code main:<br>
public class SLLMain23 {
    public static void main(String[] args) {
        SingleLinkedList23 singLL = new SingleLinkedList23();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}

output:<br>
![alt text](<image/output 1.png>)


Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
- kode tersebut menghasilkan "Linked List Kosong" karena kondisi di metode print() adalah if (isEmpty()), yang mengembalikan true jika head bernilai null
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
- Variabel temp digunakan sebagai pointer untuk menelusuri linked list, variabel temp biasanya dimulai dari head dan kemudian dipindahkan ke node berikutnya hingga mencapai node yang diinginkan
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
if (temp.next == null) tail = temp.next;
- Kode tersebut untuk menyisipkan node baru ke dalam linked list pada posisi tertentu (ditentukan oleh index). kode ini mengganti referensi temp.next dengan node baru (new Node10(input, temp.next))


code node:<br>
public class Node23 {
    int data;
    Node23 next;

    Node23(int nilai, Node23 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}

code singlelinkedlist:<br>

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

code main:<br>
public class SLLMain23 {
    public static void main(String[] args) {
        SingleLinkedList23 singLL23 = new SingleLinkedList23();

        singLL23.print();
        singLL23.addFirst(890);
        singLL23.print();
        singLL23.addLast(760);
        singLL23.print();
        singLL23.addFirst(700);
        singLL23.print();
        singLL23.insertAfter(700, 999);
        singLL23.print();
        singLL23.insertAt(3, 833);
        singLL23.print();

        System.out.println("Data pada indeks 1e-1=" + singLL23.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL23.indexOf(760));

        singLL23.remove(999);
        singLL23.print();
        singLL23.removeAt(0);
        singLL23.print();
        singLL23.removeFirst();
        singLL23.print();
        singLL23.removeLast();
        singLL23.print();

    }
}

output:<br>
![alt text](<image/output 2.png>)

Pertanyaan:<br>
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<br>
- Keyword break digunakan dalam fungsi remove(int key) untuk menghentikan iterasi saat elemen yang ingin dihapus ditemukan.<br>
2. Jelaskan kegunaan kode dibawah pada method remove<br>
- Kode temp.next = temp.next.next; digunakan untuk menghapus elemen setelah elemen yang ditunjuk oleh temp<br>


TUGAS 1 : Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.<br>
code mahasiswa:<br>
package tugas1;

public class Mahasiswa23 {
    int NIM;
    String Nama;
    Mahasiswa23 next;

    public Mahasiswa23(int NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.next = null;
    }
}

code mahasiswa linked list:<br>
package tugas1;

public class MahasiswaLinkedList23 {
    Mahasiswa23 head;

    public MahasiswaLinkedList23() {
        this.head = null;
    }

    void addFirst(int NIM, String Nama) {
        Mahasiswa23 input = new Mahasiswa23(NIM, Nama);
        input.next = head;
        head = input;
    }

    void addLast(int NIM, String Nama) {
        Mahasiswa23 input = new Mahasiswa23(NIM, Nama);
        if (head == null) {
            head = input;
            return;
        }
        Mahasiswa23 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = input;
    }

    public void insertAfter(int key, int NIM, String Nama) {
        Mahasiswa23 input = new Mahasiswa23(NIM, Nama);
        Mahasiswa23 temp = head;
        while (temp != null && temp.NIM != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa23 input = new Mahasiswa23(NIM, Nama);
        Mahasiswa23 temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void print() {
        Mahasiswa23 temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}

code main:<br>
package tugas1;

public class MahasiswaMain23 {
    public static void main(String[] args) {

        MahasiswaLinkedList23 linkedList = new MahasiswaLinkedList23();
        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAfter(113, 114, "Doni");
        linkedList.insertAt(4, 115, "Sari");

        linkedList.print();
    }
}

output:<br>
![alt text](<image/output tugas 1.png>)<br>

TUGAS 2: Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang ditunjukkan pada soal nomor 1! Ketentuan<br>
a. Implementasi antrian menggunakan Queue berbasis Linked List!<br>
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1<br>
code queue:<br>
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
code mahasiswa queue:<br>
package tugas2;

public class MahasiswaQueue23 {
    int NIM;
    String nama;
    MahasiswaQueue23 next;

    MahasiswaQueue23(int NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
        this.next = null;
    }
}

code main:<br>
package tugas2;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        queue23 queue = new queue23();
        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        queue.printQueue();

        System.out.println("\nDequeue: " + queue.dequeue().nama);
        queue.printQueue();
    }
}

output:<br>
![alt text](<image/output tugas 2.png>)<br>

