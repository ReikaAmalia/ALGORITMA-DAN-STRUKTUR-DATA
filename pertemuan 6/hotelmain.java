public class hotelmain {
    public static void main(String[] args) {
        hotelservice23 listHotel = new hotelservice23();
        hotel23 h1 = new hotel23("Hotel Rere", "Malang", 1000000000, (byte) 5);
        hotel23 h2 = new hotel23("Hotel Jumbi", "Ponorogo", 34000, (byte) 5);
        hotel23 h3 = new hotel23("Hotel Kisatria", "Yogyakarta", 100000000, (byte) 6);
        hotel23 h4 = new hotel23("Hotel Mewah", "Malang", 9000000, (byte) 5);
        hotel23 h5 = new hotel23("Hotel Reika", "Malang", 1000000000, (byte) 5);
        hotel23 h6 = new hotel23("Hotel Amalia", "Malang", 4000000, (byte) 5);

        listHotel.tambah(h1);
        listHotel.tambah(h2);
        listHotel.tambah(h3);
        listHotel.tambah(h4);
        listHotel.tambah(h5);
        listHotel.tambah(h6);

        System.out.println("----------------------------");
        System.out.println("DATA HOTEL");
        System.out.println("----------------------------");
        listHotel.tampilAll();

        System.out.println("----------------------------");
        System.out.println("BERDASARKAN HARGA");
        System.out.println("----------------------------");
        listHotel.bubbleSortHarga();
        listHotel.tampilAll();

        System.out.println("----------------------------");
        System.out.println("BERDASARKAN BINTANG ");
        System.out.println("----------------------------");
        listHotel.selectionSortBintang();
        listHotel.tampilAll();

    }
}