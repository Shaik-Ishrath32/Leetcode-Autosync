class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int duplicate = -1;
        int missing = 1; // default
        
        // Step 1: Find duplicate
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i+1]) {
                duplicate = nums[i];
            }
        }
        
        // Step 2: Find missing
        int expected = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == expected) {
                expected++;
            } else if (nums[i] > expected) {
                missing = expected;
                break;
            }
        }
        if (expected <= n) {
            missing = expected;
        }
        
        return new int[]{duplicate, missing};
    }
}