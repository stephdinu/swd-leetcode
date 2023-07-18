public class Solution112 {
    // #112
    // Given the root of a binary tree and an integer targetSum,
    // return true if the tree has a root-to-leaf path
    // such that adding up all the values along the path equals targetSum.
    // A leaf is a node with no children.
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeafPathSum(root, targetSum, sum);
    }
    private boolean rootToLeafPathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            sum += root.val;
            if (sum == targetSum) {
                return true;
            }
        }
        return rootToLeafPathSum(root.left, targetSum, sum+root.val) || rootToLeafPathSum(root.right, targetSum, sum+root.val);
    }
}
