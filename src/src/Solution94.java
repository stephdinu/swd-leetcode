import java.util.ArrayList;
import java.util.List;

public class Solution94 {
    // # 94
    // Given the root of a binary tree,
    // return the inorder traversal of its nodes' values.
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return result;
    }
    private void traverse(TreeNode root) {
        //base case
        if(root == null) {
            return;
        }
        traverse(root.left);
        result.add(root.val);
        traverse(root.right);
    }
}
