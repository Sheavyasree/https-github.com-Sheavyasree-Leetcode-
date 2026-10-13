class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(int n:nums)
        {
            if(map.get(n)==1)
            {
                res[j++]=n;
            }
            if(j==2)
            {
                break;
            }
        }
        return res;
    }
}