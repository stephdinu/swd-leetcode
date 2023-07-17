public class Solution101 {
    // #101
    // Given the root of a binary tree,
    // check whether it is a mirror of itself
    // (i.e., symmetric around its center).
    public boolean isSymmetric(TreeNode root) {
        return root == null || symmetryCheck(root.left, root.right);
    }
    private boolean symmetryCheck(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        if(left.val != right.val) {
            return false;
        }
        return symmetryCheck(left.left, right.right) && symmetryCheck(left.right, right.left);
    }
}
