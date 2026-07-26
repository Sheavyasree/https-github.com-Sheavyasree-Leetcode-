class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length<3)
        {
            return -1;
        }
        if(nums.length==3)
        {
            return nums[0]*nums[1]*nums[2];
        }
        Arrays.sort(nums);
        int fmax = nums[nums.length-1];
        int smax = nums[nums.length-2];
        int tmax = nums[nums.length-3];
        int fmin = nums[0];
        int smin = nums[1];
        return Math.max(fmax*smax*tmax, fmax*fmin*smin);
    }
}