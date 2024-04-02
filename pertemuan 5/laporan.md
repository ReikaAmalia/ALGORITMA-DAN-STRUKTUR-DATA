# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET IV BRUTE FORCE DAN DIVIDE CONQUER

Percobaan 1

code:<br>
![alt text](image/codefaktoriall.png)<br>
main:<br>
![alt text](image/codefaktoriall.main.png)<br>
output:<br>
![alt text](<image/output percb 5.1.png>)<br>

4.2.3 Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!<br>
- penggunaan if dan juga else pada algoritma Divide and Conquer untuk menghitung faktorial membantu dalam menentukan langkah selanjutnya berdasarkan nilai n, if untuk menghentikan rekursi pada kasus dasar, jika else untuk melanjutkan rekursi dan memecah masalah menjadi dua bagian yng lebih kecil.<br>
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!<br>
- ![alt text](image/jawabanno2.png)<br>
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !<br>
- fakto *= i; digunakan untuk menghitung nilai faktorial secara langsung dengan perkalian berulang. Jika int fakto = n * faktorialDC(n-1); digunakan untuk menyimpan nilai faktorial yang dihitung secara rekursif. Jika nilai faktorial hanya dibutuhkan untuk satu kali perhitungan, maka fakto *= i; dapat digunakan. Jika nilai faktorial dibutuhkan untuk beberapa kali perhitungan atau di dalam fungsi rekursif, maka int fakto = n * faktorialDC(n-1); dapat digunakan.


Percobaan 2

code:<br>
![alt text](image/codepangkat.png)<br>
main:<br>
![alt text](image/codepangkat.main.png)<br>
output:<br>
![alt text](<image/output percb 5.2.png>)<br>


4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF()dan PangkatDC()!<br>
- PangkatBF() :
menggunakan pendekatan langsung dengan melakukan iterasi sebanyak n kali, di mana n merupakan eksponen pangkat.
setiap iterasi, hasil pangkat dihitung dengan mengalikan bilangan asli dengan dirinya sendiri sebanyak kali sesuai dengan eksponen.
PangkatDc() :
menggunakan pendekatan rekursif dengan membagi permasalahan menjadi submasalah yang lebih kecil.
setiap langkah rekursif, pangkat dari setengah eksponen dihitung dan hasilnya dikuadratkan.<br>
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>
- ![alt text](<image/jawaban no2 percb 2.png>)<br>
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.<br>
- ![alt text](image/codepercb2no3.png)<br>
![alt text](image/codepercb2no3.2.png)<br>
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!<br>
- ![alt text](image/codepercb2no4.png)<br>


percobaan 3

code:<br>
![alt text](image/percobaan3.lat5.png)<br>
main:<br>
![alt text](image/percobaan3main.lat5.png)<br>
output:<br>
![alt text](image/outputpercobaan3.3.png)<br>

4.4.3 Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!<br>
- digunakan dalam metode Divide and Conquer untuk menghitung hasil pangkat dari setiap submasalah. Memungkinkan untuk menggabungkan hasil dari kedua submasalah dan menghitung hasil pangkat secara rekursif. Hasil pangkat dari kedua submasalah termasuk dalam perhitungan akhir, memastikan bahwa hasil pangkat akhir yang benar diperoleh.
2. Kenapa dibutuhkan variable mid pada method TotalDC()?<br>
- untuk menentukan elemen tengah dari array saat membagi masalah menjadi submasalah yang lebih kecil.
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!<br>
- ![alt text](image/percobaan3modifikasi.png)<br>

Latihan
1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini
Tentukan:
a. top_acceleration tertinggi menggunakan Divide and Conquer!
b. top_acceleration terendah menggunakan Divide and Conquer!
c. Rata-rata top_power dari seluruh mobil menggunakan Brute Force!
