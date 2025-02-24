class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums,target,left,right);
        
    }
    public static int binarySearch(int nums[], int target, int left, int right){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid] < target){
                return binarySearch(nums,target,mid+1,right);
            }
            else if(nums[mid] > target){
                return binarySearch(nums,target,left,mid-1);
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}