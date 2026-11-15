class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1, top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length-1;

        while(top <= bottom){
            int m = (top + bottom) / 2;
            if(matrix[m][left] <= target && matrix[m][right] >= target){
                row = m;
                break;
            }else if(matrix[m][left] > target){
                bottom = m-1;
            }else{
                top = m+1;
            }
        }

        if(row == -1) return false;

        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
