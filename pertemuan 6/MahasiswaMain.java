import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa23 m1 = new Mahasiswa23("Nusa", 2017, 25, 3);
        Mahasiswa23 m2 = new Mahasiswa23("Rara", 2012, 19, 4);
        Mahasiswa23 m3 = new Mahasiswa23("Dompu", 2018, 19, 3.5);
        Mahasiswa23 m4 = new Mahasiswa23("Abdul", 2017, 23, 2);
        Mahasiswa23 m5 = new Mahasiswa23("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah bubble sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah selection sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah insertion sorting asc berdasarkan ipk");
        list.insertionSortDescending();
        list.tampil();
    }
}