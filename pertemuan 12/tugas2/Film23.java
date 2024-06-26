package tugas2;

public class Film23 {
    int id;
    String judul;
    double rating;
    Film23 prev, next;

    Film23(Film23 prev, int id, String judul, double rate, Film23 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        rating = rate;
        this.next = next;
    }
}
