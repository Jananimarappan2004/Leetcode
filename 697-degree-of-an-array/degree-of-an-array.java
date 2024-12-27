class Solution {
    public int findShortestSubArray(int[] nums) {
        int max = 0;  // This will store the degree of the array (max frequency)
        int minLength = nums.length;  // Initialize minLength to the largest possible length
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        
        // Iterate to fill the frequency map, first and last occurrences
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            if (!firstOccurrence.containsKey(num)) {
                firstOccurrence.put(num, i);  // Record first occurrence
            }
            lastOccurrence.put(num, i);  // Update last occurrence
        }

        // Iterate over frequency map to find the smallest subarray for the degree
        for (int num : frequency.keySet()) {
            int count = frequency.get(num);
            if (count > max) {
                max = count;
                minLength = lastOccurrence.get(num) - firstOccurrence.get(num) + 1;
            } else if (count == max) {
                minLength = Math.min(minLength, lastOccurrence.get(num) - firstOccurrence.get(num) + 1);
            }
        }

        return minLength;
    }
}
