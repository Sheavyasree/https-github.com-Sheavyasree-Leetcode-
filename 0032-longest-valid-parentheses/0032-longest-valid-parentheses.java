class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> res = new Stack<>();
        int length = 0;
        int maxLen = 0;
        char[] ch = s.toCharArray();
        res.push(-1);
        for(int i =0;i<s.length();i++)
        {
            char c = ch[i];
            if(c=='(')
            {
                res.push(i);
            }
            else
            {
                res.pop();
                if(res.isEmpty())
                {
                    res.push(i);
                }
                else
                {
                    length = i-res.peek();
                    maxLen = Math.max(maxLen, length);
                }
            }
        }
        return maxLen;  
    }
}