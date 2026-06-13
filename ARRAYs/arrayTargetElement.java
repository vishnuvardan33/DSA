
public class arrayTargetElement {
// Given an array of integers and a target value, return the index of the target value in the array. If the target value is not found in the array, return -1.
// Example 1:
// Input: nums = [1,2,3,4,5], target = 3
// Output: 2

    public static int targetElement(int nums[], int target) {
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
        System.out.println(targetElement(nums, target));
    }
}
