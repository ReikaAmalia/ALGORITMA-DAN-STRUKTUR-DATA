# <p align = "center"> LAPORAN ALGORITMA DAN STRUKTUR DATA
<p align="center">
    <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> <p>

<br><br><br><br><br>

<p align = "center"> Nama       : REIKA AMALIA SYAHPUTRI </p>
<p align = "center"> NIM        : 2341720173 </p>
<p align = "center"> Kelas / no : TI-1B / 23 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## JOBSHEET VI SEARCHING

code :<br>
![alt text](image/codeBuku23.png)<br>
![alt text](codePencarianBuku23.png)<br>
![alt text](image/codeMainBuku23.png)<br>
output:<br>
![alt text](<image/output pertama perb 7.png>)<br>


code:<br>
![alt text](<image/code tambahan.png>)<br>
output:<br>
![alt text](<image/output ke 2 percb 7.png>)<br>

6.2.3. Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!<br>
- Fungsinya yaitu menghentikan perulangan ketika menemukan nilai cari pada kumpulan atribut kode buku di array of object<br>
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
- program yang diberikan akan tetap berjalan meskipun data kode buku yang dimasukkan tidak terurut dari kecil ke besar<br>
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :<br>
- public Buku23 FindBuku(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return listBk[posisi];
    }



    Buku15 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();


6.3.1. Langkah-langkah Percobaan Binary Search

code:<br>
![alt text](<image/code percb 2 pertemuan 7.png>)<br>
![alt text](<image/code percb 2 pertrmuan 7.png>)<br>
output:<br>
![alt text](<image/output keduaa percb 7.jpeg>)<br>

6.3.3. Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
-  if (right >= left) {
            mid = (left + right) / 2;
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
- if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid +-1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?<br>
- Program masih akan berjalan meskipun data Kode Buku yang dimasukkan tidak urut. karena pencarian dilakukan baik dengan pencarian berurutan (sequential search) maupun pencarian biner (binary search) <br>
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!<br>
- Hasil tidak sesuai dikarenakan data tidak urut, cara mengubahnya adalah mengurutkan data nya terlebih dahulu

6.4.1. Langkah-langkah Percobaan Merge Sort

code:<br> 
![alt text](image/codemergesorting.png)<br>
code main:<br>
![alt text](image/codemergesortingmain.png)<br>
output:<br>
![alt text](image/outputtt.png)<br>

6.5. Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
 
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan
sequential search dan binary search.

code buku:<br>
public class Buku23 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku23(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("Kode Buku     : " + kodeBuku);
        System.out.println("Judul Buku    : " + judulBuku);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Stock         : " + stock);
    }
}

code pencarian buku:<br>
import java.util.ArrayList;

public class PencarianBuku23 {
    ArrayList<Buku23> listBuku = new ArrayList<>();

    public void tambah(Buku23 buku) {
        listBuku.add(buku);
    }

    public void tampil() {
        for (Buku23 buku : listBuku) {
            buku.tampilDataBuku();
            System.out.println("------------------------------------");
        }
    }

    public int FindSeqSearch(String kodeBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            if (listBuku.get(i).kodeBuku.equals(kodeBuku)) {
                return i;
            }
        }
        return -1;
    }

    public void Tampilposisi(String kodeBuku, int posisi) {
        if (posisi != -1) {
            System.out.println("Data buku dengan kode " + kodeBuku + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("Data buku dengan kode " + kodeBuku + " tidak ditemukan.");
        }
    }

    public void TampilData(String kodeBuku, int posisi) {
        if (posisi != -1) {
            listBuku.get(posisi).tampilDataBuku();
        }
    }

    public Buku23 FindBuku(String kodeBuku) {
        for (Buku23 buku : listBuku) {
            if (buku.kodeBuku.equals(kodeBuku)) {
                return buku;
            }
        }
        return null;
    }

    public void bubbleSort() {
        int n = listBuku.size();
        Buku23 temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (listBuku.get(j - 1).kodeBuku.compareTo(listBuku.get(j).kodeBuku) > 0) {
                    temp = listBuku.get(j - 1);
                    listBuku.set(j - 1, listBuku.get(j));
                    listBuku.set(j, temp);
                }
            }
        }
    }

    public int FindBinarySearch(String kodeBuku, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (listBuku.get(mid).kodeBuku.equals(kodeBuku)) {
                return mid;
            }

            if (listBuku.get(mid).kodeBuku.compareTo(kodeBuku) > 0) {
                return FindBinarySearch(kodeBuku, low, mid - 1);
            }

            return FindBinarySearch(kodeBuku, mid + 1, high);
        }

        return -1;
    }
}


code main:<br>
import java.util.Scanner;

public class BukuMain23 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku23 data = new PencarianBuku23();
        int jumBuku = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------------------");
            System.out.print("Kode Buku     : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku    : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit  : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang     : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock         : ");
            int stock = s.nextInt();

            Buku23 m = new Buku23(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku23 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("==========================================");
        System.out.println("Menggunakan binary Search");
        data.bubbleSort();
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}


2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini 

- Tambahkan method pencarian judul buku menggunakan sequential search dan binary
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga
ketika input data acak, maka algoritma searching akan tetap berjalan
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang
diberikan!