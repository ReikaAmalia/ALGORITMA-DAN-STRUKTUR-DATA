public class uts23 {

    // Fungsi pengurutan Selection Sort ascending
    public static void selectionSortAscending(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // Memindahkan elemen minimum ke posisi akhir (tanpa swap)
            int temp = data[minIndex];
            for (int k = minIndex; k > i; k--) {
                data[k] = data[k - 1];
            }
            data[i] = temp;
        }
    }

    // Fungsi pengurutan Selection Sort descending
    public static void selectionSortDescending(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Memindahkan elemen minimum ke posisi akhir (tanpa swap)
            int temp = data[maxIndex];
            for (int k = maxIndex; k > i; k--) {
                data[k] = data[k - 1];
            }
            data[i] = temp;
        }
    }

    // Fungsi pencarian data
    public static void cariNilai(int[] data, int nilaiCari) {
        int indexAwal = cariIndex(data, nilaiCari);
        System.out.println("\nNilai " + nilaiCari + " ditemukan pada indeks awal: " + indexAwal);

        // Melakukan pengurutan ascending
        selectionSortAscending(data);

        // Mencari nilai setelah pengurutan ascending
        int indexAscending = cariIndex(data, nilaiCari);
        System.out.println(
                "Nilai " + nilaiCari + " ditemukan pada indeks setelah pengurutan ascending: " + indexAscending);

        // Melakukan pengurutan descending
        selectionSortDescending(data);

        // Mencari nilai setelah pengurutan descending
        int indexDescending = cariIndex(data, nilaiCari);
        System.out.println(
                "Nilai " + nilaiCari + " ditemukan pada indeks setelah pengurutan descending: " + indexDescending);
    }

    // Fungsi pencarian data (tanpa perubahan)
    public static int cariIndex(int[] data, int nilaiCari) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiCari) {
                return i;
            }
        }
        return -1; // Nilai tidak ditemukan
    }
}