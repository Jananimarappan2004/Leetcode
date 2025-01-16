class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int x1 = 0, x2 = 0;
        if(a % 2 !=0){
            for(int num : nums2){
                x2 ^= num;
            }
        }
        if(b % 2!= 0){
            for(int num : nums1){
                x1^= num;
            }
        }
        return x1 ^ x2;
    }
}