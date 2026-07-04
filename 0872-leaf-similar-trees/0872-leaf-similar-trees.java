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
    List<Integer> t1 = new ArrayList<>();
    List<Integer> t2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1,t1);
        helper(root2,t2);
        return t1.equals(t2);
    }

    private void helper(TreeNode root, List<Integer> li) {
        if (root == null ) return;
        helper(root.left,li);
        if (root.left == null && root.right == null) li.add(root.val);
        helper(root.right,li);
    }
}