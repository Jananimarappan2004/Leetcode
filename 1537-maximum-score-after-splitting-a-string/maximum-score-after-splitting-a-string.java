class Solution {
    public int maxScore(String s) {
         int rightOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }

        int leftZeros = 0;
        int maxScore = 0;

        // Iterate through each possible split (from 1 to s.length() - 1)
        for (int i = 0; i < s.length() - 1; i++) {
            // Update leftZeros and rightOnes as we move through the string
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            // Calculate score for the current split
            int score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}