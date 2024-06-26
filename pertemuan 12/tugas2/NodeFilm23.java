package tugas2;

public class NodeFilm23 {

    int data;
    NodeFilm23 prev, next;

    NodeFilm23(NodeFilm23 prev, int data, NodeFilm23 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}