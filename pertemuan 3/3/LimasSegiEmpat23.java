public class LimasSegiEmpat23 {
    public double panjangSisiAlas, tinggi;

    public LimasSegiEmpat23(int a, int t) {
        panjangSisiAlas = a;
        tinggi = t;
    }

    double hitungLP() {
        double sisiMiring = Math.sqrt(Math.pow(tinggi, 2)) * Math.pow(panjangSisiAlas / 2, 2);
        return (panjangSisiAlas * panjangSisiAlas) + (4 * (panjangSisiAlas * sisiMiring / 2));
    }

    double hitungVolume() {
        double volume = panjangSisiAlas * panjangSisiAlas * tinggi / 3;
        return volume;
    }
}