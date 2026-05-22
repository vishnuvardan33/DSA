
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class triplets {
    //own code
    //public static void triplet(int arr[]) {
    //    for (int i = 0; i < arr.length; i++) {
    //        for (int j = i + 1; j < arr.length; j++) {
    //            for (int k = j + 1; k < arr.length; k++) {
    //                if ((arr[i] + arr[j] + arr[k] == 0) && (arr[i] != arr[j]) && (arr[i] != arr[k]) && (arr[j] != arr[k])) {
    //                    System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
    //                    break;
    //                }
    //
    //}
    //        }
    //    }
    //}

    //public static void main(String[] args) {
    //    int arr[] = {-1, 0, 1, 2, -1, -4};
    //    triplet(arr);
    //}
    //apna college
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet); // Sort the triplet to avoid duplicates
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result)); // Remove duplicate triplets
        return result;
    }

    public static void main(String[] args) {
        triplets solution = new triplets();
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = solution.threeSum(arr);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
