import java.util.Scanner;

public class pangkatMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Masukkan jumlah elemen yang dihitung");
        int elemen = sc.nextInt();

        pangkat23[] png = new pangkat23[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat23();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "pangkat " + png[i].pangkat + "adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "pangkat " + png[i].pangkat + "adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
    }
}