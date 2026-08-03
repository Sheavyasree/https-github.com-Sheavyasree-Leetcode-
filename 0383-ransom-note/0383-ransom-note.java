class Solution {
    public boolean canConstruct(String ransome, String magazine) {
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> r1 = new HashMap<>();
       for (char c : ransome.toCharArray()) 
       {
        r1.put(c, r1.getOrDefault(c, 0) + 1);
       }

       for (char c : magazine.toCharArray()) 
       {
        m1.put(c, m1.getOrDefault(c, 0) + 1);
       }
        for(int i=0;i<ransome.length();i++)
        {
            if((!m1.containsKey(ransome.charAt(i))) || (r1.get(ransome.charAt(i)) > m1.get(ransome.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}