class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int xval=x;
       if(x<0){
        return false;
       }
       while(x>0){
        int r=x%10;
         rem=rem*10+r;
        x=x/10;
       }
        return rem==xval;
    }
    
}
 