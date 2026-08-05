class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] c = s.toCharArray();
        for(int i =0;i<c.length-1;i++)
        {
            int a = c[i]-'0';
            int b = c[i+1]-'0';
            int diff = Math.abs(a-b);
            if(diff>2)
            {
                return false;
            }
        }
        return true;
    }
}