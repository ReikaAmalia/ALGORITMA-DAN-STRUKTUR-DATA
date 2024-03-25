public class Mahasiswa23 {
    int tahunmasuk, umur;
    String nama;
    double ipk;

    Mahasiswa23(String n, int t, int u, double i) {
        nama = n;
        tahunmasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + tahunmasuk);
        System.out.println("umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}