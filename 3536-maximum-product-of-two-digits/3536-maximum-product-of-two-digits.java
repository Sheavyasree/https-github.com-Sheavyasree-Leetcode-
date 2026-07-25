class Solution {
    public int maxProduct(int n) {
      int firstmax = 0;
      int secondmax = 0;
      while(n>0)
      {
        int d = n%10;
        if(d>=firstmax)
        {
            secondmax = firstmax;
            firstmax = d;
        }
        else if(d>secondmax)
        {
            secondmax = d;
        }
        n = n/10;
      }
      return firstmax * secondmax;  
    }
}