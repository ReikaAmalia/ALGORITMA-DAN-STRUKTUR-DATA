import java.util.Scanner;

public class queuee23main {

    public static void menu() {
        System.out.println("Pilih menu :");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Keluar");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc23.nextInt();

        queue Q = new queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc23.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sa.nextLine();
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sa.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc23.nextInt();
                    System.out.print("Saldo : ");
                    int saldo = sc23.nextInt();
                    nasabah23 nb = new nasabah23(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    nasabah23 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}