public class Bola23 {
    public double jariJari;

    public Bola23() {

    }

    double hitungLP() {
        double hasil = 4 * Math.PI * jariJari * jariJari;
        return hasil;
    }

    double hitungVolume() {
        double volume = (Math.PI * jariJari * jariJari * jariJari * 4) / 3;
        return volume;
    }
}