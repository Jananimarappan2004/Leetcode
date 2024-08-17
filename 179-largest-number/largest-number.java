class Solution {
    public String largestNumber(int[] nums) {
     String str[] = new String[nums.length];
     for(int i=0;i<nums.length;i++){
        str[i]=String.valueOf(nums[i]);
     }
     for(int i=0;i<str.length;i++){
        for(int j=i+1;j<str.length;j++){
            String order1 = str[i]+str[j];
            String order2 = str[j]+str[i];
          if(order1.compareTo(order2)<0){
             String temp=str[i];
             str[i]=str[j];
             str[j]=temp;
          }
        }
     }
     StringBuffer sb= new StringBuffer();
     for(String num:str){
        sb.append(num);
     }
    if(sb.charAt(0)=='0'){
        return "0";
    }
      return sb.toString();
    }
}