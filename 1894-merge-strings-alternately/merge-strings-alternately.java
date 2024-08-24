class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int c=0;
        for(int index=0;index < word1.length() && index< word2.length();index++){
            res=res+word1.charAt(index);
            res=res+word2.charAt(index);
            c=index+1;
        }
         // for(int index=0;index < word1.length() && index< word2.length();index++){
            while(c < word1.length()){
                res=res+word1.charAt(c);
                c++;
            }
         // }
        // for(int index=0;index < word1.length() && index< word2.length();index++){
               while(c < word2.length()){
                res=res+word2.charAt(c);
                c++;
               }

                   return res;
              }
   
    }
