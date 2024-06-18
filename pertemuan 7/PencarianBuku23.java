import java.util.ArrayList;

public class PencarianBuku23 {
    ArrayList<Buku23> listBuku = new ArrayList<>();

    public void tambah(Buku23 buku) {
        listBuku.add(buku);
    }

    public void tampil() {
        for (Buku23 buku : listBuku) {
            buku.tampilDataBuku();
            System.out.println("------------------------------------");
        }
    }

    public int FindSeqSearch(String kodeBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            if (listBuku.get(i).kodeBuku.equals(kodeBuku)) {
                return i;
            }
        }
        return -1;
    }

    public void Tampilposisi(String kodeBuku, int posisi) {
        if (posisi != -1) {
            System.out.println("Data buku dengan kode " + kodeBuku + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("Data buku dengan kode " + kodeBuku + " tidak ditemukan.");
        }
    }

    public void TampilData(String kodeBuku, int posisi) {
        if (posisi != -1) {
            listBuku.get(posisi).tampilDataBuku();
        }
    }

    public Buku23 FindBuku(String kodeBuku) {
        for (Buku23 buku : listBuku) {
            if (buku.kodeBuku.equals(kodeBuku)) {
                return buku;
            }
        }
        return null;
    }

    public void bubbleSort() {
        int n = listBuku.size();
        Buku23 temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (listBuku.get(j - 1).kodeBuku.compareTo(listBuku.get(j).kodeBuku) > 0) {
                    temp = listBuku.get(j - 1);
                    listBuku.set(j - 1, listBuku.get(j));
                    listBuku.set(j, temp);
                }
            }
        }
    }

    public int FindBinarySearch(String kodeBuku, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (listBuku.get(mid).kodeBuku.equals(kodeBuku)) {
                return mid;
            }

            if (listBuku.get(mid).kodeBuku.compareTo(kodeBuku) > 0) {
                return FindBinarySearch(kodeBuku, low, mid - 1);
            }

            return FindBinarySearch(kodeBuku, mid + 1, high);
        }

        return -1;
    }
}
