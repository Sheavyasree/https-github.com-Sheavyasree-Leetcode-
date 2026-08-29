class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(map.containsKey(i))
            {
                if(map.get(i)==2)
                {
                    result[0] = i;
                }
            }
            else
            {
                result[1] = i;
            }
        }
        return result;
    }
}