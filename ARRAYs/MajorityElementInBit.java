
class MajorityElementInBit {

    public int majorityElement(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            if (count > n / 2) {
                ans |= (1 << bit);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MajorityElementInBit solution = new MajorityElementInBit();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums)); // Output: 2
    }
}
