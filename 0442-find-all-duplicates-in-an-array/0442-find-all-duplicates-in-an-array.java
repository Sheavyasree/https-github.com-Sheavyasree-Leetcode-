class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            set.add(n);
        }
        for(int i:set)
        {
            if(map.get(i)==2)
            {
                res.add(i);
            }
        }
        return res;
    }
}