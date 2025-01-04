class Solution {
    public int countPalindromicSubsequence(String s) {
      int n = s.length();
        int result = 0;
        
        // Iterate over all lowercase characters as potential middle characters
        for (char middle = 'a'; middle <= 'z'; middle++) {
            int first = -1, last = -1;
            
            // Find the first and last occurrence of the middle character
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == middle) {
                    if (first == -1) {
                        first = i; // Set the first occurrence
                    }
                    last = i; // Update the last occurrence
                }
            }
            
            // If a valid range exists, count unique characters between first and last
            if (first != -1 && last != -1 && last > first + 1) {
                HashSet<Character> uniqueChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                result += uniqueChars.size(); // Add the count of unique characters
            }
        }
        
        return result;  
    }
}