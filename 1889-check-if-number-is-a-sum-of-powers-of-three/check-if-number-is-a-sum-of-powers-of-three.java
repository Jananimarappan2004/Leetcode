class Solution {
    public boolean checkPowersOfThree(int n) {
        int val =0;
        while(n>0){
            val = n%3;
            if(val ==2){
                return false;
            }
            n=n/3;
        }

            return true;
        
    }
}