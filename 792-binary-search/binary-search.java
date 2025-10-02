class Solution {
    public int search(int[] nums, int target) {
       int length = nums.length;
       int low = 0;
       int high = length -1;
       int result = binarySearch(nums, target, low, high);
       return result;
    }
       public int binarySearch(int [] nums, int target, int low, int high){
       int mid = (low + high)/2;
       if(low>high){
        return -1;
       }
       if(target == nums[mid]){
        return mid;
       } 
       else if(target < nums[mid]){
        return binarySearch(nums, target, 0, mid-1);
       }
       else{
        return binarySearch(nums, target,mid+1, high);
       }
       }
}