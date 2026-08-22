class Solution {
    public boolean checkDivisibility(int n) {
       int N = n;
       int sum = 0;
       int product = 1;
       while(N>0)
       {
        int d = N%10;
        sum += d;
        product *=d;
        N /= 10;
       }
       int add = sum+product;
       return n%add==0;
    }
}