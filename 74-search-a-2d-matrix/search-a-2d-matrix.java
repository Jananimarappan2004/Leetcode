class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       // int flag=0;
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;//flag=1;
                }
            }
          //  if(flag==1){
               // return true;
            }
           // else{
               return false;
           // }
     //   }
       // return false;
    }
}