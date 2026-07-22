class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> arr = new HashSet<>();
      for(int n:nums)
      {
        arr.add(n);
      }
      return arr.size() !=nums.length;
    }
}