class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> map1 = new HashSet<>();
       HashSet<Integer> map2 = new HashSet<>();
       for(int n : nums1)
       {
        map1.add(n);
       } 
       for(int n : nums2)
       {
        map2.add(n);
       } 
       ArrayList<Integer> res = new ArrayList<>();
       for(int n:map2)
       {
        if(map1.contains(n))
        {
            res.add(n);
        }
       }
       int[] result = new int[res.size()];
       for(int i=0;i<res.size();i++)
       {
        result[i] = res.get(i);
       }
       return result;
    }
}