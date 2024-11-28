class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxSubArray = nums[0];
        for(int i=1; i< nums.length; i++){
            maxSubArray = Math.max(maxSubArray+nums[i], nums[i]);
            res = Math.max(res, maxSubArray);
        }
        return res;
    }
}