class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flagI = true;
        boolean flagD = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flagI = false;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                flagD = false;
            }
        }
        return flagI || flagD?true:false;
    }
}