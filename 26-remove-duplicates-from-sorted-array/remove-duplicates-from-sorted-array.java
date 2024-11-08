class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(set.add(nums[i])){
                nums[k] = nums[i];
            k++;
        } }
        return k;
    }
}