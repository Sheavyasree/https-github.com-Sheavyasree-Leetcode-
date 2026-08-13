class Solution {
    public String simplifyPath(String path) {
       Stack<String> a = new Stack<>();
       String[] arr = path.split("/");

       for(String str : arr)
       {
        if(str.equals("") || str.equals("."))
        {
            continue;
        }
        else if(str.equals(".."))
        {
            if(!a.isEmpty())
            {
                a.pop();
            }
        }
        else
        {
            a.push(str);
        }
       } 
       if(a.isEmpty())
       {
        return "/";
       } 
       StringBuilder res = new StringBuilder();
       for(String s: a)
       {
        res = res.append("/").append(s);
       } 
       return res.toString();     
    }
}