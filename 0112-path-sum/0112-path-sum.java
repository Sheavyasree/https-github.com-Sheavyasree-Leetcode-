/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<Integer>  s  = new LinkedList<>();

        if (root==null)
        {
            return false;
        }

        q1.add(root);
        s.add(root.val);

        while(!q1.isEmpty())
        {
            TreeNode node = q1.poll();
            int currentSum = s.poll();
            if(node.left==null && node.right==null )
            {
                if(currentSum==targetSum)
                {
                    return true;
                }
            }
            if(node.left!=null)
            {
                q1.add(node.left);
                s.add(currentSum+node.left.val);
            }
             if(node.right!=null)
            {
                q1.add(node.right);
                s.add(currentSum+node.right.val);
            }
        }
        return false;
    }
}