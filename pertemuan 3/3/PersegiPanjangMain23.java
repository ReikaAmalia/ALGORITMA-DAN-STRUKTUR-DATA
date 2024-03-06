import java.util.Scanner;

public class PersegiPanjangMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input panjang array
        System.out.print("Masukkan jumlah persegi panjang: ");
        int n = sc.nextInt();

        // Deklarasi array dengan panjang yang diinputkan
        PersegiPanjang23[] ppArray = new PersegiPanjang23[n];

        // Input data untuk setiap persegi panjang
        for (int i = 0; i < n; i++) {
            ppArray[i] = new PersegiPanjang23();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        // Tampilkan data semua persegi panjang
        for (int i = 0; i < n; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}

