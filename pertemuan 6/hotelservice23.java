public class hotelservice23 {
    hotel23[] listHotel = new hotel23[6];
    int idx;

    void tambah(hotel23 h) {
        if (idx < listHotel.length) {
            listHotel[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (hotel23 h : listHotel) {
            h.tampilAll();
            System.out.println("============================");
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            for (int j = 1; j < listHotel.length - i; j++) {
                if (listHotel[j].harga > listHotel[j - 1].harga) {
                    hotel23 tmp = listHotel[j];
                    listHotel[j] = listHotel[j - 1];
                    listHotel[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listHotel.length; j++) {
                if (listHotel[j].bintang < listHotel[idxMin].bintang) {
                    idxMin = j;
                }
            }

            hotel23 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }

}