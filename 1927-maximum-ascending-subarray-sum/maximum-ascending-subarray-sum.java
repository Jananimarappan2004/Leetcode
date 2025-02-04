class Solution {
    public int maxAscendingSum(int[] nums) {
     ArrayList<Integer> list = new ArrayList<>();
     if(nums.length == 1){
        return nums[0];
     }
     for(int i=0; i<nums.length; i++){
        int sum = nums[i];
        int maxSum =0;
        for(int j=i; j<nums.length-1; j++){
            if(maxSum < sum){
                maxSum+= sum;
            }
            if(nums[j] < nums[j+1]){
                maxSum+=nums[j+1];
            }
            else{
                break;
            }
        }
        list.add(maxSum);
}
       return Collections.max(list);
    }
}