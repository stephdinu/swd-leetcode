public class Solution110 {
    // #110
    // Given a binary tree, determine if it is height-balanced.
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (checkHeight(root) == -1) {
            return false;
        }
        return true;
    }
    private int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
