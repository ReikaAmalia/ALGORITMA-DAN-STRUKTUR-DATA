import java.util.Scanner;

public class uts23main {

    public static void main(String[] args) {
        // Deklarasi array data
        int[] data = { 49, 38, 10, 17, 37, 6, 6, 24, 24, 7, 43, 11, 25, 30, 29, 46, 14 };

        // Menu pilihan pengurutan dan pencarian
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih menu:");
        System.out.println("1. Pengurutan Ascending");
        System.out.println("2. Pengurutan Descending");
        System.out.println("3. Cari Nilai");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                uts23.selectionSortAscending(data);
                System.out.println("Data setelah pengurutan ascending:");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
                // Meminta pengguna untuk memasukkan nilai yang dicari
                System.out.print("Masukkan nilai yang dicari setelah pengurutan ascending: ");
                int nilaiCariAscending = input.nextInt();
                uts23.cariNilai(data, nilaiCariAscending);
                break;
            case 2:
                uts23.selectionSortDescending(data);
                System.out.println("Data setelah pengurutan descending:");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                }
                System.out.println();
                // Meminta pengguna untuk memasukkan nilai yang dicari
                System.out.print("Masukkan nilai yang dicari setelah pengurutan descending: ");
                int nilaiCariDescending = input.nextInt();
                uts23.cariNilai(data, nilaiCariDescending);
                break;
            case 3:
                // Meminta pengguna untuk memasukkan nilai yang dicari
                System.out.print("Masukkan nilai yang dicari: ");
                int nilaiCari = input.nextInt();
                uts23.cariNilai(data, nilaiCari);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
