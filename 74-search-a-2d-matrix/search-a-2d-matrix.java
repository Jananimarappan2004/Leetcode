class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Handle empty matrix case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Iterate through the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return true; // Target found
                }
            }
        }
        
        return false; // Target not found
    }
}
