class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int result = rotatedBinarySearch(nums, target, low, high);
        return result;
    }
     public int  rotatedBinarySearch(int [] nums, int target, int low, int high){
      if(low > high){
               return -1; // basecase
      }
      int mid = (low + high)/2;
      if(nums[mid] == target){
        return mid;
      }
      if(nums[low] <= nums[mid]){ // left sorted
        if((nums[low] <= target) && (target < nums[mid])){
           return rotatedBinarySearch(nums, target, low, mid-1);
        }
        else{
           return  rotatedBinarySearch(nums, target, mid+1, high);
        }
     }
     else{
        if(((nums[mid]) <= target) && (target <= nums[high])){
            return rotatedBinarySearch(nums, target, mid+1, high);
        }
        else{
           return rotatedBinarySearch(nums, target, low, mid-1);
        }
     }
}
 }