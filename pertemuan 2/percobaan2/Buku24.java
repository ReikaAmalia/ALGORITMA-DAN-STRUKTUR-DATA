public class Buku24{

    String judul, pengarang, penerbit;
    int halaman, stok, harga, terjual;

    public Buku24() {

    }

    public Buku24(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);  
    }   

    void terjual(int jml) {
        if (stok > 0 && jml <= stok)
            stok -=jml;
    }

    void restock(int jml) {
            stok += jml;
    }

    void gantiHarga(int hrg) {
            harga = hrg;
    }
    
    int HitungHargaTotal() {
            return terjual * harga; 
    }

    int hitungDiskon() {
        int total = HitungHargaTotal();
        if (total > 150000) {
            return (total * 12 / 100);
        } else if (total >= 75000 && total <= 150000) {
            return (total * 5 / 100);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        int hargaTotal = HitungHargaTotal();
        int totalDiskon = hitungDiskon();
        return hargaTotal - totalDiskon;
    }
}