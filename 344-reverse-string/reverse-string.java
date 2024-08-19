class Solution {
    public void reverseString(char[] s) {
        char []res=new char[s.length];
        for(int i=s.length-1;i>=0;i--){
            res[s.length-i-1]=s[i];
        }
      System.arraycopy(res,0,s,0,s.length);
}
}