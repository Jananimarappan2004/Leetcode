class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
     int[] prefixSum = new int[words.length];
        
        prefixSum[0] = (set.contains(words[0].charAt(0)) && set.contains(words[0].charAt(words[0].length() - 1))) ? 1 : 0;
        for (int i = 1; i < words.length; i++) {
            // Corrected the code to add the integer value (0 or 1) instead of a boolean
            prefixSum[i] = prefixSum[i - 1] + 
                           ((set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) ? 1 : 0);
        }
        // Process each query
        for (int[] query : queries) {
            int li = query[0];
            int ri = query[1];
            
            // Get the count of valid words in range [li, ri]
            int count = prefixSum[ri] - (li > 0 ? prefixSum[li - 1] : 0);
            list.add(count);  // Add the result to the list
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
          arr[i] = list.get(i);
        }
        return arr;
    }
}