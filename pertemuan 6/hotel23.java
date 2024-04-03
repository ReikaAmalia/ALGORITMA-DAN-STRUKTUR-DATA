public class hotel23 {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    hotel23(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll() {
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota      : " + kota);
        System.out.println("Harga     : " + harga);
        System.out.println("Bintang   : " + bintang);

    }
}