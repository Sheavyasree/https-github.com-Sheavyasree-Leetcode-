class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                if(!stk.isEmpty())
                {
                    res.append(c);
                }
                stk.push(c);
            }
            else
            {
                stk.pop();
                if(!stk.isEmpty())
                {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}