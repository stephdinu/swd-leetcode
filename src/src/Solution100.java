public class Solution100 {
    // #100
    // Given the roots of two binary trees p and q,
    // write a function to check if they are the same or not.
    // Two binary trees are considered the same
    // if they are structurally identical,
    // and the nodes have the same value.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
