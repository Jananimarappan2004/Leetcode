class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char []st=stones.toCharArray();
        char []je=jewels.toCharArray();
        int count=0;
        for(int i=0;i<je.length;i++){
            for(int k=0;k<st.length;k++){
                if(je[i]==st[k]){
                  count++;
                } 
            }
            
        }
        return count;
    }
}