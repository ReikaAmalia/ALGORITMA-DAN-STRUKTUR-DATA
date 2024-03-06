import java.util.Scanner;

public class Tugas123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] Kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        String[][] Kota = {
                { "Banten" },
                { "Jakarta" },
                { "Bandung" },
                { "Cirebon" },
                { "Bogor" },
                { "Pekalongan" },
                { "Semarang" },
                { "Surabaya" },
                { "Malang" },
                { "Tegal" }
        };

        System.out.print("Masukkan kode plat mobil: ");
        char plat = input.next().charAt(0);

        int index = -1;
        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i] == plat) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Nama kota: " + Kota[index][0]);
        } else {
            System.out.println("Kode plat tidak valid.");
        }

        input.close();
    }
}