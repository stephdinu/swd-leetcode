public class Solution104 {
    // #104
    // Given the root of a binary tree, return its maximum depth.
    // A binary tree's maximum depth is the number of nodes along
    // the longest path from the root node down to the farthest leaf node.
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return depth;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
