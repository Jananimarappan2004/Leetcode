class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int count = 0;
        int i;

        for (i = 0; i < n - 1; i++) {
            if (nums[i] != 0) {
                if (nums[i] == nums[i + 1]) {
                    dp[count] = nums[i] * 2; 
                    i++; 
                } else {
                    dp[count] = nums[i];
                }
                count++;
            }
        }

        // Handle the last element if not processed
        if (i < n) {
            dp[count] = nums[n - 1];
        }

        return dp;
    }
}
