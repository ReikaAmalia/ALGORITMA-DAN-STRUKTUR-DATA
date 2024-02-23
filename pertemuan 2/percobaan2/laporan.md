# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 2.1 Percobaan 1 : Deklarasi Class, Atribut dan Method
![alt text](<Cuplikan layar 2024-02-21 131643.png>)

Pertanyaan
1. Sebutkan dua karakteristik class atau object!<br>
    -Encapsulation (Enkapsulasi): Ini adalah konsep yang menggabungkan data dan fungsi yang bekerja pada data ke dalam unit tunggal yang disebut objek. Dalam enkapsulasi, data di dalam objek tidak dapat diakses secara langsung dari luar objek. Sebaliknya, mereka hanya dapat diakses melalui metode yang didefinisikan di dalam kelas. Ini membantu dalam pengendalian akses data dan mencegah perubahan yang tidak sah.

    -Inheritance (Pewarisan): Ini adalah mekanisme di mana sebuah kelas dapat mewarisi sifat dan perilaku dari kelas lain yang disebut kelas induk atau superclass. Kelas yang mewarisi sifat disebut kelas turunan atau subkelas. Pewarisan memungkinkan kita untuk menggunakan kembali kode yang sudah ada, menghindari duplikasi kode, dan membangun hirarki kelas yang terstruktur. Dengan pewarisan, kita dapat menambahkan fitur-fitur tambahan ke kelas turunan tanpa mengubah kelas induk.
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!<br>
    -class buku mempunyai 5 atribut:

    judul, pengarang, halaman, stok, harga
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
    -methodnya ada 4 yaitu:
    1. method tampil informasi
    2. method terjual
    3. method restock
    4. method gantiHargaharga
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
![alt text](<Cuplikan layar 2024-02-21 144452.png>)
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
-
6. Commit dan push kode program ke Github

## 2.2 Percobaan 2 : Instansiasi Object, serta Mengakses Atribut dan Method
![alt text](<Cuplikan layar 2024-02-21 141436.png>)

Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?<br>
- Pada baris kode Buku bk1 = new Buku(); digunakan untuk membuat objek baru dari class buku dengan nama bk1
2. Bagaimana cara mengakses atribut dan method dari suatu objek?<br>
-this.nim = nim;
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?<br>
-tergantung pada implementasi method tersebut dan juga keadaan objek pada saat pemanggilan

## 2.3 Percobaan 3 : : Membuat Konstruktor
![alt text](<Cuplikan layar 2024-02-21 151835.png>)

![alt text](<Cuplikan layar 2024-02-21 151947.png>)

Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!<br>
-ada 5 konstruktor berparameter, judul, pengarang, halaman, stok, harga
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?<br>
-objek bk2 dari class Buku10 dengan menggunakan konstruktor berparameter untuk menginisialisasi nilai atribut-atribut objek tersebut
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
hasilnya? Jelaskan mengapa hasilnya demikian!<br>
-maka akan terjadi kesalahan kompilasi. Hal ini karena dalam program tersebut, ketika objek dibuat tanpa menggunakan konstruktor default, konstruktor default tersebut secara implisit dipanggil saat pembuatan objek baru jika tidak ada konstruktor lain yang ditentukan dalam class
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya!<br>
- Tidak, method di dalam class Buku10 tidak harus diakses secara berurutan setelah melakukan instansiasi objek
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Buku!<br>
- Buku23 bkReika = new Buku24("Anak Jalanan", "Cindy", "444", "55", 99000);
    bk2.terjual(14);
    bk2.tampilInformasi();
6. Commit dan push kode program ke Github<br>

2.4 Latihan Praktikum
Waktu : 150 Menit
1. Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(),
hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:
o Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan
perkalian antara harga dengan jumlah buku yang terjual
o Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan berikut:
▪ Jika harga total lebih dari 150000, maka harga didiskon sebesar 12%
▪ Jika harga total antara 75000 sampai 150000, maka harga didiskon sebesar 5%
▪ Jika harga total kurang dari 75000, maka harga tidak didiskon
o Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi
diskon
Class diagram Buku setelah penambahan ketiga method tersebut adalah sebagai berikut.<br>
![alt text](<Cuplikan layar 2024-02-23 103752.png>)<br>
Jawaban<br>
![alt text](<Cuplikan layar 2024-02-23 113431.png>)<br>

2.Buat program berdasarkan class diagram berikut ini!
Dragon
x: int
y: int
width: int
height: int
moveLeft(): void
moveRight(): void
moveUp(): void
moveDown(): void
printPosition(): void
detectCollision(x: int, y: int): void
Penjelasan dari atribut dan method pada class Dragon tersebut adalah sebagai berikut:
• Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari dragon, sedangkan
atribut y untuk posisi koordinat y (vertikal)
• Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height
untuk menyimpan panjang area
• Method moveLeft() digunakan untuk mengubah posisi dragon ke kiri (koordinat x akan
berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah
1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari
nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()
• Method moveUp() digunakan untuk mengubah posisi dragon ke atas (koordinat y akan
berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari
nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()
• Method detectCollision() akan mencetak pesan “Game Over” apabila dragon menyentuh
ujung area permainan.<br>
![alt text](<Cuplikan layar 2024-02-23 125253.png>)<br>
![alt text](<Cuplikan layar 2024-02-23 125400.png>)<br>
![alt text](<Cuplikan layar 2024-02-23 125502.png>)<br>
