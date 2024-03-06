public class BalokMain23 {
    public static void main(String[] args) {
        Balok23[] b1Array = new Balok23[3];

        b1Array[0] = new Balok23(100, 30, 12);
        b1Array[1] = new Balok23(120, 40, 15);
        b1Array[2] = new Balok23(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + b1Array[i].hitungVolume());
        }
    }
}
