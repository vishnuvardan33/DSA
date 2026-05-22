
import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6};
        Arrays.sort(arr); // Sort in ascending order
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder()); // Sort in descending order
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}
