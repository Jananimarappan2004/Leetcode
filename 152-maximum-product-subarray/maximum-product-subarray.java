class Solution {
    public int maxProduct(int[] nums) {
        //kudanes algorithm
        int res = nums[0];
        int maxProdSubArray = nums[0];
        int minProdSubArray = nums[0];
        for(int i =1; i<nums.length; i++){
            int tempMax = maxProdSubArray;
            maxProdSubArray = Math.max(nums[i],Math.max(maxProdSubArray * nums[i], minProdSubArray * nums[i]));
            minProdSubArray = Math.min(nums[i],Math.min(tempMax * nums[i], minProdSubArray * nums[i]));
            res = Math.max(res, maxProdSubArray);
        }
        return res;
    }
}