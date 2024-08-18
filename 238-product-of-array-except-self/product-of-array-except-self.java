class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []res = new int[nums.length];
        int lprod=1;
        for(int i=0;i<nums.length;i++){
            res[i]=lprod;
            lprod=lprod*nums[i];
        }
        int rprod=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*rprod;
            rprod=rprod*nums[i];
        }
        return res;
    }
}