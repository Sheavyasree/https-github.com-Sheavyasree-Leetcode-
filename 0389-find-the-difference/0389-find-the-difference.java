class Solution {
    public char findTheDifference(String s, String t) 
    {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < t.length(); i++) 
        {
            char c = t.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            counts.put(c, counts.get(c) - 1);
        }
        for (char c : counts.keySet()) 
        {
            if (counts.get(c) == 1) 
            {
                return c;
            }
        }
        
        return ' ';
    }
}
