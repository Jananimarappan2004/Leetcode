class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> reslist = new ArrayList<>();
        Set<String> resultSet = new HashSet<>();
        
        // Iterate through each word in the words array
        for (int i = 0; i < words.length; i++) {
            // Check against all other words to see if the current word is a substring of any
            for (int j = 0; j < words.length; j++) {
                // Skip comparing the word with itself
                if (i != j && words[j].contains(words[i])) {
                    resultSet.add(words[i]);
                    break; // Once we find a match, no need to check further for this word
                }
            }
        }
        
        // Convert the result set back to a list
        reslist.addAll(resultSet);
        return reslist;
    }
}