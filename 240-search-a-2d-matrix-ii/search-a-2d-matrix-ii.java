class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int startRow = 0;
        int startCol = matrix[0].length-1;

        while(startRow < matrix.length && startCol >= 0){
            if(matrix[startRow][startCol] > target){
                //move left <-
                startCol--;
            }
            else if(matrix[startRow][startCol] < target){
                startRow++;
            }
            else if(matrix[startRow][startCol] == target){
                return true;
            }
        }
        return false;
    }
}