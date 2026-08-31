class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> ans = new ArrayList<>();
       for(int i =left;i<=right;i++)
       {
        if(isSelfDriven(i))
        {
            ans.add(i);
        }
       } 
       return ans;
    }
    public static boolean isSelfDriven(int n)
    {
        int x = n;
        while(n>0)
        {
            int d = n%10;
            if(d==0 || x%d !=0)
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}