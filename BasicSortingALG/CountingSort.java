
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        countingSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
