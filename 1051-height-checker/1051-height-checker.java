class Solution {
    public int heightChecker(int[] heights) {
       int[] a = (int[]) heights.clone();
       Arrays.sort(a);
       int c = 0;
       for(int i =0;i<a.length;i++)
       {
        if(a[i] != heights[i])
        {
            c++;
        }
       } 
       return c;
    }
}