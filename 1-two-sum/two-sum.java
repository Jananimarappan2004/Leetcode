class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(nums[j]==target-nums[i]){
                return new int[]{i,j};
                }
        
            }
        }
        return null;
        }
    }
