package answer;

public class LeetCode404 {
    int res;
    public int sumOfLeftLeaves(TreeNode root) {
        res=0;
        helper(root);
        return res;
    }
    private void helper(TreeNode root){
        if (root==null) return;
        if (root.left!=null){
            if (root.left.left==null&&root.left.right==null){
                res+=root.left.val;
            }
        }
        helper(root.left);
        helper(root.right);
    }
}
