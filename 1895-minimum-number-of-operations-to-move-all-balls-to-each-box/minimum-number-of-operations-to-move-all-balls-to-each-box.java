class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        int count = 0; // Number of balls encountered so far
        int operations = 0; // Cumulative operations

        // Left-to-right pass
        for (int i = 0; i < n; i++) {
            answer[i] += operations;
            count += boxes.charAt(i) - '0'; // Update the count of balls
            operations += count; // Add current count to operations
        }

        count = 0; // Reset count for the right-to-left pass
        operations = 0; // Reset cumulative operations

        // Right-to-left pass
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations;
            count += boxes.charAt(i) - '0'; // Update the count of balls
            operations += count; // Add current count to operations
        }

        return answer;
    }
}