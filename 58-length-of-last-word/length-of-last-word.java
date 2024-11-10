class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String []ch = s.split(" ");
        int len = ch[ch.length-1].length();
        return len;
    }
}