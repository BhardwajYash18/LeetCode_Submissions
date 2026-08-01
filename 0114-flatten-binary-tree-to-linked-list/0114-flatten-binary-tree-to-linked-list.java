class Solution {
    List<TreeNode> li = new ArrayList<>();
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;
        preorder(root);
        for (int i = 0; i < li.size() - 1; i++) {
            TreeNode curr = li.get(i);
            TreeNode next = li.get(i + 1);

            curr.left = null;
            curr.right = next;
    
        }

        TreeNode last = li.get(li.size() - 1);
        last.left = null;
        last.right = null;
        
    }
    private void preorder(TreeNode root) {
        if (root == null) return;
        li.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}