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

            Buku23 m = new Buku23(kodeBuku, judulBuku, tahunTerbit, Pengarang, stock);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________________________________________");
        System.out.println("______________________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("menggunakan sequetial Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku15 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("==========================================");
        System.out.println("Menggunakan binary Search");
        data.bubbleSort();
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
