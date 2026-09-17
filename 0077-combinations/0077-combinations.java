class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr = new ArrayList<>();
        backtrack(1,n,k,curr);
        return sol;
    }
    public void backtrack(int start, int n,int k, List<Integer> curr)
    {
        if(curr.size()==k)
        {
            sol.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start;i<=n;i++)
        {
            curr.add(i);
            backtrack(i+1,n,k,curr);
            curr.remove(curr.size()-1);
        }
    }
}