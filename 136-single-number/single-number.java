class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
        int count;
        
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++; // Count occurrences of nums[i]
                }
            }
            if (count == 1) { // If it appears only once, return it
                return nums[i];
            }
        }
        return number; // This will never execute for valid input
    }
}
