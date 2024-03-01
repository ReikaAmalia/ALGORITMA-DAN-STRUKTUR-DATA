import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah mata kuliah yang Anda tempuh: ");
        int jmlMatkul = input.nextInt();

        double totalBobotSKS = 0;
        double totalBobotSKSxNilai = 0;

        double[] nilaiAngka = new double[jmlMatkul];
        int[] bobotSKS = new int[jmlMatkul];
        String[] namaMatkul = new String[jmlMatkul];

        // Memasukkan inputan
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("\nMasukkan nama Mata Kuliah ke-" + (i + 1) + ": ");
            input.nextLine(); // Untuk hapus karakter newline yang tersisa
            namaMatkul[i] = input.nextLine();
            System.out.print("Masukkan bobot SKS Mata Kuliah ke-" + (i + 1) + ": ");
            bobotSKS[i] = input.nextInt();
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatkul[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("============================================================");
        System.out.println("==================Hasil Konversi Nilai======================");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("============================================================");

        // Menghitung nilai setara
        for (int i = 0; i < jmlMatkul; i++) {
            double nilaiSetara;
            String nilaiHuruf;
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiSetara = 4.0;
                nilaiHuruf = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiSetara = 3.5;
                nilaiHuruf = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiSetara = 3.0;
                nilaiHuruf = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiSetara = 2.5;
                nilaiHuruf = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiSetara = 2.0;
                nilaiHuruf = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiSetara = 1.0;
                nilaiHuruf = "D";
            } else {
                nilaiSetara = 0;
                nilaiHuruf = "E";
            }
            System.out.println(namaMatkul[i] + "\t\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf + "\t\t" + nilaiSetara);

            totalBobotSKS += bobotSKS[i];
            totalBobotSKSxNilai += (nilaiSetara * bobotSKS[i]);
        }
        // Hasil nilai IPS
        System.out.println("============================================================");
        double IPSemester = totalBobotSKSxNilai / totalBobotSKS;
        System.out.println("============================================================");

        System.out.println("\nIP: " + String.format("%.2f", IPSemester));
    }   
}
