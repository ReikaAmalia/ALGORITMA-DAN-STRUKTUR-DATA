import java.util.Scanner;

public class GraphMain23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph23 gedung = new Graph23(6);

        while (true) {
            System.out.println("\nMenu Program:");
            System.out.println("a) Add Edge");
            System.out.println("b) Remove Edge");
            System.out.println("c) Degree");
            System.out.println("d) Print Graph");
            System.out.println("e) Cek Edge");
            System.out.println("x) Keluar");

            System.out.print("Pilih menu: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "a":
                    System.out.print("Masukkan gedung asal: ");
                    int asalA = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanA = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarakA = sc.nextInt();
                    gedung.addEdge(asalA, tujuanA, jarakA);
                    break;
                case "b":
                    System.out.print("Masukkan gedung asal: ");
                    int asalB = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanB = sc.nextInt();
                    gedung.removeEdge(asalB, tujuanB);
                    break;
                case "c":
                    System.out.print("Masukkan gedung: ");
                    int gedungC = sc.nextInt();
                    gedung.degree(gedungC);
                    break;
                case "d":
                    gedung.printGraph();
                    break;
                case "e":
                    System.out.print("Masukkan gedung asal: ");
                    int asalE = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanE = sc.nextInt();
                    boolean tetangga = gedung.cekTetangga(asalE, tujuanE);
                    char gedungAsal = (char) ('A' + asalE);
                    char gedungTujuan = (char) ('A' + tujuanE);
                    if (tetangga) {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
                    } else {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
                    }
                    break;
                case "x":
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
            sc.nextLine(); 
        }
    }
}