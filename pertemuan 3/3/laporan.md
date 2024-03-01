# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET III ARRAY OF OBJEK 

## 3.1 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
![alt text](<image/code percobaan 1.png>)<br>
![alt text](<image/output percobaan 1.png>)<br>

3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!<br>
- Tidak, class yang akan dibuat array of object tidak harus selalu memiliki atribut sekaligus method.
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :<br>
- ya punya dilakukan untuk membuat objek baru dari class PersegiPanjang23 dan menginisialisasi nilai atribut objek tersebut.
3. Apa yang dimaksud dengan kode berikut ini:<br>
- kode ini mendeklarasikan sebuah array ppArray yang dapat menyimpan 3 objek dari class PersegiPanjang.
4. Apa yang dimaksud dengan kode berikut ini:<br>
- kode ini untuk menambahkan objek baru dari class PersegiPanjang23 ke elemen kedua array ppArray.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<br>
- Memisahkan class main dan PersegiPanjang pada uji coba 3.2 meningkatkan keamanan, kemudahan bacaan, dan pengujian kode.

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
![alt text](<image/code percobaan 2.png>)<br>
![alt text](<image/output percobaan 2.png>)<br>
Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?<br>
- Array of object dapat diimplementasikan pada array 2 dimensi dengan cara mendeklarasikan array 2 dimensi dengan tipe data Object, membuat array of object untuk setiap baris, dan memasukkan array of object ke dalam array 2 dimensi.<br>
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!<br>
- import java.util.Scanner;

public class PersegiPanjang23 {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        PersegiPanjang23[][] ppArray = new PersegiPanjang23[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ppArray[i][j] = new PersegiPanjang23();
                System.out.println("Persegi panjang ke-" + i + ", " + j);
                System.out.print("Masukkan panjang: ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang ke-" + i + ", " + j);
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?<br>
- hanya dideklarasikan namun tidak diinisialisasikan.<br>
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!<br>
- 
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !<br>
- 

## Percobaan 3: Penambahan Operasi Matematika di Dalam Method

![alt text](<image/code percobaan 3.png>)<br>
![alt text](<image/code percobaan 3 (2).png>)<br>
![alt text](<image/output percobaan 3.png>)<br>

Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!<br>
- konstruktor sendiri bisa lebih dari dua, karena konstruktor sendiri merupakan nama yang sama dengan nama kelas, konstruktor pertama merupakan konstruktor default dengan tidak ada parameter, lalu konstruktor kedua ada parameter.<br>
2. Jika diketahui terdapat class Segitiga seperti berikut ini:
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.<br>
- ![alt text](<image/no 2 percb 3.png>)<br>
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan
library Math pada Java untuk mengkalkulasi sisi miring)<br>
- ![alt text](<image/no 3 percb 3.png>)<br>
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10<br>
- ![alt text](<image/no 4 percb 3.png>)
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
hitungLuas() dan hitungKeliling().<br>
- ![alt text](<image/no 5 percb 3.png>)<br>

## Latihan Praktikum

1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut,
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan
tinggi limas
d. Pada bola, inpuntan untuk atribut hanya jari-jari
2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama,
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:
Masukkan data mahasiswa ke- 1
Masukkan nama :Rina
Masukkan nim :1234567
Masukkan jenis kelamin :P
Masukkan IPK :3.5
Masukkan data mahasiswa ke- 2
Masukkan nama :Rio
Masukkan nim :7654321
Masukkan jenis kelamin :L
Masukkan IPK :4.0
Masukkan data mahasiswa ke- 3
Masukkan nama :Reza
Masukkan nim :8765398
Masukkan jenis kelamin :L
Masukkan IPK :3.8
Data Mahasiswa ke-1
nama : Rina
nim : 1234567
Jenis kelamin : P
Nilai IPK : 3.5
Data Mahasiswa ke-2
nama : Rio
nim : 7654321
Jenis kelamin : L
Nilai IPK : 4.0
Data Mahasiswa ke-3
nama : Reza
nim : 8765398
Jenis kelamin : L
Nilai IPK : 3.8
3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK,
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing
proses tersebut)

