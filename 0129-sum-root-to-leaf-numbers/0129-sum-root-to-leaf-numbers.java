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
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();

        int totalSum = 0;
        
        queue.add(root);
        sum.add(root.val);
       
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            int currentSum = sum.poll();
            if(node.left == null && node.right==null)
            {
                totalSum +=currentSum;
            }
            if(node.left != null)
            {
                queue.add(node.left);
                sum.add(currentSum*10+node.left.val);
            }
            if(node.right != null)
            {
                queue.add(node.right);
                sum.add(currentSum*10+node.right.val);
            }
        }
        return totalSum;
    }
}