# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET V X QUEUE

10.2 Praktikum 1

code :<br>
public class Queue23 {
    int[] data;
    int front, rear, size, max;

    Queue23(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
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

    void peak() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("jumlah elemen = " + size);

        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }
    }
}

code main : <br>
import java.util.Scanner;

public class Queue23main {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("---------------------------");

    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc23.nextInt();

        Queue23 Q = new Queue23(n);

        int pilih = 0;
        do {
            menu();
            pilih = sc23.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru : ");
                    int dataMasuk = sc23.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

output : <br>
![alt text](<image/output latihan 1.png>)


10.2.3 Pertanyaan

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?<br>
- nilai awal atribut front dan rear digunakan untuk menunjukkan bahwa antrian kosong dan ketika kedua atribut memiliki nilai -1 maka tidak ada elemen dalam antrian. <br>
- nilai atribut size ditetapkan sebagai 0 karena saat awal antrian dibuat tidak ada elemen, dan jumlah elemen diwakilin oleh size<br>
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
- code tersebut digunakan untuk mengatasi kondisi ketika antrian penuh, jika rear = max 1 maka antriannya penuh. dan kode tersebut mengatur ulang rear ke posisi awal, juga memastikan bahwa elemen baru dapat dimasukkan ke awal antrian jika masih ada ruang yang kosong
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
- code tersebut digunakan untuk mengelola front dalam strutur data circular queue, dan memastikan jika elemen telah diambil, front akan kembali ke posisi awal antrian unutk menangmbil elemen baru<br>
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?<br>
- metode print dari struktur data circular queue, memulai perulangan dengan i = front memiliki tujuan dapat mencetak elemen-elemen antrian secara berurutan, dimulai dari posisi pertama dalam antrian. <br>
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!<br>
- digunakan dalam metode print untuk memperbarui nilai i agar bergerak maju ke elemen berikutnya dalam struktur data circular queue.
6. Tunjukkan potongan kode program yang merupakan queue overflow!<br>
- public boolean IsFull() { //queue overflow
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!<br>
- void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
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

10.3 Praktikum 2

code nasabah : <br>
public class nasabah23 {
    String norek, nama, alamat;
    int umur;
    double saldo;

    nasabah23() {

    }

    nasabah23(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}

code queue : <br>
public class queue {
    nasabah23[] data;
    int front, rear, size, max;

    queue(int n) {
        max = n;
        data = new nasabah23[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(nasabah23 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public nasabah23 dequeue() {
        nasabah23 dt = new nasabah23();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
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

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                    + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}

code main :
import java.util.Scanner;

public class queuee23main {

    public static void menu() {
        System.out.println("Pilih menu :");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Keluar");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc23.nextInt();

        queue Q = new queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc23.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sa.nextLine();
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sa.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc23.nextInt();
                    System.out.print("Saldo : ");
                    int saldo = sc23.nextInt();
                    nasabah23 nb = new nasabah23(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    nasabah23 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}


output :<br>
![alt text](<image/output percobaan 2 (3).png>)

10.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!<br>
- untuk memeriksa apakah pengambilan elemen dari antrian berhasil dilakukan<br>
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!<br>
-  void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }


case 5:
 System.out.println("5. Cek antrian belakang");


                    Q.peekRear();
                    break;



10.4 Tugas
Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang digambarkan pada Class diagram

