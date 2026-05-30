
class MajorityElementMooresAlg {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            candidate = (count == 0) ? num : candidate;
            // if (count == 0) {
            //     candidate = num;
            //}
            count += (num == candidate) ? 1 : -1;
            // If the current number is the same as the candidate, increment count; otherwise, decrement count.
            //normal code
            // if (num == candidate) {
            //     count++; 
            // } else {
            //     count--;
            //}
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElementMooresAlg solution = new MajorityElementMooresAlg();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums)); // Output: 2
    }
}
