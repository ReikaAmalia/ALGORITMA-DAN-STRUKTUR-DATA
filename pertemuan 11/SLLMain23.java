public class SLLMain23 {
    public static void main(String[] args) {
        SingleLinkedList23 singLL23 = new SingleLinkedList23();

        singLL23.print();
        singLL23.addFirst(890);
        singLL23.print();
        singLL23.addLast(760);
        singLL23.print();
        singLL23.addFirst(700);
        singLL23.print();
        singLL23.insertAfter(700, 999);
        singLL23.print();
        singLL23.insertAt(3, 833);
        singLL23.print();

        System.out.println("Data pada indeks 1e-1=" + singLL23.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL23.indexOf(760));

        singLL23.remove(999);
        singLL23.print();
        singLL23.removeAt(0);
        singLL23.print();
        singLL23.removeFirst();
        singLL23.print();
        singLL23.removeLast();
        singLL23.print();

    }
}