class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int c=0;
        for(int index=0;index < word1.length() && index< word2.length();index++){
            res=res+word1.charAt(index);
            res=res+word2.charAt(index);
            c=index+1;
        }
        
            for(int i=c;i< word1.length();i++){
                res=res+word1.charAt(i);
              //  c++;
            }

               for(int i=c;i< word2.length();i++){
                res=res+word2.charAt(i);
              //  c++;
               }

                   return res;
              }
   
    }
