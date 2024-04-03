# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET - 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

Percobaan 1

code:

![alt text](image/codeMahasiswaa.png)<br>
![alt text](image/codeDaftarMahasiswaBerprestasi.png)<br>
![alt text](image/codeMain.png)<br>

output:

![alt text](<image/output percobaan 1 (2).png>)<br>

5.2.3 Pertanyaan
1. Terdapat di method apakah proses bubble sort?<br>
- pada method bubbleSort() di class MahasiswaBerprestasi<br>
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut?<br>
- untuk membandingkan nilai IPK (indeks prestasi kumulatif) dari dua elemen berturut-turut dalam array listMhs yang berisi objek Mahasiswa
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:<br>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?<br>
- jika perulangan i untuk mengiterasi dalam setiap elemen dalam array listMhs. Perulangan ini juga memastikan semua elemen dapat dibandingkan dengan elemen setelahnya.
jika perulangan j untuk mengontrol berapa kali perbandingan dan penukaran elemen dilakukan dan berhenti jika tidk ada lagi elemen yg perlu ditukar (ketika array sudah urut)<br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
<br>
- karena setiap iterasi i mewakili satu langkah pembubble-an<br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? 
<br>
- karena setiap iterasi j memperkecil jangkauan elemen yang perlu dipertimbangkan<br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?<br>
- perulangan i akan berlangsung 50 sampai 1 (49 kali). karena bubble sort akan berhenti ketika array sudah terurut.

percobaan 2
code:

![alt text](image/codePercobaan2.png)<br>
![alt text](image/codeMainpercb2.png)<br>

output:
![alt text](<image/output percobaan 2 (2).png>)<br>

5.3.3. Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!<br>
- untuk mencari nilai ipk terkecil dari array listMhs dengan membandingkan antar index array.

percobaan 3:

code:

![alt text](image/CodePercobaan3.png)<br>
![alt text](image/CodePercobaan3DMB.png)<br>

output:

![alt text](<image/Output Percobaan 3 (2).png>)<br>

5.4.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.<br>
- void insertionSortDescending() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa23 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

5.5 Latihan Praktikum


Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan
1. Harga dimulai dari harga termurah ke harga tertinggi.
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)
Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma
bubble sort dan selection sort. 

code : hotel <br>
![alt text](image/codelatihanhotel.png)<br>
code : hotel service <br>
![alt text](image/codelatihanhotelservice.png)<br>
code main : <br>
![alt text](image/codelatihanhotelmain.png)<br>

output:<br>
![alt text](image/output1lat.6.png)<br>
![alt text](output2lat.6.png)<br>
![alt text](image/output3lat.6.png)<br>