class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //staircase searching
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m-1;

        while(row < n && col >= 0) {
            int el = matrix[row][col];
            if(el == target) return true;
            else if(el > target) col--;
            else row++;
        }

        return false;
    }
}