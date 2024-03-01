public class Segitiga23 {
    public int alas;
    public int tinggi;
    public int sisimiring;

    public Segitiga23(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double sisimiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisimiring;
    }
}
