class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = nums[0];
       int max = -1;
       HashSet<Integer> n = new HashSet<>();
       for(int i =0;i<nums.length;i++)
       {
        n.add(nums[i]);
        if(nums[i]>max)
        {
            max = nums[i];
        }
        if(nums[i]<min)
        {
            min = nums[i];
        }
       } 
       ArrayList<Integer> o = new ArrayList<>();
       for(int i =min;i<=max;i++)
       {
         o.add(i);
       }
       ArrayList<Integer> res = new ArrayList<>();
       for(int i=0;i<o.size();i++)
       {
        if(!n.contains(o.get(i)))
        {
            res.add(o.get(i));
        }
       }
       return res;
    }
}