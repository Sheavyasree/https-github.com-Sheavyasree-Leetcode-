class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos.add(nums[i]);
            }
            else
            {
                neg.add(nums[i]);
            }
        }

        int p = pos.size();
        int n = neg.size();
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0  && k<p)
            {
                nums[i] = pos.get(k);
                k++;
            }
            else if(i%2!=0 && j<n)
            {
                nums[i]  = neg.get(j);
                j++;
            }
            else 
            {
                continue;
            }
        }
        return nums;
    }
}