class Solution {
    public int maximumCount(int[] nums) {
        int ncount =0;
        int pcount =0;
        int result =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >0){
                pcount++;
            }
            if(nums[i]< 0){
                ncount++;
            }
           result = (ncount > pcount)? ncount: pcount;
        }

    return result;
}}