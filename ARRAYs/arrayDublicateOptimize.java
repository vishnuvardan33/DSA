
import java.util.HashSet;

public class arrayDublicateOptimize {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                System.out.println("true");
                return;
            } else {
                set.add(nums[i]);
            }
        }
        System.out.println("false");
    }
}
