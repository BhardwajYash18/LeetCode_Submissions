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
    private List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return result;
        }
        path(root, new StringBuilder());
        return result;
    }
    private void path(TreeNode root, StringBuilder sb) {
        int len = sb.length();
        if (sb.length() != 0){
            sb.append("->");
        }
        sb.append(String.valueOf(root.val));
        if (root.left == null && root.right == null) {
            result.add(sb.toString());
            sb.setLength(len);
            return;
        }

        else if (root.left == null){
            path(root.right, sb);
        }

        else if (root.right == null){
            path(root.left, sb);
        }
        
        else{
            path(root.left, sb);
            path(root.right, sb);
        }
        sb.setLength(len);
    }
}