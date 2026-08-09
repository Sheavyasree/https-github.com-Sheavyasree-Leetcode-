class Solution {
    public int[] countBits(int n) {
       int[] ans = new int[n+1];
       for(int i =0;i<ans.length;i++)
       {
        ans[i] = count(i);
       }
       return ans; 
    }
    public static int count(int n)
    {
        int count = 0;
        while(n>0)
        {
            int d= n%2;
            if(d==1)
            {
                count++;
            }
            n /=2;
        }
        return count;
    }
}