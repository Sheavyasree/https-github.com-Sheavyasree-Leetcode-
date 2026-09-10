class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        int max = 0;
        for(int i =0;i<gain.length;i++)
        {
            prefix[i] = max;
            max +=gain[i];
        }
        prefix[gain.length] = max;
        max = 0;
        for(int n : prefix)
        {
            max = Math.max(n,max);
        } 
        return max;
    }
}