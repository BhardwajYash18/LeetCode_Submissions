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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        int lvl = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i=0 ; i < levelSize ; i++) {
                TreeNode temp = q.poll();
                level.add(temp.val);
                
                if(temp.left != null) { 
                    q.offer(temp.left); 
                } 
                if(temp.right != null) { 
                    q.offer(temp.right); 
                }
            }
            if (lvl % 2 == 0) {
                Collections.reverse(level);
            }
            lvl++;
            res.add(level);
        }
        return res;
        
    }
}