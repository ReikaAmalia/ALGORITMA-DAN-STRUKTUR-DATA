public class Mahasiswa23 {

    String nama, gender;
    int nim;
    double ipk;

    static double rataIPK(Mahasiswa23[] arrayMahasiswa) {
        double totalIPK = 0;
        for (Mahasiswa23 mhs : arrayMahasiswa) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / arrayMahasiswa.length;
    }
}