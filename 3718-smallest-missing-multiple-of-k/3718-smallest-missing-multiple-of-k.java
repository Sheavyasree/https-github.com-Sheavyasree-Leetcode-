class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int i=1;
        int r = k*i;
        while(true)
        {
             r = k*i++;
            if(!set.contains(r))
            {
                return r;
            }
        }
    }
}