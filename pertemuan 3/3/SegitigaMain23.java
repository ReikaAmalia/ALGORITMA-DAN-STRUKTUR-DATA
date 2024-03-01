public class SegitigaMain23 {
public static void main(String[] args) {
    Segitiga23[] sgArray = new Segitiga23[4];

    sgArray[0] = new Segitiga23(10, 4);
    sgArray[1] = new Segitiga23(20, 10);
    sgArray[2] = new Segitiga23(15, 6);
    sgArray[3] = new Segitiga23(25, 10);

    for (int i = 0; i < sgArray.length; i++) {
        System.out.println("sgArray ke-" + i + " alas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
        System.out.println("Luas: " + sgArray[i].hitungLuas());
        System.out.println("Keliling: " + sgArray[i].hitungKeliling());
        System.out.println();
    }
}
}