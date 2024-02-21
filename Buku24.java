public class Buku24{

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);  
    }   

    void terjual(int jml) {
            stok -=jml;
    }

    void restock(int jml) {
            stok += jml;
    }

    void restock(int hrg) {
            harga = hrg;
    }
    
}
