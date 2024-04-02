import java.util.Scanner;

public class sum23modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================================");
        System.out.println("Masukkan jumlah Perusahaan : ");
        int jml = sc.nextInt();
        sum23[] smList = new sum23[jml];

        for (int i = 0; i < smList.length; i++) {
            System.out.println("========================================================================");
            System.out.println("Masukkan jumlah bulan perusahaan ke " + (i + 1) + " : ");
            int elm = sc.nextInt();
            smList[i] = new sum23(elm);
            System.out.println("========================================================================");
            for (int j = 0; j < smList[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                smList[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < smList.length; i++) {
            System.out.println("========================================================================");
            System.out.println("Algoritma Brute Perusahaan ke " + (i + 1));
            System.out.println(
                    "Total keuntungan perusahaan ke - " + (i + 1) + " selama " + smList[i].elemen + " bulan adalah = "
                            + smList[i].totalBF(smList[i].keuntungan));
            System.out.println("========================================================================");
            System.out.println("Divide Conquer Perusahaan ke " + (i + 1));
            System.out.println(
                    "Total keuntungan perusahaan ke - " + (i + 1) + " selama " + smList[i].elemen + " bulan adalah = "
                            + smList[i].totalDC(smList[i].keuntungan, 0, smList[i].elemen - 1));
        }
    }
}