class Solution {
    public int maxArea(int[] height) {
int maxArea =0;
int left =0;
int currentArea = 0;
int right = height.length-1;
while(left<right){
    int currentHeight = Math.min(height[left],height[right]);
    int currentWidth = right-left;
     currentArea = currentHeight * currentWidth;
  

     maxArea=Math.max(maxArea,currentArea);
       
       if(height[left]>height[right]){
        right--;
    }
        else{
            left++;
        }
    } return maxArea;
}
}
