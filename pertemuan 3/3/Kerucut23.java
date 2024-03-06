public class Kerucut23 {
    public double jariJari, sisi;

    public Kerucut23() {

    }

    double hitungLP() {
        double hasil = (Math.PI * jariJari * sisi) + (Math.PI * jariJari * jariJari);
        return hasil;
    }

    double hitungVolume() {
        double tinggi = Math.sqrt((sisi * sisi) - (jariJari * jariJari));
        return (Math.PI * jariJari * jariJari * tinggi) / 3;
    }
}