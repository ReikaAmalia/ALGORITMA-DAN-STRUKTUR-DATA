import java.util.Scanner;

public class Queue23main {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("---------------------------");

    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc23.nextInt();

        Queue23 Q = new Queue23(n);

        int pilih = 0;
        do {
            menu();
            pilih = sc23.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru : ");
                    int dataMasuk = sc23.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
