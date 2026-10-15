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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int n = queue.size();
            int sum = 0;
            for(int i =0;i<n;i++)
            {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            if(maxSum<sum)
            {
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}