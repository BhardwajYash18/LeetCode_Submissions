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
    int min = Integer.MAX_VALUE;
    List<Integer> arr = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        for (int i = 0 ; i < arr.size() - 1;i++) {
            min = Math.min(min,Math.abs(arr.get(i)-arr.get(i+1)));
        }
        return min;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}