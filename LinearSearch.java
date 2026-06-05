
public class LinearSearch {
    // Linear Search works on unsorted arrays
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println(linearSearch(nums, target));
    }
}
