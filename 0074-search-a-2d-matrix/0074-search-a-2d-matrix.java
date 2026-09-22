class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int midRow = mid / cols;
            int midCol = mid % cols;
            int midValue = matrix[midRow][midCol];
            if( midValue== target)
            {
                return true;
            }
            else if(midValue>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }
}