import java.util.Scanner;


public class Tugas223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        do {
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    hitungKecepatan(input);
                    break;
                case 2:
                    hitungJarak(input);
                    break;
                case 3:
                    hitungWaktu(input);
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (menu != 0);

        input.close();
    }

    public static void hitungKecepatan(Scanner input) {
        System.out.println("Menghitung Kecepatan");
        System.out.print("Masukkan jarak (s): ");
        double s = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = input.nextDouble();
        double v = s / t;
        System.out.println("Kecepatan adalah " + v);
    }

    public static void hitungJarak(Scanner input) {
        System.out.println("Menghitung Jarak");
        System.out.print("Masukkan kecepatan (v): ");
        double v = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = input.nextDouble();
        double s = v * t;
        System.out.println("Kecepatan adalah " + s);
    }

    public static void hitungWaktu(Scanner input) {
        System.out.println("Menghitung Waktu");
        System.out.print("Masukkan jarak (s): ");
        double s = input.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double v = input.nextDouble();
        double t = s / v;
        System.out.println("Waktu yang diperlukan adalah " + t);
    }
}
