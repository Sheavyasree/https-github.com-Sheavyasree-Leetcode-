class Solution {
    public boolean squareIsWhite(String c) {
        if(c.charAt(0)=='a' || c.charAt(0)=='c' || c.charAt(0)=='e' || c.charAt(0)=='g')
        {
            if((int)c.charAt(1)%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(c.charAt(0)=='b' || c.charAt(0)=='d' || c.charAt(0)=='f' || c.charAt(0)=='h')
        {
            if((int)c.charAt(1)%2==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}