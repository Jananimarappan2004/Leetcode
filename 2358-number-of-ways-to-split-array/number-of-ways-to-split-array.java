class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long prefixSum = 0;
        int validSplits = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum += nums[i];
            long suffixSum = totalSum - prefixSum;
            if (prefixSum >= suffixSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}