public class Solution111 {
    // #111
    // Given a binary tree, find its minimum depth.
    // The minimum depth is the number of nodes
    // along the shortest path from the root node
    // down to the nearest leaf node.
    // Note: A leaf is a node with no children.
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth == 0 || rightDepth == 0) {
            return leftDepth + rightDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
