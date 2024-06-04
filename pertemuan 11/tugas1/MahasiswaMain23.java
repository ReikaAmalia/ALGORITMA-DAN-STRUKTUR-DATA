package tugas1;

public class MahasiswaMain23 {
    public static void main(String[] args) {

        MahasiswaLinkedList23 linkedList = new MahasiswaLinkedList23();
        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAfter(113, 114, "Doni");
        linkedList.insertAt(4, 115, "Sari");

        linkedList.print();
    }
}