class Solution {
    public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    String res = "true";
    for(int i= 0; i<= str.length()/2; i++){
        int j= str.length()-1-i;
        if(str.charAt(i) != str.charAt(j)){
              res="false";
        }
    }
    if(res.equals("true")){
        return true;
    }
    return false;
    }
}