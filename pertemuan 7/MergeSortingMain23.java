public class MergeSortingMain23 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("sorting dengan merge sort");
        MergeSorting23 mSort23 = new MergeSorting23();
        System.out.println("data awal");
        mSort23.printArray(data);
        mSort23.MergeSort23(data);
        System.out.println("setelah diurutkan");
        mSort23.printArray(data);
    }
}
