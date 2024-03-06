public class Fungsi23 {
    public static void main(String[] args) {
        int[][] stock = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] harga = { 75000, 50000, 60000, 10000 };
        int[] penguranganStock = { -1, -2, 0, -5 };

        hitungPendapatan(stock, harga);
        hitungJumlahStock(stock);
        hitungPenguranganStock(stock, penguranganStock);
    }

    public static void hitungPendapatan(int[][] stock, int[] harga) {
        System.out.println("1. Pendapatan Setiap Cabang Jika Semua Bunga Terjual");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan Cabang " + (i + 1) + ": " + totalPendapatan);
        }
    }

    public static void hitungJumlahStock(int[][] stock) {
        System.out.println("2. Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden");
        for (int j = 0; j < stock[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStock += stock[i][j];
            }
            System.out.println("Stock " + (j + 1) + ": " + totalStock);
        }
    }

    public static void hitungPenguranganStock(int[][] stock, int[] penguranganStock) {
        System.out.println("3. Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden setelah Pengurangan Stock");
        for (int j = 0; j < stock[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStock += stock[i][j];
            }
            totalStock += penguranganStock[j]; // Penambahan pengurangan stock
            System.out.println("Stock " + (j + 1) + ": " + totalStock);
        }
    }
}