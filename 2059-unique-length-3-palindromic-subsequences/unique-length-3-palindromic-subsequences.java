class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashSet<Character> leftSet = new HashSet<>();
        int[] rightFreq = new int[26];
        
        // Count frequency of characters to the right of the first character
        for (int i = 0; i < n; i++) {
            rightFreq[s.charAt(i) - 'a']++;
        }
        
        // Track unique palindromes
        HashSet<String> uniquePalindromes = new HashSet<>();
        
        // Iterate through the string
        for (int i = 0; i < n; i++) {
            char midChar = s.charAt(i);
            rightFreq[midChar - 'a']--; // Remove current character from the right
            
            // Check for palindromes
            for (char leftChar : leftSet) {
                if (rightFreq[leftChar - 'a'] > 0) {
                    uniquePalindromes.add("" + leftChar + midChar + leftChar);
                }
            }
            
            // Add the current character to the left set
            leftSet.add(midChar);
        }
        
        return uniquePalindromes.size();  
    }
}