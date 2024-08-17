class Solution {

public String shortestPalindrome(String s) {
    if(s.equals("")){
        return "";
    }
    int i=0,j;
    int c=0;
    for(j=s.length()-1;j>=0;j--)
    {
        if(isPalindrome(s,0,j))
        {
            c=j;
            break;
        }
    }
        StringBuffer sb = new StringBuffer();
        for( i=s.length()-1;i>c;i--){
            sb.append(s.charAt(i));
        }
        sb.append(s);
        return sb.toString();
    }

    public  boolean isPalindrome(String s,int start,int end){
        while(start<=end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
            start++;
            end--;
        }
        return true;
    }
}