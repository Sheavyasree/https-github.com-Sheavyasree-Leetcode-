class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c =='(' || c =='[' || c =='{')
            {
                res.push(c);
            }
            else if(c == ')' || c == ']' || c == '}')
            {
                if(res.isEmpty())
                {
                    return false;
                }
               char top = res.peek();
               if((c==')' && top != '(') || (c==']' && top != '[') || (c=='}' && top != '{'))
               {
                   return false;
               }
               res.pop();
            }
        }
        return res.isEmpty();
    }
}