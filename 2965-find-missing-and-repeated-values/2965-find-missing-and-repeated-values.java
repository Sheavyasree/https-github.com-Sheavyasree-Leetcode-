class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        int[] count = new int[totalElements + 1];
        for (int[] row : grid) {
            for (int val : row) {
                count[val]++;
            }
        }

        int[] res = new int[2]; 
        for (int i = 1; i <= totalElements; i++) 
        {
            if (count[i] == 2) 
            {
                res[0] = i; 
            } else if (count[i] == 0) 
            {
                res[1] = i; 
            }
        }

        return res;
    }
}