class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String s1 = check(coordinate1);
        String s2 = check(coordinate2);
        return s1.equals(s2);
    }
    public static String check(String s)
    {
        if(s.charAt(0)=='a' || s.charAt(0)=='c' || s.charAt(0)=='e' || s.charAt(0)=='g')
        {
            if(s.charAt(1)%2==0)
            {
                return "Black";
            }
            else
            {
                return "White";
            }
        }
        else
        {
             if(s.charAt(1)%2!=0)
            {
                return "Black";
            }
            else
            {
                return "White";
            }
        }
    }
}