import java.util.Scanner;

public class PersegiPanjangMain23 {
    public static void main(String[] args) {
    PersegiPanjang23[] ppArray = new PersegiPanjang23[3];
    
Scanner sc = new Scanner(System.in);
for(int i = 0; i < 3; i++)
{
    ppArray[i] = new PersegiPanjang23();
    System.out.println("Persegi panjang ke-" + i);
    System.out.print("Masukkan panjang: ");
    ppArray[i].panjang = sc.nextInt();
    System.out.print("Masukkan lebar: ");
    ppArray[i].lebar = sc.nextInt();
}

for(int i = 0; i < 3; i++)
{
    System.out.println("Persegi panjang ke-" + i);
    System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
    
}
    }
}

