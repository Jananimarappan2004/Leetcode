class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
 
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                  count++;
                }
            }
            if(count==1){
                number = nums[i];
            }
        }
         return number;
        
    }
}
