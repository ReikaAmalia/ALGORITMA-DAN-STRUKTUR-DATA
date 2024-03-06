import java.util.Scanner;

public class Pemilihan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, kuis, uts, uas;
        String nilaiHuruf;
        double nilaiAkhir;
        double nilaiMinimum = 39;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        // Menginputkan nilai tugas
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextInt();

        // Menghitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("==============================");
        System.out.println("==============================");

        // Memeriksa apakah nilai valid
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            System.out.println("Nilai tidak valid");
        } else {

            // Menampilkan nilaiAkhir
            System.out.println("Nilai Akhir: " + nilaiAkhir);

            // Menampilkan nilaiHuruf
            System.out.println("Nilai Huruf: " + nilaiHuruf);

            System.out.println("==============================");
            System.out.println("==============================");

            if (nilaiAkhir >= nilaiMinimum) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir <= nilaiMinimum) {
                System.out.println("Mohon Maaf");

            }
        }
    }
}