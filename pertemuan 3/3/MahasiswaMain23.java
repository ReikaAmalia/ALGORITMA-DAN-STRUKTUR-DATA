import java.util.Scanner;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa23 arrayMahasiswa[] = new Mahasiswa23[3];
        for (int i = 0; i < 3; i++) {
            arrayMahasiswa[i] = new Mahasiswa23();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            arrayMahasiswa[i].nama = sc.next();
            System.out.print("Masukkan Nim: ");
            arrayMahasiswa[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            arrayMahasiswa[i].gender = sc.next();
            System.out.print("Masukkan IPK: ");
            arrayMahasiswa[i].ipk = sc.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + arrayMahasiswa[i].nama);
            System.out.println("Nim: " + arrayMahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + arrayMahasiswa[i].gender);
            System.out.println("IPK: " + arrayMahasiswa[i].ipk);
        }
        double rataRataIPK = Mahasiswa23.rataIPK(arrayMahasiswa);
        System.out.println("\nRata-rata IPK: " + rataRataIPK);
    }
    
}